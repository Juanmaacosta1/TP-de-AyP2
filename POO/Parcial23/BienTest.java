public class BienTest {

    public static void main(String[] args) {
        Titular titular = new Titular("pepito", "7");
        Titular titular1 = new Titular("Juan", "Acosta");
        Vehiculo auto = new Vehiculo("ayer", titular1, "SJDFNA", "ford", 1023, 0.004, 4500);

        Inmueble casa = new Inmueble("2000", titular, "2015", 1000, 0.006, 0.002, true);
        Inmueble edificio = new Inmueble("2010", titular, "2020", 4500, 0.006, 0.002, false);

        System.out.println(casa);
        System.out.println(edificio);

        System.out.println("Impuesto de baldío: "+casa.calcularImpuesto());
        System.out.println("Impuesto de edificio: "+edificio.calcularImpuesto());

        auto.calcularImpuestoVehiculo();
        
    }

    
}
