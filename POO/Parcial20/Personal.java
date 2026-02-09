public abstract class Personal {
    private String nombre ;
    private String dni;
    private Departamento departamento;
    public Personal() {}
    public Personal(String nombre, String dni, Departamento departamento) {
        this.nombre = nombre;
        this.dni = dni;
        this.departamento = departamento;
    }
    public abstract double calculaSueldo();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    @Override
    public String toString() {
        return "Personal Nombre: " + nombre + "| Dni: " + dni + "| Departamento=" + departamento + " ";
    }

}
