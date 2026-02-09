import java.util.Arrays;

public class Conjunto<T> {

    //Atributos
	private T[] a;
	private int posicion;
    private int capacidad;
    private T find;

    //Constructor
	public Conjunto(int capacity){

        //Se hace un casteo de Object[] a T[]
		a = (T[]) new Object[capacity]; //(Se puede hacer, aunque haya advertencias)
        this.capacidad=capacity;
		posicion = 0;

	}

    //Método 1: Inserta un elemento al conjunto (si supera la capacidad del conjunto no hace nada)
	public void insertarElemento(T d) {
        if(capacidad>posicion){
            a[posicion++] = d;
        }else if(capacidad<=posicion){

            //No hago nada
            System.exit(0);
        }
	}

    //Método 2: Retorna cuantos elementos hay en el conjunto
	public int cantidad() {
		return posicion;
	}

    //Método 3: Retorna la unión de dos conjuntos
	public Conjunto<T> union(Conjunto<T> c) {
        System.out.print("La unión de los dos conjuntos es: ");
        
        for(int i=0; i<capacidad; i++){
            if(a[i]==null){

            }else{
                System.out.print(a[i]+" ");
            }
        }

        for(int i=0; i<capacidad; i++){
            if(c.get(i)==null){

            }else{
                System.out.print(c.get(i)+" ");
            }
        }
        
        return null;
	}

    //Método 4: Retorna la intersección de dos conjuntos
	public Conjunto<T> interseccion(Conjunto<T> c) {
		return null;
	}

    //Método 5: Retorna si dos conjuntos son iguales
	public boolean iguales(Conjunto<T> c) {
		return true;
	}

    //Retorna si x elemento existe en el conjunto
	public boolean find(T find) {
        this.find=find;

        for(int i=0; i<capacidad; i++){
            if(find==a[i]){
                return true;
            }
        }
		return false;
	}

    //Método toString
    @Override
    public String toString() {
        return "Elementos del conjunto:" + Arrays.toString(a);
    }

    //Getters y Setters
    public T getFind() {
        return find;
    }

    public void setFind(T find) {
        this.find = find;
    }

    public T get(int i) {
        return a[i];
    }
}