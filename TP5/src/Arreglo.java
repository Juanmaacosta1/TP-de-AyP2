import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Arreglo<E> implements Stack<E>{
    private E[] arreglo;
    private static int SIZE_MAX=100;
    private int size=0;

    public Arreglo() {
        arreglo = (E[]) new Object[SIZE_MAX];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if(size==0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public E top() {
        if(size==0){
            return null;
        }else{
            E elemento = arreglo[size()-1];
            return elemento;
        }
    }

    @Override
    public void push(E element) {
        arreglo[size]=element;
        size++;
    }

    @Override
    public void pop() {
        arreglo[size-1]=null;
        size--;
    }

    @Override
    public boolean search(E element) {

        for(int i=0; i<arreglo.length; i++){
            if(arreglo[i]==element){
                return true;
            }
        }

        return false;
        
    }

    public String toString() {
    // Filtrar elementos que no son null
    String contenido = Arrays.stream(arreglo)
                             .filter(Objects::nonNull) // Filtra valores null
                             .map(Object::toString)    // Convierte cada objeto a su representación String
                             .collect(Collectors.joining(", ")); // Une los elementos con coma y espacio

    return "[" + contenido + "] | Tamaño:" + size;
}


}
