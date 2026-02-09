public class SocioTemporario extends Socio{

    public SocioTemporario(int nroSocio, String nombre) {
        super(nroSocio, nombre);
      
    }

    @Override
    public double calcularCuota() {
     double resultado;
      resultado = getValorcuota()+getCostoTotal();
      return resultado;
     
    }
    
}
