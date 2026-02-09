package Ejercicio7;

public class EmpleadoMain {

    public static void main(String[] args) {

        //Objetos (personas)
        EmpleadoAsalariado persona1 = new EmpleadoAsalariado(45402246, "Juanma", 1000000);
        EmpleadoPorHora persona2 = new EmpleadoPorHora(45693403, "Lucas", 3000, 8);
        EmpleadoPorComision persona3 = new EmpleadoPorComision(45806669, "Pepe", 3, 1200000);
        EmpleadoBaseMasComision persona4 = new EmpleadoBaseMasComision(45346523, "Joaco", 7, 300000, 800000);
        EmpleadoBaseMasComision persona5 = new EmpleadoBaseMasComision(45234122, "Dario", 4, 200000, 700000);
        
        //Método toString
        System.out.println("");
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
        System.out.println(persona4);
        System.out.println("");
        
        //Arreglo de distintos empleados
        Empleado vector[] = new Empleado[10];
        vector[0] = persona1;
        vector[1] = persona2;
        vector[2] = persona3;
        vector[3] = persona4;
        vector[4] = persona5;

        //Punto 10
        System.out.print(vector[0].getNombre()+" ");
        System.out.println(((EmpleadoAsalariado) vector[0]).getSalarioMensual());
        System.out.print(vector[1].getNombre()+" ");
        System.out.println(((EmpleadoPorHora) vector[1]).getValorHora());
        System.out.print(vector[2].getNombre()+" ");
        System.out.println(((EmpleadoPorComision) vector[2]).getVentasBrutas());
        System.out.print(vector[3].getNombre()+" ");
        persona4.incremento();
        System.out.print(vector[4].getNombre()+" ");
        persona5.incremento();

        
    }
}
