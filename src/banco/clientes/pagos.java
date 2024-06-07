package banco.clientes;

import banco.Clientes;

public class pagos extends Clientes {
    String agua;
    String Luz;
    String telefono;
    int tarjeta;

    public pagos(String nombre, String usuario, int cedula, int contrasenia) {
        super(nombre, usuario, cedula, contrasenia);
    }

    public pagos(String nombre, String usuario, int cedula, int contrasenia, String agua, String luz, String telefono, int tarjeta) {
        super(nombre, usuario, cedula, contrasenia);
        this.agua = agua;
        Luz = luz;
        this.telefono = telefono;
        this.tarjeta = tarjeta;
    }

    public String getAgua() {
        return agua;
    }

    public void setAgua(String agua) {
        this.agua = agua;
    }

    public String getLuz() {
        return Luz;
    }

    public void setLuz(String luz) {
        Luz = luz;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    @Override
    public void mostrar() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Usuario: " + getUsuario());
        System.out.println("Servicios basicos pagados");
        System.out.println("Agua: " + getAgua());
        System.out.println("Luz: " + getLuz());
        System.out.println("Telefono: " + getTelefono());
    }

    public void mostrar1 (){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Usuario: " + getUsuario());
        System.out.println("tarjeta pagada");
        System.out.println(tarjeta);
    }
}
