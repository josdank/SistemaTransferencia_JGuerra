package banco.clientes;

import banco.Clientes;

public class retiro extends Clientes {
    int monto;

    public retiro(String nombre, String usuario, int cedula, int contrasenia, int monto) {
        super(nombre, usuario, cedula, contrasenia);
        this.monto = monto;
    }

    public retiro() {
    }

    public retiro(int monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("El usuario " + getNombre());
        System.out.println("Retiro un monto de");
        System.out.println(monto);
    }
}
