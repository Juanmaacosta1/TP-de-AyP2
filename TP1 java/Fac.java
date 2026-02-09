import java.util.Scanner;
public class Fac {
 public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    System.out.print("Ingrese Su Número: ");
    int num1 = entrada.nextInt();
int acu = 1 ;
for (int i= 1; i<=num1;i++){
        acu = acu*i;
        System.out.printf(" Número %d = %d \n ",i, acu);
}
    entrada.close();
 }   
}
