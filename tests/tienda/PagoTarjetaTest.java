package tienda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import tienda.excepciones.PagoFallidoException;   // ← importa la excepción

class PagoTarjetaTest {

    @Test
    void confirmarPagoLanzaExcepcionSiFallo() {
        ProcesoPago pago = new PagoTarjeta();
        String id = pago.iniciarPago(120f);

        // 2.º argumento = lambda que ejecuta el código que debe fallar
        assertThrows(PagoFallidoException.class,
                     () -> pago.confirmarPago(id, false));
    }
}