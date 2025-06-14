package tienda;

import java.util.HashMap;
import java.util.Map;

public class GestorInventarioFisico extends GestorInventario {

    // Mapeo de los productos
    private Map<Integer, ProductoFisico> inventario = new HashMap<>();

    @Override
    public void añadirProducto(Producto producto, int cantidad) {
        if (!(producto instanceof ProductoFisico) || cantidad <= 0) {
            System.out.println("Error al añadir producto físico.");
            return;
        }
        ProductoFisico pf = (ProductoFisico) producto;
        pf.setStock(pf.getStock() + cantidad);
        inventario.put(pf.getProductoId(), pf);
        System.out.println("Añadido stock físico: " + pf.getNombre() + " (+" + cantidad + ")");
    }

    @Override
    public void eliminarProducto(int productoId) {
        if (inventario.remove(productoId) != null) {
            System.out.println("Producto físico ID " + productoId + " eliminado del inventario.");
        } else {
            System.out.println("Producto físico ID " + productoId + " no encontrado.");
        }
    }

    @Override
    public void actualizarStock(int productoId, int nuevoStock) {
        ProductoFisico pf = inventario.get(productoId);
        if (pf != null && nuevoStock >= 0) {
            pf.setStock(nuevoStock);
            System.out.println("Stock actualizado para ID " + productoId + " → " + nuevoStock);
        } else {
            System.out.println("Error al actualizar stock físico.");
        }
    }

    @Override
    public void mostrarInventario() {
        System.out.println("Inventario Físico:");
        inventario.values().forEach(ProductoFisico::mostrarDetalle);
    }
}