package list;

import java.util.Comparator;

import modelo.Persona;

public class ComparatorByNombre implements Comparator <Persona>{

    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
    
}
