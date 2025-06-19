package tienda;

public class InventarioObserver implements Observer {
    @Override
    public void actualizar(String evento, Object dato) {
        if ("ESTADO_PEDIDO".equals(evento)) {
            Pedido p = (Pedido) dato;
            System.out.println("[Inventario] Pedido " + p.getId()
                    + " cambió a " + p.getEstado() + ". Actualizando stock...");
        }
    }
}