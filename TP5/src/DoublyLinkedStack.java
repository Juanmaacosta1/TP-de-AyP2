public class DoublyLinkedStack<E> implements Stack<E> {
    // Clase nodos interfaz 
    private static class Node<E> {
        E element;
        Node<E> next;
        Node<E> prev;

        public Node(E element, Node<E> next, Node<E> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
    //atributos 
    private int size = 0;       // tamaño de la pila 
    private Node<E> topNode;    // Referencia al nodo superior de la pila
    
    //metodo1
    @Override
    public int size() {
        return this.size;  // Devuelve el tamaño actual de la pila
    }
   
    //metodo2 
    @Override
    public boolean isEmpty() {
        return this.size == 0;  // Devuelve true si la pila está vacía
    }
    
    //metodo3
    @Override
    public E top() {
        throw new UnsupportedOperationException("Unimplemented method 'top'");
    }
    
    //metodo4
    @Override
    public void push(E element) {
        throw new UnsupportedOperationException("Unimplemented method 'push'");
    }
   
    //metodo5
    @Override
    public void pop() {
        throw new UnsupportedOperationException("Unimplemented method 'pop'");
    }
   
    //metodo6
    @Override
    public boolean search(E element) {
        throw new UnsupportedOperationException("Unimplemented method 'search'");
    }
}
