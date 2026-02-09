public class Vehiculo extends Bien{

    //Atributos
    private String patente;
    private String marca;
    private int modelo;
    private final int ANTIGUEDAD = 20;
    private double alicuotaVehiculo;
    private double valuacionFiscal;
    
    //Constructor vacío
    public Vehiculo() {
    }
    
    //Constructor heredado
    public Vehiculo(String fechaAlta, Titular titular, String patente, String marca, int modelo,
    double alicuotaVehiculo, double valuacionFiscal) {
        super(fechaAlta, titular);
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.alicuotaVehiculo = alicuotaVehiculo;
        this.valuacionFiscal = valuacionFiscal;
    }

    //Método:
    public double calcularImpuestoVehiculo(){
        if(modelo>=ANTIGUEDAD){
            double resultado1 = valuacionFiscal;
            System.out.println("El modelo del auto es muy viejo. No pagás impuestos.");
            return resultado1;
        }else{
            double resultado2 = valuacionFiscal*alicuotaVehiculo;
            System.out.print("Impuestos del auto: "+resultado2);
            return resultado2;
        }
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

    public int getANTIGUEDAD() {
        return ANTIGUEDAD;
    }

    public double getAlicuotaVehiculo() {
        return alicuotaVehiculo;
    }

    public void setAlicuotaVehiculo(double alicuotaVehiculo) {
        this.alicuotaVehiculo = alicuotaVehiculo;
    }

    public double getValuacionFiscal() {
        return valuacionFiscal;
    }

    public void setValuacionFiscal(double valuacionFiscal) {
        this.valuacionFiscal = valuacionFiscal;
    }

    @Override
    public String toString() {
        return "Vehiculo [patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + ", ANTIGUEDAD=" + ANTIGUEDAD
                + ", alicuotaVehiculo=" + alicuotaVehiculo + ", valuacionFiscal=" + valuacionFiscal + "]";
    }

    

    

    

    
}
