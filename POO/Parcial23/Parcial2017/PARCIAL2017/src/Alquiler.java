public class Alquiler {
    
    private int cantidadDias;
    private int cantidadKms;
    Cliente cliente;

    public Alquiler(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public int getCantidadKms() {
        return cantidadKms;
    }

    public void setCantidadKms(int cantidadKms) {
        this.cantidadKms = cantidadKms;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Alquiler [cantidadDias=" + cantidadDias + ", cantidadKms=" + cantidadKms + ", cliente=" + cliente + "]";
    }

    
    
    
}
