package tienda;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private List<ArticuloCarrito> articulos;
    private int carritoId;

    public CarritoDeCompras(int carritoId) {
        this.carritoId = carritoId;
        this.articulos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto, int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad debe ser mayor a cero.");
            return;
        }
        articulos.add(new ArticuloCarrito(producto, cantidad));
        System.out.println("Producto añadido: " + producto.getNombre() + " (x" + cantidad + ")");
    }

    // Sobrecarga: agregar por ID
    public void agregarProducto(int productoId, int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad debe ser mayor a cero.");
            return;
        }
        Producto producto = buscarProductoPorId(productoId);
        if (producto != null) {
            agregarProducto(producto, cantidad);
        } else {
            System.out.println("Producto con ID " + productoId + " no encontrado.");
        }
    }

    // Sobrecarga: agregar por nombre, precio y cantidad
    public void agregarProducto(String nombre, float precio, int cantidad) {
        if (precio < 0) {
            System.out.println("Error: El precio no puede ser negativo.");
            return;
        }
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad debe ser mayor a cero.");
            return;
        }
        Producto p = new Producto(nombre, precio, "Sin categoría", -1, -1, "Sin descripción", "") {
            @Override
            public void mostrarDetalle() {
                System.out.println("Producto genérico: " + getNombre() + ", $" + getPrecio());
            }
        };
        agregarProducto(p, cantidad);
    }

    public void removerProductoPorId(int productoId) {
        articulos.removeIf(a -> a.getProducto().getProductoId() == productoId);
        System.out.println("Producto con ID " + productoId + " eliminado del carrito.");
    }
    public void modificarCantidad(int productoId, int nuevaCantidad) {
        if (nuevaCantidad <= 0) {
            System.out.println("Error: La cantidad debe ser mayor a cero.");
            return;
        }
        for (ArticuloCarrito articulo : articulos) {
            if (articulo.getProducto().getProductoId() == productoId) {
                articulo.setCantidad(nuevaCantidad);
                System.out.println("Cantidad actualizada para producto ID " + productoId);
                return;
            }
        }
        System.out.println("Producto con ID " + productoId + " no encontrado en el carrito.");
    }

    public float calcularTotal() {
        float total = 0;
        for (ArticuloCarrito articulo : articulos) {
            total += articulo.getSubtotal();
        }
        return total;
    }

    public void vaciar() {
        articulos.clear();
    }

    public int getCarritoId() {
        return carritoId;
    }

    public List<ArticuloCarrito> getArticulos() {
        return articulos;
    }

    private Producto buscarProductoPorId(int productoId) {
        return null;
    }
}