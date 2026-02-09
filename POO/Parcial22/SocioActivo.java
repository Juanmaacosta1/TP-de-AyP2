public class SocioActivo extends Socio {
    public SocioActivo(int nroSocio, String nombre) {
        super(nroSocio, nombre);
    }
    private  static double porcDescuento =0.30;
    private static int cantActividades = 3;
    @Override
    public double calcularCuota() {
     double resultado;
      resultado = getValorcuota()+getCostoTotal();
      if(getCantidadActividades()>=cantActividades){
          double descuento ;
          descuento = resultado*porcDescuento;
          double resultadodescuento;
          resultadodescuento = resultado-descuento;
          return resultadodescuento;      
        }else{
            return resultado;
      
        }
    }
    
    public static double getPorcDescuento() {
        return porcDescuento;
    }
    public static void setPorcDescuento(double porcDescuento) {
        SocioActivo.porcDescuento = porcDescuento;
    }
    public static int getCantActividades() {
        return cantActividades;
    }
    public static void setCantActividades(int cantActividades) {
        SocioActivo.cantActividades = cantActividades;
    }

}
