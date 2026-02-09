package Lista;

public class ListaSimplementeEnlazadaTest {
    public static void main(String[] args) {
        ListaSimplementeEnlazada<String> lista = new ListaSimplementeEnlazada<>();
        ListaSimplementeEnlazada<String> lista2 = new ListaSimplementeEnlazada<>();

        lista.addFirst("A");
        lista.addFirst("B");
        lista.addFirst("C");

        lista2.addFirst("A");


        lista.print();

        lista.addCombineAfter(lista2);
        
        lista.print();
 




    }
    
}
