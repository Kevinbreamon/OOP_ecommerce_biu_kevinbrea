package tienda;

import java.util.UUID;

public class PagoPayPal implements ProcesoPago {

    @Override
    public String iniciarPago(float monto) {
        String id = UUID.randomUUID().toString();
        System.out.println("Pago vía PayPal iniciado. Monto: $" + monto + " → ID " + id);
        return id;
    }

    @Override
    public boolean verificarPago(String transaccionId) {
        System.out.println("Consultando API PayPal para ID " + transaccionId);
        return true; 
    }

    @Override
    public void confirmarPago(String transaccionId, boolean exito) {
        System.out.println(exito
            ? "Pago PayPal confirmado. ID " + transaccionId
            : "Pago PayPal fallido. ID " + transaccionId);
    }
}