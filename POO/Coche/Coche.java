package POO.Coche;

public class Coche { //Clase 'Coche'

    //Atributos
    String marca;
    String modelo;
    int año;
    int km = 0;

    //Constructor vacio
    public Coche(){

    }

    //Constructor/Instancia
    public Coche(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    //Método 1
    public void detalles(){
        System.out.print("Marca: "+marca+"\nModelo: "+modelo+"\nAño: "+año);
    }

    //Método 2
    public int manejar(int km){
        int kmRecorrido = 0;
        km = km + kmRecorrido;
        return km;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    

    
    
}
