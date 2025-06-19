package tienda;

import tienda.excepciones.ProductoNoEncontradoException;
import tienda.excepciones.UsuarioNoAutorizadoException;

import java.util.Arrays;
import java.util.Date;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class FabricaEntidades {

    private static final List<Producto>  productos = new ArrayList<>();
    private static final List<Usuario>   usuarios  = new ArrayList<>();

    // Creación de los productos
    public static Producto crearProducto(String tipo) {

        switch (tipo.toLowerCase()) {
            case "fisico":
                return new ProductoFisico(
                        "Producto Físico Genérico", 10.0f, "General",
                        999, 0, "Descripción", "img",
                        10, 1.0f, Arrays.asList("10x10x10")
                );

            case "digital":
                return new ProductoDigital(
                        "Producto Digital Genérico", 20.0f, "General",
                        998, 0, "Descripción", "img",
                        "Licencia básica", 30
                );

            default:
                throw new IllegalArgumentException("Tipo de producto no soportado: " + tipo);
        }
    }

    // Creación de los usuarios
    public static Usuario crearUsuario(String tipo) {

        switch (tipo.toLowerCase()) {
            case "cliente":
                return new Cliente(
                        "John", "Doe", "jdoe", "j@correo.com", "pass123",
                        25, new Date(), "Calle 1", "CLIENTE", "TARJETA"
                );

            case "administrador":
                return new Admin(
                        "Admin", "Root", "admin", "admin@tienda.com", "admin",
                        30, new Date(), "Oficina", "ADMIN"
                );

            default:
                throw new IllegalArgumentException("Tipo de usuario no soportado: " + tipo);
        }
    }


    // Excepciones
     
    public static Producto obtenerProductoPorSku(String sku)
            throws ProductoNoEncontradoException {

        return productos.stream()
                .filter(p -> p.getSku().equalsIgnoreCase(sku))
                .findFirst()
                .orElseThrow(() -> new ProductoNoEncontradoException(sku));
    }

    // Elimina un producto, solo si es un ADMIN puede hacerlo.
     
    public static void eliminarProducto(String sku, Usuario quienSolicita)
            throws UsuarioNoAutorizadoException, ProductoNoEncontradoException {

        if (!quienSolicita.esAdmin())
            throw new UsuarioNoAutorizadoException(
                    quienSolicita.getEmail(), "eliminar productos");

        Producto p = obtenerProductoPorSku(sku);   
        productos.remove(p);
    }

    /* Getters para tests o UI */

    public static List<Producto> getProductos() { return Collections.unmodifiableList(productos); }
    public static List<Usuario>  getUsuarios()  { return Collections.unmodifiableList(usuarios); }
    
}