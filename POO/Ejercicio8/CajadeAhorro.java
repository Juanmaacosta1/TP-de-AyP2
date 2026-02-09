public class CajadeAhorro extends CuentaBancaria {
    /*aca hago depositos y extracciones de dinero siempre que el saldo
    * sea mayor o igual a 0 
    */
    private String nombre;
    private int cuit;
    private String direccion ;
    private String gmail;
    
    public CajadeAhorro(int numDecuenta, String titular, double saldo, String nombre, int cuit, String direccion,
        String gmail) {
        super(numDecuenta, titular, saldo);
        this.nombre = nombre;
        this.cuit = cuit;
        this.direccion = direccion;
        this.gmail = gmail;
    }
    public void depositar(double monto) {
        if (monto>=0 && monto <=getSaldo()){
            monto = monto+saldo;
            System.out.println("Depósito exitoso. Saldo actual: " + monto);
        }else{
            System.out.println("NO CUENTAS CON DINERO EN TU CUENTA");
            System.exit(1);
        }
    }

    public void extracciones(double extraer) {
        if(extraer<=0){
            System.out.println("INGRESE UN MONTO SUPERIOR");
            System.exit(1);
        }else if(extraer>0){
            saldo=saldo-extraer;
            System.out.println("Extracion exitosa!: " + saldo);
        }
    }
    @Override
    public String toString() {
        return "CajadeAhorro | saldo = " + saldo + " | nombre= " + nombre + " | cuit = " + cuit + "| direccion = " + direccion
                + " | gmail = " + gmail + "";
    }
    

  
   
  
}
