public abstract class Socio {
    private int nroSocio;
    private String nombre;
    private static double valorcuota;
    private Actividad actividad;
    private double cantidadActividades = 0;
    private double costoTotal= 0;
    public Socio(int nroSocio, String nombre) {
        this.nroSocio = nroSocio;
        this.nombre = nombre;
    }
   public abstract double calcularCuota();
    public void agregarActividad(Actividad actividad){
    cantidadActividades++;
    costoTotal = costoTotal + actividad.getCosto();
    }
  
    @Override
    public String toString() {
        return "Socio [nroSocio=" + nroSocio + ", nombre=" + nombre + ", actividad=" + actividad + "]";
    }
    public int getNroSocio() {
        return nroSocio;
    }
    public void setNroSocio(int nroSocio) {
        this.nroSocio = nroSocio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public static double getValorcuota() {
        return valorcuota;
    }
    public static void setValorcuota(double valorcuota) {
        Socio.valorcuota = valorcuota;
    }
    public Actividad getActividad() {
        return actividad;
    }
    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }
    public double getCantidadActividades() {
        return cantidadActividades;
    }
    public void setCantidadActividades(double cantidadActividades) {
        this.cantidadActividades = cantidadActividades;
    }
    public double getCostoTotal() {
        return costoTotal;
    }
    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    
}
