package conjuntonuevo;

public class Numeros<T extends Number> {

    private T valor;

    //Constructor
    public Numeros(T valor) {
        this.valor = valor;
    }

    //Método 1: Suma de genéricos
    public Numeros<Integer> suma(Numeros<Integer> num){
        int resultado = this.valor.intValue()+num.valor.intValue();

        return new Numeros<>(resultado);
    }

    //Método 2: Multiplicación de genéricos
    public Numeros<Integer> multiplicacion(Numeros<Integer> num){
        int resultado = this.valor.intValue()*num.valor.intValue();

        return new Numeros<>(resultado);
    }

    //Método 3: Resta de genéricos
    public Numeros<Integer> resta(Numeros<Integer> num){
        int resultado = this.valor.intValue()-num.valor.intValue();

        return new Numeros<>(resultado);
    }

    //Método 4: División de genéricos
    public Numeros<Integer> division(Numeros<Integer> num){
        int resultado = this.valor.intValue()/num.valor.intValue();

        return new Numeros<>(resultado);
    }

    //Método toString
    @Override
    public String toString() {
        return String.valueOf(valor);
    }

    //Getters y Setters
    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
}
