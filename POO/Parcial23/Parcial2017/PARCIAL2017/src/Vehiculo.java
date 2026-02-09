

public abstract class Vehiculo {
    
    private String patente;
    private String marca;
    private int modelo;
    Alquiler alquiler;
    
    public Vehiculo(String patente, String marca, int modelo, Alquiler alquiler) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.alquiler = alquiler;
    }
    
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public Alquiler getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }

    @Override
    public String toString() {
        return "Vehiculo [patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + ", alquiler=" + alquiler
                + "]";
    }

    


    


    
}
