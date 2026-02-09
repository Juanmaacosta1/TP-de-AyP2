
public class ConjuntoEnterosMain {

    public static void main(String[] args) {

        // Objeto
        ConjuntoEnteros n = new ConjuntoEnteros();
        ConjuntoEnteros m = new ConjuntoEnteros();

        // Llamado a los elementos
        // Elementos n
        n.ingresarEntero(3);
        n.ingresarEntero(0);
        n.ingresarEntero(2);
        n.ingresarEntero(6);

        // Elementos m
        m.ingresarEntero(5);
        m.ingresarEntero(0);
        m.ingresarEntero(4);
        m.ingresarEntero(2);

        // Llamado a metodos
        n.aStringConjunto();
        m.aStringConjunto();
        n.esIgualA(n, m);
        n.union(n, m);
        n.interseccion(n, m);
        n.diferencia(n, m);
    }
}

/*
 * Integrantes del grupo:
 * Varga Joaquin Damian
 * Acosta Juan
 * Muñoz Bruno Nahuel
 * Feliciani Mauri Isabella
 */
