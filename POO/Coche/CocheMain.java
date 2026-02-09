package POO.Coche;

public class CocheMain {

    public static void main(String[] args) {
        
        Coche coche1 = new Coche("Ford", "Mustang", 2007);

        coche1.detalles();

        int km = coche1.manejar(15);

        System.out.println("\nKilómetros recorridos: "+km);
    }
    
}
