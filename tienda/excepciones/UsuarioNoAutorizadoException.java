package tienda.excepciones;

public class UsuarioNoAutorizadoException extends TiendaException {

    public UsuarioNoAutorizadoException(String usuario, String accion) {
        super("Usuario '" + usuario + "' no está autorizado para " + accion);
    }

    public UsuarioNoAutorizadoException(String mensaje) {
        super(mensaje);
    }
}