public class Contratado extends Personal {
    private double valorhora;
    private double canthoras;
    public Contratado(String nombre, String dni, Departamento departamento, double valorhora, double canthoras) {
        super(nombre, dni, departamento);
        this.valorhora = valorhora;
        this.canthoras = canthoras;
    }
    @Override
    public double calculaSueldo(){
        double sueldoempleado;
        sueldoempleado = (valorhora*canthoras);
        return sueldoempleado;
    }
    public double getValorhora() {
        return valorhora;
    }
    public void setValorhora(double valorhora) {
        this.valorhora = valorhora;
    }
    public double getCanthoras() {
        return canthoras;
    }
    public void setCanthoras(double canthoras) {
        this.canthoras = canthoras;
    }
    @Override
    public String toString() {
        return "Contratado  valorhora: " + valorhora + "| Canthoras: " + canthoras + " ";
    }

}
