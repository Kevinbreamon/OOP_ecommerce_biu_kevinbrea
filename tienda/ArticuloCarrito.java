package tienda;

public class ArticuloCarrito {
    private Producto producto;
    private int cantidad;

    public ArticuloCarrito(Producto producto, int cantidad) {
        setProducto(producto);
        setCantidad(cantidad);
    }

    public float getSubtotal() {
        return producto.getPrecio() * cantidad;
    }

    public void mostrarInformacionProducto() {
        producto.mostrarDetalle(); 
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: $" + getSubtotal());
    }

    // Getters y setters con validaciones

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        if (producto != null) {
            this.producto = producto;
        } else {
            System.out.println("Error: El producto no puede ser nulo.");
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            System.out.println("Error: La cantidad debe ser mayor a cero.");
        }
    }
}