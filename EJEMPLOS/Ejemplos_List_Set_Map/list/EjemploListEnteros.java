package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EjemploListEnteros {
    public static void main(String[] args) {

        System.out.println("**************************************************");
        System.out.println("**EJEMPLOS DE ORDENACIÓN DE ARRAYLIST DE ENTEROS *");
        System.out.println("**************************************************");

        System.out.println("**************************************************");
        System.out.println("** ARRAYLIST ENTEROS 1 *");
        System.out.println("**************************************************");

        // Forma tradicional
        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(3);
        listInt.add(4);
        listInt.add(2);
        listInt.add(6);
        listInt.add(5);
        listInt.add(1);
        listInt.add(7);

        // Factory Methods para poder crear colecciones
        List<Integer> listInt2 = List.of(1,2,5,7,9,19);
        // Tengo que hacer casting si quiero un ArrayList en vez de un List
        ArrayList<Integer> listInt3 = (ArrayList<Integer>) List.of(1,2,5,7,9,19);

        System.out.println("* Lista de enteros no ordenada (for..)");
        for (Integer i : listInt2) {
            System.out.println(i);
        }

        System.out.println("* Lista de enteros no ordenada (forEach)");
        listInt2.forEach(System.out::println);

        System.out.println("* Lista de enteros no ordenada (->)");
        listInt2.forEach( i -> System.out.println(i));
        listInt2.forEach( (i) -> {
            System.out.println(i);
        });

        System.out.println("* Lista de enteros inversa:");
        Collections.reverse(listInt);
        listInt2.forEach(System.out::println);

        System.out.println("* Lista de enteros ordenada por defecto (ascendente):");

        System.out.println("\tForma 1: con Collections.sort");
        Collections.sort(listInt);
        listInt2.forEach(System.out::println);

        System.out.println("* Lista de enteros ordenada descendente:");
        // Forma 1
        System.out.println("\tForma 1: con Collections.sort");
        Collections.sort(listInt2, Comparator.reverseOrder());
        listInt2.forEach(System.out::println);

        // Forma 2
        System.out.println("\tForma 2 con sort del ArrayList");
        listInt2.sort(Comparator.reverseOrder());
        listInt2.forEach(System.out::println);

        System.out.println("**************************************************");
        System.out.println("** ARRAYLIST ENTEROS 2 *");
        System.out.println("**************************************************");

        List<Integer> listInt4 = Arrays.asList(4, 5, 1, 2, 8, 9, 6);

        // El resto igual .....

    }

}
