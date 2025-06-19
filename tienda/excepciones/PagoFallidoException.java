package tienda.excepciones;

public class PagoFallidoException extends TiendaException {
    public PagoFallidoException(String detalle) { super("Pago fallido: " + detalle); }
}