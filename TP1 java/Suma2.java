import java.util.Scanner;
public class Suma2 {

    public static void main(String[] args){
Scanner escaner = new Scanner(System.in);
//primer número 
System.out.print("ingrese su primer número : ");
int num1= escaner.nextInt();//creo una variable para almacenar el dato pedido 

//segundo número 
System.out.print("ingrese su segundo número : ");
int num2 = escaner.nextInt();

//creo una variable para almacenar la suma de los números 
int suma = num1+num2;

//imprimo por pantalla la suma de los 2 números que ingreso el usuario 
System.out.printf("su primer número es : %d \n", num1);
System.out.printf("su segundo número es : %d \n ",num2);

//suma finalizada 
System.out.printf("la suma es : %d ",suma);

//cierro el escaner 
escaner.close(); 
    }
}
