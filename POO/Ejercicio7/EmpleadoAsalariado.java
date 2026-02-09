package Ejercicio7;

public class EmpleadoAsalariado extends Empleado {

    double salarioMensual;

    public EmpleadoAsalariado(int dni, String nombre, double salarioMensual) {
        super(dni, nombre);
        this.salarioMensual = salarioMensual;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public String toString() {
        return "EmpleadoAsalariado [dni=" + dni + ", nombre=" + nombre + ", salarioMensual=$" + salarioMensual + "]";
    }
}
