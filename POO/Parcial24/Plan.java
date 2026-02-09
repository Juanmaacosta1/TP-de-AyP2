public class Plan {

    private double tarifa;
    TipoServicio tipoServicio;
    Servicio servicio;

    public Plan(double tarifa, TipoServicio tipoServicio, Servicio servicio) {
        this.tarifa = tarifa;
        this.tipoServicio = tipoServicio;
        this.servicio = servicio;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    @Override
    public String toString() {
        return "Plan [tarifa=" + tarifa + ", tipoServicio=" + tipoServicio + ", servicio=" + servicio + "]";
    }

    
    
    
}
