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

        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(3);
        listInt.add(4);
        listInt.add(2);
        listInt.add(6);
        listInt.add(5);
        listInt.add(1);
        listInt.add(7);

        System.out.println("* Lista de enteros no ordenada");
        listInt.forEach(System.out::println);

        System.out.println("* Lista de enteros inversa:");
        Collections.reverse(listInt);
        listInt.forEach(System.out::println);

        System.out.println("* Lista de enteros ordenada por defecto (ascendente):");
        // Forma 1
        System.out.println("\tForma 1: con Collections.sort");
        Collections.sort(listInt);
        listInt.forEach(System.out::println);

        // Forma 2
        System.out.println("\tForma 2 con sort del ArrayList");
        listInt.sort(Comparator.naturalOrder());
        listInt.forEach(System.out::println);

        System.out.println("* Lista de enteros ordenada descendente:");
        // Forma 1
        System.out.println("\tForma 1: con Collections.sort");
        Collections.sort(listInt, Comparator.reverseOrder());
        listInt.forEach(System.out::println);

        // Forma 2
        System.out.println("\tForma 2 con sort del ArrayList");
        listInt.sort(Comparator.reverseOrder());
        listInt.forEach(System.out::println);

        System.out.println("**************************************************");
        System.out.println("** ARRAYLIST ENTEROS 2 *");
        System.out.println("**************************************************");

        List<Integer> listInt2 = Arrays.asList(4, 5, 1, 2, 8, 9, 6);

        // El resto igual .....

    }

}
