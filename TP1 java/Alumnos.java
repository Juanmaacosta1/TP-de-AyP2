

public class Alumnos {
 
    
    //Atributos
    int edad;
    String nombre;
    String apellido;

    //Constructor vacio
    public Alumnos() {

    }

    //Constructor 1
    public Alumnos(int edad, String nombre, String apellido) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Métodos
    public void saludar(){
        System.out.println("Hola "+nombre+", ¿Cómo estás?");
    }

}
