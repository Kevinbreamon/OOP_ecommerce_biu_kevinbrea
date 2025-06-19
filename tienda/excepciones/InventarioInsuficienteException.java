package tienda.excepciones;

public class InventarioInsuficienteException extends TiendaException {
    public InventarioInsuficienteException(String sku, int solicitado, int disponible) {
        super("Stock insuficiente para el producto " + sku +
              ": solicitado " + solicitado + ", disponible " + disponible);
    }
}