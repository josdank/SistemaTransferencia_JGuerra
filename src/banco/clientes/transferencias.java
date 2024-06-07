package banco.clientes;

import banco.Clientes;

public class transferencias extends Clientes {
    double monto;
    int cuenta;

    public transferencias() {
    }

    public transferencias(String nombre, String usuario, int cedula, int contrasenia, double monto, int cuenta) {
        super(nombre, usuario, cedula, contrasenia);
        this.monto = monto;
        this.cuenta = cuenta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public int getCuenta() {
        return cuenta;
    }

    @Override
    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("se realizo el deposito a la cuenta " +cuenta);
        System.out.println(" con un monto de: ");
        System.out.println("Monto: " + monto);
    }
}
