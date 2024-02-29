package Ejercicio1;

public class Cuenta {

    private String nombreCliente;
    private String numeroCuenta;
    private  double tipoDeInteres;
    private double saldo;

    public Cuenta() {
        this.nombreCliente = "";
        this.numeroCuenta = "";
        this.tipoDeInteres = 0;
        this.saldo = 0;
    }

    public Cuenta(String nombreCliente, String numeroCuenta, double tipoDeInteres, double saldo) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoDeInteres = tipoDeInteres;
        this.saldo = saldo;
    }

    public Cuenta(final Cuenta c){
        this.nombreCliente = c.nombreCliente;
        this.numeroCuenta = c.numeroCuenta;
        this.tipoDeInteres = c.tipoDeInteres;
        this. saldo = c.saldo;
    }

    public String getNombreCliente(){
        return this.nombreCliente;
    }
    public void setNombreCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }

    public String getNumeroCuenta(){
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }

    public double getTipoDeInteres(){
        return this.tipoDeInteres;
    }

    public void setTipoDeInteres(double tipoDeInteres){
        this.tipoDeInteres=tipoDeInteres;
    }

    public double getSaldo(){
        return this.saldo;
    }
    public  void setSaldo(double saldo){
        this.saldo=saldo;
    }

    public boolean ingreso(double cantIngreso){
        while (cantIngreso < 0){
            System.out.println("ingresar un valor positivo");
            return false;
        }
        this.saldo+=cantIngreso;
        return true;
    }

    public boolean reintegro(double cantReintegro){
        if (cantReintegro>this.saldo){
            System.out.println("Saldo no disponible");
            return false;
        }else if (cantReintegro<0){
            System.out.println("ingresar valores positivos");
            return false;
        }else {
            this.saldo-=cantReintegro;
            return true;
        }
    }

    public void trasferencia (Cuenta cuentaDestinataria, double cantidad){
        if (cantidad>this.saldo){
            System.out.println("Saldo insuficiente para esta transaccion");
        }else {
            cuentaDestinataria.ingreso(cantidad);
        }
    }
}







