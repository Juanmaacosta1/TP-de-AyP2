package Generico;

public class Caja<T> {
    
    //Atributo genérico
    private T contenido;

    //Método 1: Poner algun item en la caja
    public void ponerContenido(T contenido){
        this.contenido=contenido;
    }

    //Método 2: Sacar algun item de la caja
    public T obtenerContenido(){
        return contenido;
    }
    
}
