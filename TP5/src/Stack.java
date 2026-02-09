public interface Stack<E>{
     int size(); //tamaño
     boolean isEmpty(); //¿está vacío?
     E top(); //último elemento ingresado (el de arriba)
     void push(E element); //ingresa un elemento
     void pop(); //elimina un elemento
     boolean search(E element); //busca un elemento en concreto
}
