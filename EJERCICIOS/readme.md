# Ejercicio 1: expedición arqueológica

En una expedición arqueológica, un grupo de exploradores descubre una serie de artefactos antiguos. 

Sin embargo, muchos de los artefactos son duplicados y quieren eliminar las copias para mantener solo uno de cada tipo. 

Escribe un programa en Java que elimine los duplicados de la lista de artefactos encontrados.

Vas a partir de este código:

```
List<String> artefactos = new ArrayList<>();
        artefactos.add("Reloj antiguo");
        artefactos.add("Vaso de cerámica");
        artefactos.add("Reliquia de oro");
        artefactos.add("Reloj antiguo"); // Duplicado
        artefactos.add("Amuleto de plata");
        artefactos.add("Vaso de cerámica"); // Duplicado

        System.out.println("Artefactos antes de eliminar duplicados: " + artefactos);

        eliminarDuplicados(artefactos);

        System.out.println("Artefactos después de eliminar duplicados: " + artefactos);
```

Implementa el método eleminarDuplicados.


# Ejercicio 2: cola de supermercado

Crea una cola de supermercado. 

Aleatoriamente:
- 70% probabilidades un cliente nuevo se pone en la cola
- 30% un cliente de la cola ha sido atendido. 

Si la cola llega a tener 10 personas suena un mensaje por megafonía diciendo que, por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja. 

Que se vea por consola todo el proceso (cada vez que alguien entra o sale de la cola y el mensaje por megafonía).