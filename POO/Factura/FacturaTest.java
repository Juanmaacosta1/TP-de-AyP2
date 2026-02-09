package Factura;

import Factura.Porpagar;

public class FacturaTest {
    public static void main(String[] args) {
      Porpagar[] pagos = new Porpagar[10];
      
    
      Empleado Empleado1 = new Empleado("Isabella", 9621321, 10000, "Joaquin", 300, 3);
      Empleado Empleado2 = new Empleado("Juan", 9621321, 10000, "Joaquin", 200, 3);
      pagos[0] = Empleado1;
      pagos[1] = Empleado2;
        
        
      Factura factura1 = new Factura("Vero", 1, "Abril");

      // Agregar artículos a la factura e impresion de items
      factura1.agregarItem("Laptop", 1, 1500);
      factura1.agregarItem("Teclado", 2, 400);
      pagos[2] = factura1;

      // Imprimir la factura
      System.out.println(factura1);
      

      //Recorrer arreglo de facturas
      for (Porpagar porpagar : pagos) { 
        if (porpagar != null) {
            System.out.println("Pago: $" + porpagar.obtenerPago());
        }
      }
    }
  }

  //Como se ve por la consola
  /*
   * Factura [Proveedor: Vero, N°: 1, Fecha: Abril, Cantidad de artículos: 2]
   * Item [descripcion=Laptop, cantidad=1, precioUnitario=1500]
   * Item [descripcion=Teclado, cantidad=2, precioUnitario=400]
   * Total a pagar: $2300.0 //LA SUMA DE LOS PRODUCTOS A COMPRAR
   * Pago: $900.0 //PAGO DE LAS HORAS TRABAJADAS DEL EMPLEADO 1 ISA
   * Pago: $600.0 //PAGO DE LAS HORAS TRABAJADAS DEL EMPLEADO 2 JUAN
   * Pago: $2300.0 //PAGO TOTAL QUE SE MOSTRO POR PANTALLA OTRA VEZ
   */