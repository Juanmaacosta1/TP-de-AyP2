public class Persona extends Cliente {
    private String nombre ;
   
    public Persona(int id, String direccion, Plan plan, String nombre) {
        super(id, direccion, plan);
        this.nombre = nombre;
    }

    @Override
    public double calcularFactura() {
        double tarifa = getPlan().getTarifa();
        double iva = getIva();
        double resultado = (tarifa*iva)/100;
        return resultado+tarifa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return " Nombre Cliente:  " + nombre + " ";
    }
    
}
