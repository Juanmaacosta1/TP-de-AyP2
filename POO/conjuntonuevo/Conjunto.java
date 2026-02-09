package conjuntonuevo;

import java.util.Arrays;

public class Conjunto<T> {

    //Atributos
	private T[] arreglo;
	private int posicion;
    private int tamaño;
    private T find;
    private int i=0;
    static int contador=1;

    //Constructor
	public Conjunto(int tamaño) {

        //Se hace un casteo de Object[] a T[]
		arreglo = (T[]) new Object[tamaño]; //(Se puede hacer, aunque haya advertencias)
        this.tamaño = tamaño;
        i++;
		posicion = 0;
	}

    //Método 1: Inserta un elemento al conjunto (si supera la capacidad del conjunto no hace nada)
	public void insertarElemento(T elemento) {
        if(tamaño>posicion){
            arreglo[posicion++] = elemento;
        }else if(tamaño<=posicion){
            System.exit(0);
        }
	}

    //Método 2: Retorna cuantos elementos hay en el conjunto
	public int cantidad() {
        System.out.print("*Cantidad de elementos del conjunto elegido: ");
		return posicion;
	}

    //Método 3: Retorna la unión de dos conjuntos
	public Conjunto<T> union(Conjunto<T> a) {
        System.out.print("*Unión: ");

        int nuevoTamaño = tamaño+a.getTamaño(); //Tamaño del nuevo arreglo

        Conjunto<T> arregloUnion = new Conjunto<>(nuevoTamaño);

        //Copio los elementos del primer conjunto (arreglo) al nuevo arreglo
        for(int i=0; i<this.tamaño; i++){
            if(this.get(i)!=null){
                arregloUnion.insertarElemento(this.get(i));
            }
        }

        //Copio los elementos del segundo conjunto (objeto) al nuevo arreglo
        for(int i=0; i<a.getTamaño(); i++){
            if(a.get(i)!=null){
                arregloUnion.insertarElemento(a.get(i));
            }
        }
        return arregloUnion;
	}

    //Método 4: Retorna la intersección de dos conjuntos
	public Conjunto<T> interseccion(Conjunto<T> c) {
        int nuevoTamaño1 = tamaño+c.getTamaño(); //Tamaño del nuevo arreglo

        Conjunto<T> arregloInterccion1 = new Conjunto<>(nuevoTamaño1);

        for(int i=0; i<tamaño; i++){
            for(int j=0; j<c.getTamaño(); j++){
                
                if(this.get(i).equals(c.get(j))){
                    arregloInterccion1.insertarElemento(this.get(i)); // o c.get(j), es lo mismo en ese punto

                }
            }
        }
	
    return arregloInterccion1;
}
    //Método 5: Retorna 'true' si dos conjuntos son iguales
	public boolean iguales(Conjunto<T> c) {
        if(Arrays.equals(this.arreglo, c.arreglo)){
            return true;
        }else{
            return false;
        }
	}

    //Método 6: Retorna 'true' si x elemento existe en el conjunto
	public boolean find(T find) {
        this.find=find;

        for(int i=0; i<tamaño; i++){
            if(find==arreglo[i]){
                return true;
            }
        }
		return false;
	}

    //Método toString
    @Override
    public String toString() {
        return String.format(">Conjunto %d: ", contador++)+Arrays.toString(arreglo);
    }
    
    //Getters y Setters
    public T get(int i) {
        return arreglo[i];
    }

    public T[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(T[] arreglo) {
        this.arreglo = arreglo;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public T getFind() {
        return find;
    }

    public void setFind(T find) {
        this.find = find;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}