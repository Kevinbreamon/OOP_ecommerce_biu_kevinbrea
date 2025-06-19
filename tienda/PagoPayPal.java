package tienda;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import tienda.excepciones.PagoFallidoException;

public class PagoPayPal implements ProcesoPago {

    @Override
    public String iniciarPago(float monto) {
        if (monto <= 0)
            throw new IllegalArgumentException("El monto debe ser mayor a cero.");

        String id = UUID.randomUUID().toString();
        System.out.printf("Pago vía PayPal iniciado. Monto: $%.2f → ID %s%n",
                          monto, id);
        return id;
    }

    @Override
    public boolean verificarPago(String transaccionId) {
        System.out.println("Consultando API PayPal para ID " + transaccionId);
        
        return ThreadLocalRandom.current().nextInt(20) != 0;
    }

    @Override
    public void confirmarPago(String transaccionId, boolean exito)
            throws PagoFallidoException {

        if (exito) {
            System.out.println("Pago PayPal confirmado. ID " + transaccionId);
        } else {
            throw new PagoFallidoException(
                    "PayPal rechazó la transacción " + transaccionId);
        }
    }
}