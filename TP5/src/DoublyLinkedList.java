import java.util.LinkedList;

public class DoublyLinkedList {
    public static void main(String[] args) {
        Arreglo<Integer> arreglo = new Arreglo<>();
        LinkedList<Integer> lista = new LinkedList<>();

       System.out.println("Pila vacía: "+arreglo);
       System.out.println("¿Está vacía?: "+arreglo.isEmpty());

       arreglo.push(1);
       arreglo.push(2);
       arreglo.push(3);
       arreglo.push(4);
       arreglo.push(5);
       
       System.out.println("Pila: "+arreglo);
       System.out.println("¿Está vacía?: "+arreglo.isEmpty());

       arreglo.pop();
       System.out.println("¿Está el 3?: "+arreglo.search(3));
       System.out.println("Último agregado: "+arreglo.top());

    }
}
