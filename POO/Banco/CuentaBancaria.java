package POO.Banco;

    public class CuentaBancaria {//clase llamada "Cuenta Bancaria"
        //atributos de la clase que describen a un objeto 
        String titular;
        String nombreCuenta;
        double saldo = 0;
        double AggPlata = 0;
        double retiraplata = 0;

        //constructores
        public CuentaBancaria(){}
        public CuentaBancaria(String titular, String nombreCuenta, double saldo) {
            this.titular = titular;
            this.nombreCuenta = nombreCuenta;
            this.saldo = saldo;
        }

        //método1 
        public void depositar(double AggPlata){
            saldo=saldo+AggPlata;
            if(AggPlata<0){
                System.out.println("Su transferencia fue inválida.");
                System.exit(0);
            }if(AggPlata==0){
                System.out.println("No se transfirió dinero.");
            }else{
                System.out.println("¡Su transferencia fue exitosa!");
            }
        }

        //metodo2
        public void retirar(double retiraplata){
            saldo=saldo-retiraplata;
            if (saldo<=0){
                System.out.println("No hay suficiente dinero.");
                System.exit(0);
            }else{
                System.out.println("¡Su retiro fue exitoso!");
            }

        }
        //metodo3
        public void mostrarInformacion(){
            System.out.println("Cuenta de "+nombreCuenta+": $"+saldo);

        }
        
    }
