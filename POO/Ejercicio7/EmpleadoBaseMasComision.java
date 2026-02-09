package Ejercicio7;

public class EmpleadoBaseMasComision extends EmpleadoPorComision{

    double salarioBase;

    public EmpleadoBaseMasComision(int dni, String nombre, double porcentajeComision, double ventasBrutas) {
        super(dni, nombre, porcentajeComision, ventasBrutas);
    }

    public EmpleadoBaseMasComision(int dni, String nombre, double porcentajeComision, double ventasBrutas,
            double salarioBase) {
        super(dni, nombre, porcentajeComision, ventasBrutas);
        this.salarioBase = salarioBase;
       
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    //Método 1:
    public void incremento(){
        double incremento = ventasBrutas *porcentajeComision + salarioBase;
        incremento= incremento*0.10;
        System.out.println(incremento);
    }
    @Override
    public String toString() {
        return "EmpleadoBaseMasComision [nombre=" + nombre + ", dni=" + dni + ", porcentajeComision="
                + porcentajeComision + "%, salarioBase=$" + salarioBase + ", ventasBrutas=$" + ventasBrutas + "]";
    }
}
