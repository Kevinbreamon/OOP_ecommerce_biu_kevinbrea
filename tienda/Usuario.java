package tienda;

import java.util.Date;

public abstract class Usuario {
    protected String nombre;
    protected String apellido;
    protected String username;
    protected String correo;
    protected int edad;
    protected Date fechaCreacion;
    protected String direccion;
    protected String contraseña;
    protected String rol;

    public Usuario(String nombre, String apellido, String username, String correo, String contraseña, int edad, Date fechaCreacion, String direccion, String rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.correo = correo;
        this.contraseña = contraseña;
        this.edad = edad;
        this.fechaCreacion = fechaCreacion;
        this.direccion = direccion;
        this.rol = rol;
    }

    public void actualizarDatos(String datos) { }

    public boolean verificarCuenta(String contrasena) {
        return true;
    }

    public boolean autenticarSesion(String string, String contrasena) {
        return true;
    }

    // A continuación están establecido los getters y setters de la clase 

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getContraseña() { return contraseña; }
    public void setContraseña(String contraseña) { this.contraseña = contraseña; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public Date getFechaCreacion() { return fechaCreacion; }
    public void setFechaCreacion(Date fechaCreacion) { this.fechaCreacion = fechaCreacion; }

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }
}