public class InternetMain {

    public static void main(String[] args) {
        //PLAN1
         TipoServicio s1 = new TipoServicio("basico");
         Servicio internet1 = new Servicio("25 Mbits");
         Plan p1 = new Plan(18500, s1, internet1);
        //Plan 2:
        TipoServicio s2 = new TipoServicio("basico");
        Servicio internet2 = new Servicio("50 Mbits");
        Plan p2 = new Plan(21700, s2, internet2);

         //PLAN3 
         TipoServicio s3 = new TipoServicio("Premium");
         Servicio internet3 = new Servicio("50 Mbits");
         Plan p3 = new Plan(37100, s3, internet3);
          //PLAN4 
          TipoServicio s4 = new TipoServicio("Premium");
          Servicio internet4 = new Servicio(" 100 Mbits");
          Plan p4 = new Plan(54500, s4, internet4);
 

         //PERSONA 1
         Cliente persona1 = new Persona(12, "dr FAVALORO", p1, "Maria");
         //PERSONA 2
         Cliente persona2 = new Persona(13, "BARRIO 2 " , p2, "brunito");
         //Empresas:
         Cliente empresa1 = new Empresa(14, "SAN MARTIN", p3, "SI", false);
         Cliente empresa2 = new Empresa(15, "san miguel", p4, "SI", false);

        Cliente[] clientes = new Cliente[4];
        clientes[0]=persona1;
        clientes[1]=persona2;
        clientes[2]=empresa1;
        clientes[3]=empresa2;

        double total=0;

        for(int i=0; i<clientes.length; i++){
            System.out.println("Id: "+clientes[i].getId()+", Factura a pagar: $"+clientes[i].calcularFactura());
            total = total+clientes[i].calcularFactura();
        }
        System.out.println("Recaudación total: $"+total);

        total=0;
        for(int i=0; i<clientes.length; i++){
            if(clientes[i].getPlan().getTarifa()==21700 || clientes[i].getPlan().getTarifa()==37100){
                System.out.println(clientes[i].calcularFactura());
                total = total+clientes[i].calcularFactura();

            }
        }
        System.out.println("Recaudación total (50mbits de fibra óptica): $"+total);



        }

    
}
