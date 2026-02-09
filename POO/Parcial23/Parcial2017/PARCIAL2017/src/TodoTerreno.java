

public class TodoTerreno extends Vehiculo{

    private double valorPorDia=200000;
    private double valorPorKm=100;
    private int caballos;

    public TodoTerreno(String patente, String marca, int modelo, Alquiler alquiler, int caballos) {
        super(patente, marca, modelo, alquiler);
        this.caballos = caballos;
    }

    //Método:
    public double calcularAlquilerTodoTerreno(int km, int dias){
        if (caballos<=150){
            double resultado1 = (valorPorKm*km)+(valorPorDia*dias);
            return resultado1;
            
        }else if (caballos>=300){
            valorPorDia=500000;
            double resultado2 = (valorPorKm*km)+(valorPorDia*dias);
            return resultado2;
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
    public double getValorPorKm() {
        return valorPorKm;
    }
    public void setValorPorKm(double valorPorKm) {
        this.valorPorKm = valorPorKm;
    }

    @Override
    public String toString() {
        return "TodoTerreno [valorPorDia=" + valorPorDia + ", valorPorKm=" + valorPorKm + "]";
    }

    
    
    
}
