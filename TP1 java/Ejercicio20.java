import java.util.Scanner;
import java.util.Random;//para números aleatorios 
public class Ejercicio20 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       //creo el número random 
       Random mascara = new Random();//creo la mascara para el número 
       int num = mascara.nextInt(1000);

       int opcion= 0;
       int fin = 0;
       int cont =0;

       do {
        do {
            
        System.out.print("Ingrese Su Número: \n");
        int numeroingresado = entrada.nextInt();
        if (numeroingresado==num){
           System.out.print("Felicidades Ganaste! \n");
           cont++;
           fin++;
            System.out.printf("Adivinaste en %d Intentos\n",cont);
        
        }else if (numeroingresado>num){
         System.out.print("Demasiado Alto!\n");
         cont++;
        }else if (numeroingresado<num){
            System.out.print("Demasiado Bajo!\n");
            cont++;
        } 
     } while (fin==0);
     System.out.print("Desea Seguir Jugando \n 1.SI 2.NO \n");
        opcion= entrada.nextInt();
        
       } while (opcion == 1);
       entrada.close(); 

    }
}
