package banco;

public class Clientes extends banco {
    int cuenta;
    double montou;
    public Clientes() {
    }

    public Clientes(String nombre, String usuario, int cedula, int contrasenia) {
        super(nombre, usuario, cedula, contrasenia);
    }

    public Clientes(int cuenta, double monto) {
        this.cuenta = cuenta;
        this.montou = monto;
    }

    public double getMontou() {
        return montou;
    }

    public void setMontou(double montou) {
        this.montou = montou;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
    @Override
    public void mostrar() {
        System.out.println("Usuario " + usuario);
        System.out.println("Cedula " + cedula);
        System.out.println("N° Cuenta " + cuenta);
        System.out.println("Monto inicial " + montou);

    }
}
