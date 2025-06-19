package tienda;

import tienda.excepciones.PagoFallidoException;

public interface ProcesoPago {

    String iniciarPago(float monto);

    boolean verificarPago(String transaccionId);

    // Validar la transacción.
    void confirmarPago(String transaccionId, boolean exito)
            throws PagoFallidoException;      
}