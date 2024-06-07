package banco.clientes;

import banco.Clientes;

public class Deposito extends Clientes {
    double monto;
    int cuenta;

    public Deposito() {
    }

    public Deposito(String nombre, String usuario, int cedula, int contrasenia, double monto, int cuenta) {
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
        System.out.println("Nombre" + getNombre());
        System.out.println("Depositando:::");
        System.out.println("Monto: " + monto);
        System.out.println("Cuenta: " + cuenta);
        System.out.println("Deposito exitoso");
    }
}
