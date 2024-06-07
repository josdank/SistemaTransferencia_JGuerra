package banco;

public abstract class banco  {
    String nombre;
    String usuario;
    int cedula;
    int contrasenia;

    public banco() {
    }

    public banco(String nombre, String usuario, int cedula, int contrasenia) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.cedula = cedula;
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(int contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void mostrarusuario (){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Usuario: "+ usuario);
        System.out.println("Cedula: "+ cedula);
    }

    public abstract void mostrar();
}
