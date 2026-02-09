public class CuentaBancariaTets {
    public static void main(String[] args) {
        CajadeAhorro banco = new CajadeAhorro(0, "juan", 1000, "juan manuel", 12, "san martin", "juan@aco");   
        System.out.println("Detalles iniciales de la cuenta:");
        System.out.println(banco);
        banco.depositar(900);
        banco.extracciones(200);

    }

}
