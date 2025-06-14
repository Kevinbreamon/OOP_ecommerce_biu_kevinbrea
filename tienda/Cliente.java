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

    // a continuacion los getters y setters y  sus respectivas validaciones

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion != null && !direccion.trim().isEmpty()) {
            this.direccion = direccion;
        } else {
            System.out.println("Error: La dirección no puede ser vacía.");
        }
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        if (metodoPago != null && !metodoPago.trim().isEmpty()) {
            this.metodoPago = metodoPago;
        } else {
            System.out.println("Error: El método de pago no puede ser vacío.");
        }
    }
}