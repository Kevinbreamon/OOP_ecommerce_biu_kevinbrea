package tienda;

public interface Subject {
    void registrar(Observer obs);
    void remover(Observer obs);
    void notificar(String evento, Object dato);
}