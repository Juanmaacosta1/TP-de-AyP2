public class CuentaBancaria {
    private int numDecuenta;
    private String titular;
    protected double saldo; //uso esto para que en la clase principal pueda usar mas facil el monto
    public CuentaBancaria(){}
    public CuentaBancaria(int numDecuenta, String titular, double saldo) {
        this.numDecuenta = numDecuenta;
        this.titular = titular;
        this.saldo = saldo;
    }
    public int getNumDecuenta() {
        return numDecuenta;
    }
    public void setNumDecuenta(int numDecuenta) {
        this.numDecuenta = numDecuenta;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    @Override
    public String toString() {
        return "CuentaBancaria numDecuenta= " + numDecuenta + ", titular= " + titular + " , saldo=" + saldo + " ";
    }
    
}
