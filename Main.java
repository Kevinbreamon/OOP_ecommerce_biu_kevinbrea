import tienda.*;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(">>> INICIANDO PROGRAMA...");
        
        // Crear un cliente
        Cliente cliente = new Cliente(
            "Kevin",
            "Brea",
            "kevinbreamon",
            "kevinbreamon@gmail.com",
            "wrachuwrachu",   // contraseña
            26,
            new Date(),       // fecha creación
            "Calle jajajajaja",
            "cliente",        // rol
            "Tarjeta de Crédito"
        );

        // Crear un producto físico con stock, peso y dimensiones
        List<String> dimensiones = Arrays.asList("30cm", "20cm", "2cm");
        ProductoFisico producto = new ProductoFisico(
            "Laptop",
            1500.00f,                // precio
            "Electrónica",
            1,                       // productoId
            1001,                    // id
            "Laptop con 16GB RAM y SSD de 512GB",
            "http://ejemplo.com/laptop.jpg",
            10,                      // stock
            2.5f,                    // peso
            dimensiones              // dimensiones
        );

        // Crear un carrito y agregar el producto
        CarritoDeCompras carrito = new CarritoDeCompras(101);
        carrito.agregarProducto(producto, 2);

        // Mostrar total del carrito
        System.out.println("Total del carrito: $" + carrito.calcularTotal());

        // Mostrar información del cliente
        System.out.println("Cliente: " + cliente.getNombre() + " - Método de pago: " + cliente.getMetodoPago());

        // Crear un administrador
        Admin admin = new Admin(
            "El",
            "Mayimbe",
            "MamboViolento",
            "mambomusic@hotmail.com",
            "VamosAlMambo",
            120,
            new Date(),
            "Calle mambo",
            "admin"
        );

        // Usar funciones del administrador
        admin.gestionarUsuario(cliente);
        admin.gestionarProducto(producto);
        admin.consultarResultados();
    }

}

