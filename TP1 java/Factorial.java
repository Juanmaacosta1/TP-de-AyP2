import java.util.Scanner;

public class Factorial {

    public static void main(String args[]){

    System.out.print("Ingrese el número del factorial: ");

    Scanner escaner = new Scanner(System.in);
    int factorial = escaner.nextInt();

    int acumulador=1;

    for(int i=1; i<=factorial; i++){
        System.out.printf("%d x ", i);

        acumulador = acumulador*i;

        if(i==factorial){
            System.out.printf(" = %d", acumulador);
        }
    }

    escaner.close();

    }
    
}
