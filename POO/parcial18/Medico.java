public class Medico extends Personal {

    public Medico(int legajo, String nombre, int antiguedad) {
        super(legajo, nombre, antiguedad);
    }

    @Override
    public double calcularSueldo() {
        double basico=getBasico();
        double mitadBasico=getBasico()/50*100;
        double porcentajeBasico=(getBasico()/20*100)*getAntiguedad();
        double sueldo=basico+mitadBasico+porcentajeBasico;
        return sueldo;
    }
    
}
