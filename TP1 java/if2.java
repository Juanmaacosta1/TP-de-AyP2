import java.util.Scanner;
public class if2 {
    public static void main (String[] args){
Scanner escaner = new Scanner(System.in);
System.out.println("Ingrese su nota ");
int nota =escaner.nextInt();
//if 
if(nota >= 6){
    System.out.printf("Aprobo \n");
    System.out.printf(" Su Nota es de:  %d ", nota );
}else{
    System.out.printf("No Aprobo \n");
    System.out.printf(" Su Nota es de:  %d ", nota );
}
escaner.close();
    }
}
