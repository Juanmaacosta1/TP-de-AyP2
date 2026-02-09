package conjuntonuevo;

public class TestConjunto {

	public static void main(String[] args) {

        //Conjuntos genéricos de tipo entero
		Conjunto<Integer> c1 = new Conjunto<Integer>(4);
		Conjunto<Integer> c2 = new Conjunto<Integer>(4);

        //Método para añadir un elemento al conjunto
		c1.insertarElemento(1);
        c1.insertarElemento(3453);
        c1.insertarElemento(7);
        c1.insertarElemento(2);
        c2.insertarElemento(1);
        c2.insertarElemento(3453);
        c2.insertarElemento(7);

        //Método toString >Muestro por pantalla los conjuntos<
        System.out.println(c1);
        System.out.println(c2);

        //Método union >Devuelve un nuevo conjunto genérico uniendo otros dos<
        System.out.println(c1.union(c2));
        
        //Método cantidad >Devuelve la cantidad de elementos que hay en un conjunto<
        System.out.println(c1.cantidad());

        boolean find = c1.find(23);
        //Método find >Devuelve 'true' si el elemento ingresado existe en el conjunto, de lo contrario devuelve 'false'<
        System.out.println("*¿Está el elemento "+c1.getFind()+" en el conjunto elegido?: "+find);

        //Método iguales >Devuelve 'true' si dos conjuntos son iguales, de lo contrario devuelve 'false'<
        System.out.println("*¿Los dos conjuntos elegidos son iguales?: "+c1.iguales(c2));
       
        System.out.println(c1.interseccion(c2));
    }
}
