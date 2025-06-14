package tienda;

public abstract class GestorInventario {

    public abstract void añadirProducto(Producto producto, int cantidad);

    public abstract void eliminarProducto(int productoId);

    public abstract void actualizarStock(int productoId, int nuevoStock);

    public abstract void mostrarInventario();
}