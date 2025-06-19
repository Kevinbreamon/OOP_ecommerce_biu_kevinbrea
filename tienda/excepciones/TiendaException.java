package tienda.excepciones;

public abstract class TiendaException extends Exception {
    public TiendaException(String mensaje) { super(mensaje); }
}