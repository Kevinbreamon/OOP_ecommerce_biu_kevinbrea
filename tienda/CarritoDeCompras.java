package tienda;

import tienda.excepciones.InventarioInsuficienteException;
import tienda.excepciones.ProductoNoEncontradoException;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {

    private final List<ArticuloCarrito> articulos = new ArrayList<>();
    private final int carritoId;

    public CarritoDeCompras(int carritoId) {
        this.carritoId = carritoId;
    }

    public void agregarProducto(Producto producto, int cantidad)
            throws InventarioInsuficienteException {

        validarCantidad(cantidad);
        producto.reducirStock(cantidad);               
        articulos.add(new ArticuloCarrito(producto, cantidad));
        System.out.printf("Producto añadido: %s (x%d)%n",
                          producto.getNombre(), cantidad);
    }

    // Añadir a traves de ID
    public void agregarProducto(int productoId, int cantidad)
            throws ProductoNoEncontradoException, InventarioInsuficienteException {

        validarCantidad(cantidad);
        Producto producto = buscarProductoPorId(productoId); 
        agregarProducto(producto, cantidad);                   
    }

    /** Añadir rápido un producto “genérico” creado al vuelo. */
    public void agregarProducto(String nombre, float precio, int cantidad)
            throws InventarioInsuficienteException {

        if (precio < 0)
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        validarCantidad(cantidad);

        Producto p = new Producto(nombre, precio, "Sin categoría",
                                   -1, -1, "Sin descripción", "") {
            @Override
            public void reducirStock(int c) { }

            @Override
            public int getStock() { return Integer.MAX_VALUE; }

            @Override
            public void mostrarDetalle() {
                System.out.printf("Producto genérico: %s, $%.2f%n",
                                  getNombre(), getPrecio());
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

    private static void validarCantidad(int cantidad) {
        if (cantidad <= 0)
            throw new IllegalArgumentException("La cantidad debe ser mayor a cero.");
    }    

    private Producto buscarProductoPorId(int productoId)
            throws ProductoNoEncontradoException {

        return FabricaEntidades.getProductos().stream()
                .filter(p -> p.getProductoId() == productoId)
                .findFirst()
                .orElseThrow(() ->
                        new ProductoNoEncontradoException("ID:" + productoId));
    }
}