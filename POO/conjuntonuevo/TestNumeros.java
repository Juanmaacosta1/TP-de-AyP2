package conjuntonuevo;

public class TestNumeros {
    public static void main(String[] args) {
        
        //Objetos genéricos tipo entero
        Numeros<Integer> n = new Numeros<>(10);
        Numeros<Integer> m = new Numeros<>(5);
        
        //Métodos con genéricos
        System.out.println(n.getValor() + "+" + m.getValor() + "=" + n.suma(m));
        System.out.println(n.getValor() + "-" + m.getValor() + "=" + n.resta(m));
        System.out.println(n.getValor() + "*" + m.getValor() + "=" + n.multiplicacion(m));
        System.out.println(n.getValor() + "/" + m.getValor() + "=" + n.division(m));

    }
    
}
