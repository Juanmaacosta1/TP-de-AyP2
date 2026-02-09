public  abstract class Cliente {
    private int id;
    private static final double IVA = 21;
    private String direccion;
    private Plan plan ;
    public Cliente(int id, String direccion, Plan plan) {
        this.id = id;
        this.direccion = direccion;
        this.plan = plan;
    }
    //metodo
    public abstract double calcularFactura();
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public static double getIva() {
        return IVA;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Plan getPlan() {
        return plan;
    }
    public void setPlan(Plan plan) {
        this.plan = plan;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        if (id != other.id)
            return false;
        return true;
    }
    


}
