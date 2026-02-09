package Lista;

public class ListaSimplementeEnlazada<E> {
public static class Nodo<E> {
    E elemento ;
    Nodo<E> siguiente;
    public Nodo(E elemento) {
        this.elemento = elemento;
        this.siguiente = null;
    }
    public E getElemento() {
        return elemento;
    }
    public void setElemento(E elemento) {
        this.elemento = elemento;
    }
    public Nodo<E> getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo<E> siguiente) {
        this.siguiente = siguiente;
    }
    
}
 private int  size = 0 ;
 private Nodo<E> cabeza ;
 private Nodo<E> cola ;

 public ListaSimplementeEnlazada() {
    this.cabeza = null;
    this.cola = null;
 }
 
 public void addFirst (E elemento){
    Nodo<E> nuevoNodo = new Nodo<>(elemento);

    if (cabeza == null){
        cabeza = nuevoNodo;
        cola = nuevoNodo;
    }else{
        nuevoNodo.siguiente = cabeza;
        cabeza= nuevoNodo;
    }
    size++;
 }

    public void addlast(E elemento){
        Nodo<E> nuevoNodo = new Nodo<>(elemento);
        if (cola == null){
             cola = nuevoNodo;
             cabeza = nuevoNodo;
        } else{
            cola.siguiente = nuevoNodo;
            cola = nuevoNodo ;
        }
        size++;
    }

    public void print(){
        if(cabeza==null){
            System.out.println("¡La lista está vacía!");
        }

        Nodo<E> actual = cabeza;

        while(actual!=null){
            System.out.print(actual.elemento+" ");
            actual = actual.siguiente;
        }
        System.out.println("");
    }

    public void addI(int indice, E elemento){
        Nodo<E> nuevoNodo = new Nodo<>(elemento);
        if(indice<0 || indice>size){
            throw new IndexOutOfBoundsException("Indice fuera de rango!");
        }
        if(indice==0){
            addFirst(elemento);
            return;

        }
        if (indice==size) {
            addlast(elemento);
            return;
        }

        Nodo<E> actual = cabeza;
        for(int i=0; i<indice-1; i++){
            actual=actual.siguiente;
        }

        nuevoNodo.siguiente=actual.siguiente;
        actual.siguiente=nuevoNodo;
        size++;
    }

    //MÉTODO DEL PARCIAL:
    public void addCombineAfter(ListaSimplementeEnlazada<E> lista2) {
        // Verificar si alguna lista está vacía
        if (this.cabeza == null) { // Si lista1 está vacía
            this.cabeza = lista2.cabeza;
            this.size = lista2.size;
            return;
        }
    
        if (lista2.cabeza == null) { // Si lista2 está vacía
            return;
        }
    
        Nodo<E> actual1 = this.cabeza; // Nodo actual de lista1
        Nodo<E> actual2 = lista2.cabeza; // Nodo actual de lista2
    
        while (actual1 != null && actual2 != null) {
            Nodo<E> siguiente1 = actual1.siguiente; // Guardar el siguiente de lista1
            Nodo<E> nodoLista2 = new Nodo<>(actual2.elemento); // Crear nodo con el elemento de lista2
            actual1.siguiente = nodoLista2; // Insertar nodo de lista2 después de actual1
            nodoLista2.siguiente = siguiente1; // Conectar el resto de lista1
            actual1 = siguiente1; // Avanzar en lista1
            actual2 = actual2.siguiente; // Avanzar en lista2
        }
    
        // Si aún hay elementos en lista2, añadirlos al final de lista1
        if (actual2 != null) {
            Nodo<E> tail = this.cabeza;
            while (tail.siguiente != null) {
                tail = tail.siguiente;
            }
            tail.siguiente = actual2;
        }
    
        // Actualizar el tamaño de lista1
        this.size += lista2.size;
    }
    

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Nodo<E> getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo<E> cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo<E> getCola() {
        return cola;
    }

    public void setCola(Nodo<E> cola) {
        this.cola = cola;
    }
    


    
}
