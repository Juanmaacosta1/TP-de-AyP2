public class AlquilerTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan", "45.675.231");
        Cliente cliente2 = new Cliente("Bruno", "45.803.320");

        Alquiler alquier1 = new Alquiler(cliente1);
        Alquiler alquier2 = new Alquiler(cliente2);
        Alquiler alquier3 = new Alquiler(cliente1);
        
        Coche vehiculo3 = new Coche("123-ABC", "Audi", 2003, alquier1, 180);
        Coche vehiculo4 = new Coche("123-QWE", "BMW", 1998, alquier2, 250);
        Moto moto1 = new Moto("12345-WDAS", "Tornado", 2023, alquier3, 150);
        


        double a = vehiculo3.calcularAlquilerAutos(250);
        double b = vehiculo4.calcularAlquilerAutos(32);
        double c = moto1.calcularAlquilerMoto(7);

        System.out.println(cliente1+" Costo total del alquiler del Audi: $"+a);
        System.out.println(cliente2+" Costo total del alquier del BMW: $"+b);
        System.out.println(cliente1+" Costo total del alquiler del Tornado: $"+c);

        

        

        

        


    }
    
}
