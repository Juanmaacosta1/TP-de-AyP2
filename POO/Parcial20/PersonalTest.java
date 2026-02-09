public class PersonalTest {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        Departamento departamento0 = new Departamento(1, "bodega");
        Departamento departamento1 = new Departamento(1, "ventas");
      
  
        Empleado empleado0 = new Empleado("juan", "23.343.233", departamento0, 10000);
        Empleado empleado1 = new Empleado("juan", "23.343.233", departamento0, 10000);
        Empleado empleado2 = new Empleado("juan", "23.343.233", departamento0, 10000);

       empleados[0]= empleado0;
       empleados[1]= empleado1;
       empleados[2]= empleado2;
             double total = 0;
         for(int i = 0 ; i <empleados.length;i++){
            System.out.println(total=total+empleados[i].calculaSueldo());

         }

        //Departamento departamento1221 = new Departamento(4551, "ventas");
       //Contratado contratado1 = new Contratado("Rocio","34.432.432", departamento2, 2000, 90);
       
   

    }
}
