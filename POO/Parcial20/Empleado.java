public class Empleado extends Personal {
    private double sueldo;

    public Empleado(String nombre, String dni, Departamento departamento, double sueldo) {
        super(nombre, dni, departamento);
        this.sueldo = sueldo;
    }

    @Override
    public double calculaSueldo(){
        return sueldo;
    }


    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado su Sueldo: " + sueldo + " ";
    }
    
}
