public class Enfermero  extends Personal{

    public Enfermero(int legajo, String nombre, int antiguedad) {
        super(legajo, nombre, antiguedad);
        
    }

    @Override
    public double calcularSueldo() {
        double basico=getBasico();
        double sueldo=(basico*10/100)*getAntiguedad();
        return sueldo;
    }
    
}
