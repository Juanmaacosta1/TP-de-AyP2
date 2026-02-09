public class Persona extends Cliente{
private static int porc_jub = 30;
private boolean jubilado;
private double tarifaAux;

public Persona(int nroCliente, String nombre, Plan plan, boolean jubilado) {
    super(nroCliente, nombre, plan);
    this.jubilado = jubilado;
    this.tarifaAux=plan.getTarifa();
}


    @Override
    public double calcularFactura() {
        if(jubilado==true){
            return tarifaAux*porc_jub/100;
        }else{
            return tarifaAux;
        }
    }


    public static int getPorc_jub() {
        return porc_jub;
    }


    public static void setPorc_jub(int porc_jub) {
        Persona.porc_jub = porc_jub;
    }


    public boolean isJubilado() {
        return jubilado;
    }


    public void setJubilado(boolean jubilado) {
        this.jubilado = jubilado;
    }
    
}
