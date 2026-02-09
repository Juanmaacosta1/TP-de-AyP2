public class SocioTest {
    public static void main(String[] args) {
        Socio p1 = new SocioActivo(1, "maria");
        Socio p2 = new SocioActivo(1, "bruno");
        Socio p3 = new SocioTemporario(1, "messi");

        Actividad futbol = new Actividad(12, "futbol", 1000);
        Actividad tenis  = new Actividad(132, "tenis", 1400);
        Actividad golf  = new Actividad(132, "golf", 1400);
        Actividad golf1  = new Actividad(132, "golf", 1400);

        p1.agregarActividad(golf);
        p1.agregarActividad(golf1);
        p1.agregarActividad(golf1);
        p2.agregarActividad(tenis);
        p3.agregarActividad(futbol);
         Socio[] socios = new Socio[5];

         socios[0]=p1;
         socios[1]=p2;
         socios[2]=p3;
          double total = 0;
          
         for(int i = 0 ; i<socios.length ; i++){
             if(socios[i]!=null){
                System.out.println(socios[i].getNombre());
                System.out.println(socios[i].calcularCuota());
                total = total+socios[i].calcularCuota();
             }
         }
         System.out.println("TOTAL A PAGAR DE CUOTAS");
         System.out.println(total);    
        }

}
