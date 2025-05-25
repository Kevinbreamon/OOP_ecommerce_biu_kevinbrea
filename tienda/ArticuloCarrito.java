package tienda;

public class ArticuloCarrito {
    private Producto producto;
    private int cantidad;

    public ArticuloCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public float getSubtotal() {
        return producto.getPrecio() * cantidad;
    }

    public void mostrarInformacionProducto() {
        producto.mostrarDetalle(); 
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: $" + getSubtotal());
    }    

    // A continuación están establecido los getters y setters de la clase 

      public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}