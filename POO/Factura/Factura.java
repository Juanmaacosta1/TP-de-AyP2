package Factura;
import java.util.Arrays;

public class Factura implements Porpagar {
    // Constantes
    private static final int CANTIDAD_ITEMS = 10;
    
    // Atributos
    private double precioUnitario;
    private String proveedor;
    private int numeroDeFactura;
    private String fecha;
    private int cantidadArticulos = 0; 
    private Item[] articulos = new Item[CANTIDAD_ITEMS];

    // Constructor
    public Factura(String proveedor, int numeroDeFactura, String fecha) {
        this.proveedor = proveedor;
        this.numeroDeFactura = numeroDeFactura;
        this.fecha = fecha;
    }

    // Implementación de obtenerPago()
    //Se recorren los articulos para ir sumando el precio
    @Override
    public double obtenerPago() {
        double total = 0.0;
        for (int i = 0; i < cantidadArticulos; i++) {
            total += articulos[i].getImporte();
        }
        return total;
    }

    // Método para agregar un item
    public void agregarItem(String descripcion, int cantidad, int precioUnitario) {
        if (cantidadArticulos < CANTIDAD_ITEMS) {
            articulos[cantidadArticulos] = new Item(descripcion, cantidad, precioUnitario);
            cantidadArticulos++;
        } else {
            System.out.println("Superó el límite de artículos.");
        }
    }

    //Metodo toString Con la clase StringBuilder para la manipulacion de cadenas de texto
    //Utilizamos append para agregar texto al final
    @Override
    public String toString() {
    StringBuilder facturaStr = new StringBuilder();
    facturaStr.append("Factura [Proveedor: ").append(proveedor)
    .append(", N°: ").append(numeroDeFactura)
    .append(", Fecha: ").append(fecha)
    .append(", Cantidad de artículos: ").append(cantidadArticulos)
    .append("]\n");
    
    // Solo mostramos los artículos válidos (evitamos los `null`)
    for (int i = 0; i < cantidadArticulos; i++) {
        facturaStr.append("").append(articulos[i].toString()).append("\n");
    }
    
    facturaStr.append("Total a pagar: $").append(obtenerPago()); 
    
    return facturaStr.toString();
}

}



// Clase Item
class Item {
    private String descripcion; 
    private int cantidad;
    private int precioUnitario; 

    public Item(String descripcion, int cantidad, int precioUnitario) {
        this.descripcion = descripcion; 
        this.cantidad = cantidad; 
        this.precioUnitario = precioUnitario;
    }

    public double getImporte() {
        return cantidad * precioUnitario; 
    }

    @Override
    public String toString() {
        return "Item [descripcion=" + descripcion + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario
                + "]";
    }

    
}
