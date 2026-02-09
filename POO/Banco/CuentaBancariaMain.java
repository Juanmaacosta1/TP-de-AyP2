package POO.Banco;

public class CuentaBancariaMain {
    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria1 = new CuentaBancaria("Bruno","BrunoXd",100.000);
        CuentaBancaria cuentaBancaria2 = new CuentaBancaria("Juan","JuanXD",900.000);
     
        //Deposito plata de la cuenta 1
        cuentaBancaria1.depositar(1000.000);

        //Retiro plata de la cuenta 2
        cuentaBancaria2.retirar(120.12);  

        //Información de ambas cuentas
        cuentaBancaria1.mostrarInformacion();
        cuentaBancaria2.mostrarInformacion();
    }
}
