public class Inmueble extends Bien {

    //Atributos
    private String partida;
    private double valuacionFiscal;
    private double alicuotaBaldio;
    private double alicuotaEdificado;
    private boolean baldio;

    //Constructor vacío
    public Inmueble() {
    }

    //Constructor heredado
    public Inmueble(String fechaAlta, Titular titular, String partida, double valuacionFiscal, double alicuotaBaldio,
            double alicuotaEdificado, boolean baldio) {
        super(fechaAlta, titular);
        this.partida = partida;
        this.valuacionFiscal = valuacionFiscal;
        this.alicuotaBaldio = alicuotaBaldio;
        this.alicuotaEdificado = alicuotaEdificado;
        this.baldio = baldio;
    }

    //Método 1: Calcular impuestos para baldío
    public double calcularImpuesto(){
        if(baldio==true){
            double resultado1 = valuacionFiscal*alicuotaBaldio;
            return resultado1;
        }else{
            double resultado2 = valuacionFiscal*alicuotaEdificado;
            return resultado2;
        }
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public double getValuacionFiscal() {
        return valuacionFiscal;
    }

    public void setValuacionFiscal(double valuacionFiscal) {
        this.valuacionFiscal = valuacionFiscal;
    }

    public double getAlicuotaBaldio() {
        return alicuotaBaldio;
    }

    public void setAlicuotaBaldio(double alicuotaBaldio) {
        this.alicuotaBaldio = alicuotaBaldio;
    }

    public double getAlicuotaEdificado() {
        return alicuotaEdificado;
    }

    public void setAlicuotaEdificado(double alicuotaEdificado) {
        this.alicuotaEdificado = alicuotaEdificado;
    }

    public boolean isBaldio() {
        return baldio;
    }

    public void setBaldio(boolean baldio) {
        this.baldio = baldio;
    }

    @Override
    public String toString() {
        return "Partida:" + partida + ", ValuacionFiscal:" + valuacionFiscal + ", AlicuotaBaldio:"
                + alicuotaBaldio + ", AlicuotaEdificado:" + alicuotaEdificado;
    }
}
