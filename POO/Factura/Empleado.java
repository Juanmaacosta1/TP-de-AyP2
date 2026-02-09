package Factura;

public class Empleado implements Porpagar {

    private String nombre;
    private int dni;
    private double salario;
    private String supervisor; 
    private double tarifaHora; 
    private int horasTrabajadas; 

    // Constructores 
    public Empleado(String nombre, int dni, double salario, String supervisor, double tarifaHora,
            int horasTrabajadas) {
        this.nombre = nombre;
        this.dni = dni;
        this.salario = salario;
        this.supervisor = supervisor;
        this.tarifaHora = tarifaHora;
        this.horasTrabajadas = horasTrabajadas;
    }

   

    // Implementación del método obtenerPago()
    @Override
    public double obtenerPago() {
       return horasTrabajadas * tarifaHora; 
    }
    

    
}
