

public class Coche extends Vehiculo{

    private double valorPorKm=1000;
    private int caballos;

    public Coche(String patente, String marca, int modelo, Alquiler alquiler, int caballos) {
        super(patente, marca, modelo, alquiler);
        this.caballos = caballos;
    }

    //Método:
    public double calcularAlquilerAutos(int km){
        if (caballos<=180){
            double resultado1 = valorPorKm*km;
            return resultado1;
            
        }else if (caballos>240){
            valorPorKm=5000;
            double resultado2 = valorPorKm*km;
            return resultado2;
        }
        double nada=0;
        return nada;
    }

    public double getValorPorKm() {
        return valorPorKm;
    }

    public void setValorPorKm(double valorPorKm) {
        this.valorPorKm = valorPorKm;
    }

    @Override
    public String toString() {
        return "Coche [valorPorKm=" + valorPorKm + "]";
    }

    
    
}
