public class ClienteTest {
    public static void main(String[] args) {
     

        Plan plan1 = new Plan("mantenimiento", 100);
        Cliente p1 = new Empresa(0, "nvidia", plan1,13);
        Cliente p4 = new Empresa(0, "AMD", plan1,13);

        Cliente[] planes = new Cliente[2];
        planes[0] = p1;
        planes[1] = p4;
        System.out.println("Empresa(s) que tiene(n) el PLAN 1:");
        for (int i = 0 ; i<planes.length; i++){
           System.out.println(planes[i].getNombre());
        }
        System.out.println("");

        Plan plan2 = new Plan("servicios", 120);
        Cliente p2 = new Empresa(1, "amazon", plan2,12);

        Plan plan3 = new Plan("reparacion", 300);
        Cliente p3 = new Persona(0, "NEYMAR", plan3, true);

        Cliente[] clientes = new Cliente[5];
        clientes[0]=p1;
        clientes[1]=p2;
        clientes[2]=p3;

        for(int i=0; i<clientes.length; i++){
            if(clientes[i]!=null){
                System.out.println(clientes[i].getNombre());
                System.out.println(clientes[i].calcularFactura());
                System.out.println("");
            }
        }

    }
}
