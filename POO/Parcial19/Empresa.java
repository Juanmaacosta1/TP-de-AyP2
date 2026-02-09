public class Empresa extends Cliente {
    private static double baseEmpresa=50;
    private int cantEmpleados;
    private double tarifaAux;

    public Empresa(int nroCliente, String nombre, Plan plan, int cantEmpleados) {
        super(nroCliente, nombre, plan);
        this.cantEmpleados = cantEmpleados;
        this.tarifaAux=plan.getTarifa();
    }


    @Override
    public double calcularFactura() {
        return tarifaAux*cantEmpleados*baseEmpresa;
    }

    public static double getBaseEmpresa() {
        return baseEmpresa;
    }
    public static void setBaseEmpresa(double baseEmpresa) {
        Empresa.baseEmpresa = baseEmpresa;
    }
    public int getCantEmpleados() {
        return cantEmpleados;
    }
    public void setCantEmpleados(int cantEmpleados) {
        this.cantEmpleados = cantEmpleados;
    }

    
    
}
