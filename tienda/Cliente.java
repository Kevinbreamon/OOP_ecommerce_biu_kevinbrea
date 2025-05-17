package tienda;

import java.util.Date;

public class Cliente extends Usuario {
    private String metodoPago;

    public Cliente(String nombre, String apellido, String username, String correo, String contraseña,
        int edad, Date fechaCreacion, String direccion, String rol, String metodoPago) {
        super(nombre, apellido, username, correo, contraseña, edad, fechaCreacion, direccion, rol);
        this.metodoPago = metodoPago;
    }

    public void consultarMetodoPago() { }
    public void añadirProductoMensaje(String mensaje) { }
    public void pagarCarrito() { }
    public void gestionarCarritoCompra() { }

    // A continuación están establecido los getters y setters de la clase 

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
}