package tienda;

public class UIObserver implements Observer {
    @Override
    public void actualizar(String evento, Object dato) {
        if ("ESTADO_PEDIDO".equals(evento)) {
            Pedido p = (Pedido) dato;
            System.out.println("[UI] Notificando al usuario: Pedido "
                    + p.getId() + " ahora está " + p.getEstado());
        }
    }
}