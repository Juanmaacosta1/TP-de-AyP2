public class CuentaCorriente extends CuentaBancaria {
    /*aquí también los clientes puede 
hacer depósitos y extracciones, en este caso puede tener un saldo negativo 
hasta determinado monto fijado para cada cliente. */
private String nombre1;
private int cuit1;
private String direccion1 ;
private String gmail1;

public CuentaCorriente(int numDecuenta, String titular, double saldo, String nombre1, int cuit1, String direccion1,
        String gmail1) {
    super(numDecuenta, titular, saldo);
    this.nombre1 = nombre1;
    this.cuit1 = cuit1;
    this.direccion1 = direccion1;
    this.gmail1 = gmail1;
}

}
