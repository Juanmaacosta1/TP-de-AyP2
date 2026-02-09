

public class Moto extends Vehiculo{

    private double valorPorDia=50000;
    private int cilindrada;

    public Moto(String patente, String marca, int modelo, Alquiler alquiler, int cilindrada) {
        super(patente, marca, modelo, alquiler);
        this.cilindrada = cilindrada;
    }

    //Método:
    public double calcularAlquilerMoto(int dias){
        if (cilindrada<=70){
            double resultado = valorPorDia*dias;
            return resultado;
            
        }else if (cilindrada<=110){
            valorPorDia=80000;
            double resultado = valorPorDia*dias;
            return resultado;

        }else if (cilindrada >=150){
            valorPorDia=120000;
            double resultado = valorPorDia*dias;
            return resultado;
        }
        double nada=0;
        return nada;
    }

    public double getValorPorDia() {
        return valorPorDia;
    }

    public void setValorPorDia(double valorPorDia) {
        this.valorPorDia = valorPorDia;
    }

    @Override
    public String toString() {
        return "Moto [valorPorDia=" + valorPorDia + "]";
    }

    

    
    
}
