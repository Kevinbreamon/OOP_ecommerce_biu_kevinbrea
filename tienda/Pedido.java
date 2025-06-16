package tienda;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Subject {

    private final int id;
    private String estado = "CREADO";
    private final List<Observer> observadores = new ArrayList<>();

    public Pedido(int id) { this.id = id; }

    public void cambiarEstado(String nuevoEstado) {
        estado = nuevoEstado;
        notificar("ESTADO_PEDIDO", this);
    }

    public int getId() { return id; }
    public String getEstado() { return estado; }

    @Override
    public void registrar(Observer obs) { observadores.add(obs); }

    @Override
    public void remover(Observer obs) { observadores.remove(obs); }

    @Override
    public void notificar(String evento, Object dato) {
        observadores.forEach(o -> o.actualizar(evento, dato));
    }
}