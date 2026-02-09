import java.util.Scanner;

public class TablasDeMultiplicar {
    public static void main (String[] args){

    Scanner escaner = new Scanner(System.in);

    System.out.print("Ingrese Su Número: ");

    int mult = escaner.nextInt();


    for (int i=1; i<=10 ; i++){

        System.out.printf("%d * %d = %d\n ",mult , i , i*mult);

    }

    escaner.close();
    
    }
}