package tienda;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Crear productos físicos y digitales
        ProductoFisico p1 = new ProductoFisico(
            "Camiseta", 15.99f, "Ropa", 101, 1, "Camiseta de algodón", "url_imagen",
            50, 0.3f, Arrays.asList("30cm", "20cm", "2cm")
        );

        ProductoDigital p2 = new ProductoDigital(
            "Curso Java", 49.99f, "Educación", 102, 2, "Curso online de Java",
            "url_imagen_curso", "Licencia vitalicia", 365
        );

        // Crear carrito de compras
        CarritoDeCompras carrito = new CarritoDeCompras(1);

        // Agregar productos al carrito (usando distintos métodos)
        carrito.agregarProducto(p1, 2);              // Producto físico
        carrito.agregarProducto(p2, 1);              // Producto digital
        carrito.agregarProducto("Producto Genérico", 9.99f, 3);  // Producto genérico

        // Mostrar total
        System.out.println("Total del carrito: $" + carrito.calcularTotal());

        // Modificar cantidad y mostrar total actualizado
        carrito.modificarCantidad(101, 5);
        System.out.println("Total después de modificar cantidad: $" + carrito.calcularTotal());

        // Remover un producto y mostrar total actualizado
        carrito.removerProductoPorId(102);
        System.out.println("Total después de remover producto digital: $" + carrito.calcularTotal());

        // Vaciar carrito
        carrito.vaciar();
        System.out.println("Total después de vaciar carrito: $" + carrito.calcularTotal());
    }
}