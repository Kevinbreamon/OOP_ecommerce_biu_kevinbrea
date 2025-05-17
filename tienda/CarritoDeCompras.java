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
        articulos.add(new ArticuloCarrito(producto, cantidad));
    }

    public void removerProductoPorId(int productoId) {
        articulos.removeIf(a -> a.getProducto().getProductoId() == productoId);
    }

    public void modificarCantidad(int productoId, int nuevaCantidad) {
        for (ArticuloCarrito articulo : articulos) {
            if (articulo.getProducto().getProductoId() == productoId) {
                articulo.setCantidad(nuevaCantidad);
                break;
            }
        }
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

    // A continuación están establecido los getters y setters de la clase 

        public int getCarritoId() {
        return carritoId;
    }

    public List<ArticuloCarrito> getArticulos() {
        return articulos;
    }

}