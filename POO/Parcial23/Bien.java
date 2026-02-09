public abstract class Bien {

    private String fechaAlta;
    private Titular titular;
    
    //Constructor vacío
    public Bien() {
    }

    //Constructor con parámetros
    public Bien(String fechaAlta, Titular titular) {
        this.fechaAlta = fechaAlta;
        this.titular = titular;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Bien: Fecha alta:" + fechaAlta + ", Titular:" + titular + "]";
    }

    
    
}
