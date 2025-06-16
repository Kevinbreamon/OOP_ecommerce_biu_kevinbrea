package tienda;

import java.util.Arrays;
import java.util.Date;

public class FabricaEntidades {

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
}