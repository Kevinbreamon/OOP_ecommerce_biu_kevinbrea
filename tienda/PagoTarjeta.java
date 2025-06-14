package tienda;

import java.util.UUID;

public class PagoTarjeta implements ProcesoPago {

    @Override
    public String iniciarPago(float monto) {
        String id = UUID.randomUUID().toString();
        System.out.println("Pago con tarjeta iniciado. Monto: $" + monto + " → ID " + id);
        return id;
    }

    @Override
    public boolean verificarPago(String transaccionId) {
        System.out.println("Verificando pago con tarjeta ID " + transaccionId);
        return true; 
    }

    @Override
    public void confirmarPago(String transaccionId, boolean exito) {
        System.out.println(exito
            ? "Pago con tarjeta confirmado. ID " + transaccionId
            : "Pago con tarjeta fallido. ID " + transaccionId);
    }
}