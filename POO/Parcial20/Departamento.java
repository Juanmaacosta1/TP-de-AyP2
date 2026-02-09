public class Departamento {
    private int codigo;
    private String descripccion;
    public Departamento() {}
    public Departamento(int codigo, String descripccion) {
        this.codigo = codigo;
        this.descripccion = descripccion;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescripccion() {
        return descripccion;
    }
    public void setDescripccion(String descripccion) {
        this.descripccion = descripccion;
    }
    @Override
    public String toString() {
        return "Departamento Codigo: " + codigo + "| Descripccion: " + descripccion + " ";
    }
    
    
}
