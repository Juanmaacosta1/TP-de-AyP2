public class Empresa {
    private String nombre;
    private Personal personal;
    
    public Empresa() {}

    public Empresa(String nombre, Personal personal) {
        this.nombre = nombre;
        this.personal = personal;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    @Override
    public String toString() {
        return "Empresa  Nombre: " + nombre + "| Personal: " + personal + " ";
    }
    
}
