public class Titular {

    //Atributos
    private String nombre;
    private String cuit;
    
    //Constructor vacío
    public Titular() {
    }

    //Constructor principal
    public Titular(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    @Override
    public String toString() {
        return "Titular: Nombre:" + nombre + ", Cuit:" + cuit;
    }
}
