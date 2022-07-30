import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) throws Exception {
        //      Set notas = new HashSet(); //antes do java 5
//      HashSet<Double> notas = new HashSet<>();
//      Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
/*      Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
        */
        
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: " +
        notas.stream().mapToDouble(Double::doubleValue).sum()) ;

        System.out.println("Exiba a MEDIA dos valores: " +
        notas.stream().mapToDouble(Double::doubleValue).average()) ;

        notas.remove(0d);

        Iterator<Double> iterator = notas.iterator();
        while (iterator.hasNext()){
            Double next = iterator.next();
            if (next < 7) iterator.remove();
        }

        System.out.println(notas);

        notas.clear();

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
    }


}