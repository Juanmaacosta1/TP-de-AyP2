import java.util.Scanner;

public class Calculadora {
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número del 1 al 4, correspondiente a la operación que desee realizar: ");
        System.out.print("1.Suma\n2.Resta\n3.Multiplicación\n4.División\nOpción: ");

        int opcion = entrada.nextInt();

        if(opcion>4 || opcion<1 ){
            System.out.println("El número ingresado no corresponde a ninguna opción.");

            System.exit(0);
        }

        System.out.println("Ingrese el primer número: ");
        int num1 = entrada.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = entrada.nextInt();

        if(opcion == 1){
            int suma = num1+num2;
            System.out.printf("%d + %d = %d", num1, num2, suma);
        }
        if(opcion == 2){
            int resta = num1-num2;
            System.out.printf("%d - %d = %d", num1, num2, resta);
        }
        if(opcion == 3){
            int mult = num1*num2;
            System.out.printf("%d * %d = %d", num1, num2, mult);
        }
        if(opcion == 4){
            int div = num1/num2;
            System.out.printf("%d / %d = %d", num1, num2, div);
        }
        
        entrada.close();

    }
}
