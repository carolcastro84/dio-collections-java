import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) throws Exception {
    
    Set <Serie> minhasSeries= new HashSet<>(){{
        add(new Serie("GOT", "Fantasia",68));
        add(new Serie("TWD", "Futurista",50));
        add(new Serie("Modern Family", "Vida moderna",30));
        add(new Serie("The middle", "Vida moderna",30));
    }};

    System.out.println( minhasSeries);

    Set <Serie> minhasSeries1 = new TreeSet<>(minhasSeries);
    System.out.println( minhasSeries);

    

    }
    
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer duracao;

    public Serie(String nome, String genero, Integer duracao) {
        this.nome = nome;
        this.genero = genero;
        this.duracao = duracao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Integer getDuracao() {
        return duracao;
    }
    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }
    @Override
    public String toString() {
        return "Serie [duracao=" + duracao + ", genero=" + genero + ", nome=" + nome + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((duracao == null) ? 0 : duracao.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Serie other = (Serie) obj;
        if (duracao == null) {
            if (other.duracao != null)
                return false;
        } else if (!duracao.equals(other.duracao))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }
    @Override
    public int compareTo(Serie o) {
        return Integer.compare(this.getDuracao(), o.getDuracao());
    }

    
}