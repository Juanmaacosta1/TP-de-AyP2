package Ejercicio7;

public class EmpleadoPorComision extends Empleado{

    double porcentajeComision;
    double ventasBrutas;
    
    public EmpleadoPorComision(int dni, String nombre, double porcentajeComision, double ventasBrutas) {
        super(dni, nombre);
        this.porcentajeComision = porcentajeComision;
        this.ventasBrutas = ventasBrutas;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }

    @Override
    public String toString() {
        return "EmpleadoPorComision [nombre=" + nombre + ", dni=" + dni + ", porcentajeComision=" + porcentajeComision
                + "%, ventasBrutas=$" + ventasBrutas + "]";
    }

    

    
    
}
