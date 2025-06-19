package tienda.excepciones;

public class ProductoNoEncontradoException extends TiendaException {

    public ProductoNoEncontradoException(String sku) {
        super("Producto no encontrado: " + sku);
    }

    public ProductoNoEncontradoException(String sku, Throwable causa) {
        super("Producto no encontrado: " + sku);
        initCause(causa);
    }
}