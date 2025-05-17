package tienda;

import java.util.Date;

public class Admin extends Usuario {
    public Admin(String nombre, String apellido, String username, String correo,
                 String contraseña, int edad, Date fechaCreacion, String direccion, String rol) {
        super(nombre, apellido, username, correo, contraseña, edad, fechaCreacion, direccion, rol); 
    }

    public void gestionarUsuarios(Usuario usuario) { }
    public void gestionarProductos(Producto producto) { }
    public void consultarReabastecimiento() { }

    public void gestionarUsuario(Usuario usuario) {
        System.out.println("Gestionando usuario: " + usuario.getUsername());
    }

    public void gestionarProducto(Producto producto) {
        System.out.println("Gestionando producto: " + producto.getNombre());
    }

    public void consultarResultados() {
        System.out.println("Consultando resultados de ventas, productos y usuarios.");
    }
}