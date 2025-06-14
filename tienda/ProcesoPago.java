package tienda;

public interface ProcesoPago {

    // Funcion de inicio del pago y devuelve un código/ID de transacción.
    String iniciarPago(float monto);

    // Funcion que verifica el estado de la transacción.
    boolean verificarPago(String transaccionId);

    // funcion que Confirma (o revierte) la transacción.
    void confirmarPago(String transaccionId, boolean exito);
}