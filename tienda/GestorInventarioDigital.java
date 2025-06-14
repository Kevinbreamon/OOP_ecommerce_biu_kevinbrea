package tienda;

import java.util.HashMap;
import java.util.Map;

public class GestorInventarioDigital extends GestorInventario {

    // Mapeo de los productos
    private Map<Integer, ProductoDigital> catalogo = new HashMap<>();

    @Override
    public void añadirProducto(Producto producto, int cantidad) {
        if (!(producto instanceof ProductoDigital)) {
            System.out.println("Sólo se aceptan productos digitales.");
            return;
        }
        catalogo.put(producto.getProductoId(), (ProductoDigital) producto);
        System.out.println("Producto digital añadido/actualizado: " + producto.getNombre());
    }

    @Override
    public void eliminarProducto(int productoId) {
        if (catalogo.remove(productoId) != null) {
            System.out.println("Producto digital ID " + productoId + " eliminado.");
        } else {
            System.out.println("Producto digital ID " + productoId + " no encontrado.");
        }
    }

    @Override
    public void actualizarStock(int productoId, int nuevoStock) {
        System.out.println("Inventario digital: no aplica actualización de stock.");
    }

    @Override
    public void mostrarInventario() {
        System.out.println("Inventario Digital:");
        catalogo.values().forEach(ProductoDigital::mostrarDetalle);
    }
}