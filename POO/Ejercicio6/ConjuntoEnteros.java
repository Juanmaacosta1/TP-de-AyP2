
import java.util.Arrays;

public class ConjuntoEnteros {

    // Atributos
    private boolean a[] = new boolean[101];

    // Constructor vacio
    public ConjuntoEnteros() {

    }

    // Método 1: Ingresar un entero al arreglo
    public void ingresarEntero(int x) {
        a[x] = true;
    }

    // Método 2: Eliminar un entero del arreglo
    public void eliminarElemento(int x) {
        a[x] = false;
    }

    // Método 3: Imprimir un conjunto
    public void aStringConjunto() {

        // Supongo que el conjunto está vacio
        boolean vacio = true;

        // Con que haya al menos un elemento en el conjunto ya puedo decir que no está
        // vacio
        for (int i = 0; i < a.length; i++) {
            if (a[i] == true) {
                vacio = false;
            }
        }

        // Si el conjunto no está vacio imprime los elementos que existen...
        if (vacio == false) {
            System.out.print("Elementos del conjunto ingresado: ");

            for (int i = 0; i < a.length; i++) {
                if (a[i] == true) {
                    System.out.printf("%d ", i);
                }
            }
        } else {
            // ...de lo contrario, imprime el siguiente mensaje:
            System.out.println("¡El conjunto elegido está vacio!");
        }

        // Salto de línea para una mejor legibilidad
        System.out.println("");
    }

    // Método 4: Comparar dos conjuntos
    public void esIgualA(ConjuntoEnteros x, ConjuntoEnteros y) {

        // Supongo que los dos conjuntos son iguales
        boolean igual = true;

        // Calculo si los dos conjuntos son iguales. Si hay al menos un elemento
        // distinto ya me alcanza para decir que no son iguales
        for (int i = 0; i < a.length; i++) {
            if (x.a[i] == y.a[i]) {

            } else {
                igual = false;
            }
        }

        if (igual == false) {
            System.out.println("Los conjuntos ingresados son distintos.");
        }
        if (igual == true) {
            System.out.println("¡Los conjuntos ingresados son iguales!");
        }

    }

    // Método 5: Crear un nuevo conjunto uniendo dos
    public void union(ConjuntoEnteros x, ConjuntoEnteros y) {

        boolean vacio = true;
        boolean union[] = new boolean[101];

        System.out.print("Elementos de la unión: ");

        for (int i = 0; i < union.length; i++) {
            union[i] = x.a[i] || y.a[i];
            if (union[i] == true) {
                System.out.printf("%d ", i);
            }
        }

        for (int i = 0; i < union.length; i++) {
            if (union[i] == true) {
                vacio = false;
            }
        }

        if (vacio == true) {
            System.out.print("¡Vacío!");
        }

        System.out.println("");
    }

    // Método 6: Crear un nuevo conjunto con la intersección de dos
    public void interseccion(ConjuntoEnteros x, ConjuntoEnteros y) {

        boolean vacio = true;
        boolean union[] = new boolean[101];

        System.out.print("Elementos de la intersección: ");

        for (int i = 0; i < union.length; i++) {
            union[i] = x.a[i] && y.a[i];
            if (union[i] == true) {
                System.out.printf("%d ", i);
            }
        }

        for (int i = 0; i < union.length; i++) {
            if (union[i] == true) {
                vacio = false;
            }
        }

        if (vacio == true) {
            System.out.print("¡Vacío!");
        }

        System.out.println("");
    }

    // Método 7: Crear un nuevo conjunto con la diferencia de dos
    public void diferencia(ConjuntoEnteros x, ConjuntoEnteros y) {
        /*
         * diferencia - crea un tercer conjunto con todos los elementos que están en el
         * primero conjunto y no están en el segundo
         */
        boolean vacio = true; // suponemos que los elementos del tercero son iguales al los del segundo
        boolean nuevoConjunto[] = new boolean[101];

        System.out.print("Elementos de la diferecia: ");

        for (int i = 0; i < nuevoConjunto.length; i++) {
            nuevoConjunto[i] = x.a[i] && !y.a[i]; // el nuevo conjunto con los elementos del segundo
            if (nuevoConjunto[i]) {
                System.out.printf("%d ", i);
                vacio = false;
            }
        }
        if (vacio) {
            System.out.printf("Vacio");
        }
        System.out.println("");
    }

    // Método toString
    @Override
    public String toString() {
        return "\nArreglo booleano: " + Arrays.toString(a) + "\n";
    }
}

/*
 * Integrantes del grupo:
 * Varga Joaquin Damian
 * Acosta Juan
 * Muñoz Bruno Nahuel
 * Feliciani Mauri Isabella
 */
