package tienda;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import tienda.excepciones.PagoFallidoException;

public class PagoTarjeta implements ProcesoPago {

    @Override
    public String iniciarPago(float monto) {
        if (monto <= 0)
            throw new IllegalArgumentException("El monto debe ser mayor a cero.");

        String id = UUID.randomUUID().toString();
        System.out.printf("Pago con tarjeta iniciado. Monto: $%.2f → ID %s%n",
                          monto, id);
        return id;
    }

    @Override
    public boolean verificarPago(String transaccionId) {
        System.out.println("Verificando pago con tarjeta ID " + transaccionId);
        return ThreadLocalRandom.current().nextInt(10) != 0;
    }

    @Override
    public void confirmarPago(String transaccionId, boolean exito)
            throws PagoFallidoException {

        if (exito) {
            System.out.println("Pago con tarjeta confirmado. ID " + transaccionId);
        } else {
            
            throw new PagoFallidoException(
                    "La pasarela rechazó la transacción " + transaccionId);
        }
    }
}