import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExercicioSet {
        public static void main(String[] args) throws Exception {
            //      Set notas = new HashSet(); //antes do java 5
    //      HashSet<Double> notas = new HashSet<>();
    //      Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
    /*      Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
            notas.add(1d);
            notas.remove(5d);
            System.out.println(notas);
            */
            
            Set<String> arcoIris = new HashSet<>(Arrays.asList("vermelho", "Laranja", "Amarelo", "Verde", "Azui", "Anil", "Violeta"));
            System.out.println(arcoIris.toString());

            System.out.println("Quantidade de cores: " + arcoIris.size());

            Iterator<String> iterator = arcoIris.iterator();
            while (iterator.hasNext()){
                String next = iterator.next();
                if (next.startsWith("V")){
                    System.out.println(next);
                }
                else{
                    iterator.remove();
                }
            }
            System.out.println("/**********/");
            System.out.println(arcoIris);

            arcoIris.clear();
            System.out.println("Esta vazio? " + arcoIris.isEmpty());
        }
}
