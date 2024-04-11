# ORDENACIÓN DE PRODUCTOS

## Objetivos

- Uso de clases, uso método toString() para mostrar datos. 

- Uso de arrays (ArrayList)  de objetos. 

- Argumentos por referencia.

- Uso de interfaces Comparable y Comparator. 

- Uso del **patrón DAO** para abstraer y encapsular todos los accesos a la fuente de datos.

## Problema a resolver

Nos piden hacer la lógica que podrá ordenar (por distintos parámetros) una colección de Prodcutos. 

Para esto completaremos la clase **Ordenaciones** que deberá tener tres métodos con las siguientes firmas: 

```

public ArrayList<Producto> ordenarAltoProducto(  ArrayList<Producto>   coleccion);
  

public ArrayList<Producto> ordenarAnchoProducto(  ArrayList<Producto>   coleccion);
  

public ArrayList<Producto> ordenarLargoProducto(  ArrayList<Producto>   coleccion); 
  
```

### La clase Producto

- Se ordenará por **criterio natural** por el atributo de **nombre**. 
- Es posible crear un Producto con el nombre, de forma que las medidas por defecto son las mínimas expresadas a continuación.
- Los datos del paquete no podrán ser modificados una vez creados.
- Todos los productos están empaquetados en cajas con medidas que no superan los siguientes límites: 

```
(Si se pasan valores superiores o inferiores se  truncará al valor mínimo o máximo)

Alto: desde 2 cm hasta 30 cm 

Ancho: desde 2 cm hasta 10 cm 

Largo: desde 2 cm hasta 10 cm 
```

Podremos **ordenar los productos** por cualquiera de estas tres medidas, siempre de mayor a menor. 


### Pruebas

Mostraremos el catálogo de productos:

- ordenados por nombre
- ordenados por alto
- ordenados por ancho
- ordenados por largo
