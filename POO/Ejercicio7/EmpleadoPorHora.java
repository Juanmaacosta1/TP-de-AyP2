package Ejercicio7;

public class EmpleadoPorHora extends Empleado{

    double valorHora;
    int horasTrabajadas;

    public EmpleadoPorHora(int dni, String nombre, double valorHora, int horasTrabajadas) {
        super(dni, nombre);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public String toString() {
        return "EmpleadoPorHora [nombre=" + nombre + ", dni=" + dni + ", valorHora=$" + valorHora + ", horasTrabajas="
                + horasTrabajadas + "]";
    }    
}
