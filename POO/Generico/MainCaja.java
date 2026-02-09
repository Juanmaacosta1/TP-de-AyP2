package Generico;

public class MainCaja {

    public static void main(String[] args) {
        
    Caja<String> cajaString = new Caja<>();
    cajaString.ponerContenido("Libro");
    String contenido = cajaString.obtenerContenido();
    System.out.println(contenido);

    Caja<Integer> cajaEntero = new Caja<>();
    cajaEntero.ponerContenido(3);
    int entero = cajaEntero.obtenerContenido();
    System.out.println(entero);

    }
}
