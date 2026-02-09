public class Empresa  extends Cliente{
    private String razonsocial;
    private boolean ivaexento;
    public Empresa(int id, String direccion, Plan plan, String razonsocial, boolean ivaexento) {
        super(id, direccion, plan);
        this.razonsocial = razonsocial;
        this.ivaexento = ivaexento;
    }
    /*Para las empresas el 
    cálculo de la factura también corresponde al valor de la tarifa del plan que tiene contratado si está 
    exento al iva y se suma el 21% si no lo está.  */
    @Override
    public double calcularFactura() {
       double tarifa = getPlan().getTarifa();
       double iva = getIva();  
       double factura ;    
        if (ivaexento ==true){
           factura = (tarifa*iva)/100;
           return factura;
      }else{
         return tarifa;
      }
    }
    public String getRazonsocial() {
        return razonsocial;
    }
    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }
    public boolean isIvaexento() {
        return ivaexento;
    }
    public void setIvaexento(boolean ivaexento) {
        this.ivaexento = ivaexento;
    }
    @Override
    public String toString() {
        return "Empresa [razonsocial=" + razonsocial + ", ivaexento=" + ivaexento + "]";
    }
    
}
