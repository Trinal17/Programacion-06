/**
 * 
 */
package list;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import modelo.Persona;

public class EjemploList {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // List<Persona> listaPersonas = new ArrayList<>();

        // LINKEDLIST: Si no tenemos una buena razón para usar linkedlist
        // En términos de funcionalidad no habría diferencia ninguna
        /*
         * La principal diferencia es un tema de implementación ArrayList
         * implementa la lista con arreglos linkeados, lo que la hace muy
         * eficiente para recorrer pero ineficiente para insertar o eliminar
         * elementos que se no encuentren en el final.
         * En cambio LinkedList es una lista de elementos linkeados
         * (en realidad es una lista doblemente enlazada) lo que la hace
         * lenta para recorrer pero sumamente eficiente para insertar
         * o eliminar elementos.
         * 
         * Por lo tanto ArrayList :
         * - usa internamente un arreglo dinámico para almacenar los elementos.
         * - proporciona una manipulación lenta
         * - es la mejor opción para almacenar y acceder a datos o elementos
         * consecutivos.
         * 
         * Por lo tanto LinkedList:
         * - proporciona una manipulación más rápida porque utiliza una lista doblemente
         * enlazada.
         * - se puede utilizar como lista y cola porque implementa interfaz de List,
         * Deque y Queue.
         * - es mejor para manipulación de elementos, es decir, para insertar y eliminar
         * elementos.
         * 
         * Por lo tanto si necesitamos agregar elementos consecutivos
         * y recorrerlos debemos utilizar ArrayList y si en cambio
         * necesitamos insertar y eliminar valores no consecutivos debemos usar
         * LinkedList.
         */

        List<Persona> listaPersonas = new LinkedList<>();

        listaPersonas.add(new Persona("12345678A", "Pepe", "Perez", LocalDate.of(1990, 1, 2)));
        listaPersonas.add(new Persona("23456789B", "Juan", "Martínez", LocalDate.of(1991, 2, 3)));
        listaPersonas.add(new Persona("34567890C", "Ana", "Ramírez", LocalDate.of(1992, 3, 4)));
        listaPersonas.add(new Persona("45678901D", "María", "López", LocalDate.of(1993, 4, 5)));

        // Recorrer la lista completa
        System.out.println("Listado completo de personas:");
        for (Persona per : listaPersonas)
            System.out.println(per);

        // Acceso posicional (3ª posición)
        Persona p = listaPersonas.get(2);
        System.out.println("\nPersona en tercera posición: " + p);

        // Añadir un nuevo elemento al final de la lista
        listaPersonas.add(new Persona("56789012E", "Julio", "Azcárate", LocalDate.of(1994, 5, 6)));

        // Añadir/modificar un elemento en medio de la lista. Cambio el elemento de la
        // posición 2 (sustituye Ana por Alfonso y Julio está al final)
        listaPersonas.set(2, new Persona("67890123F", "Alfonso", "García", LocalDate.of(1995, 6, 7)));

        // Añadir un objeto repetido
        listaPersonas.add(new Persona("56789012E", "Julio", "Azcárate", LocalDate.of(1994, 5, 6)));

        // Recorrer la lista completa
        System.out.println("\nNuevo listado de personas:");
        for (Persona per : listaPersonas)
            System.out.println(per);

        // Para ordenar, tenemos que aportar un orden
        // Será por fecha de nacimiento
        listaPersonas.sort(new Comparator<Persona>() {

            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getFechaNacimiento().compareTo(p2.getFechaNacimiento());
            }

        });

        // Recorremos la lista completa, ya ordenada
        System.out.println("\nListado de personas por fecha de nacimiento:");
        for (Persona per : listaPersonas)
            System.out.println(per);

        // ------------------------------------------------
        // BUSCAR
        // Quiero encontrar a Alfonso....
        System.out.println("* Buscar a persona:");
        Persona Alfonso = new Persona("67890123F", "Alfonso", "García", LocalDate.of(1995, 6, 7));
        System.out.println(Alfonso);

        //int pos = Collections.binarySearch(listaPersonas, Alfonso); // requisito que Persona implements Comparable

        // Comparator<Persona> byNombre = (pa, pb) -> pa.getNombre().compareTo(pb.getNombre());
        // Collections.sort(listaPersonas, byNombre);
        // int pos = Collections.binarySearch(listaPersonas, Alfonso, byNombre);

        //System.out.println("posición encontrada:" + pos);

        // BORRANDO OBJETOS (POR POSICIÓN)
        // if (pos >= 0)
        //     listaPersonas.remove(pos);

        // BORRANDO OBJETOS (EQUALS)
        listaPersonas.remove(Alfonso);


        System.out.println("\nLista actualizada tras borrar:");
        for (Persona per : listaPersonas)
            System.out.println(per);

    }

}
