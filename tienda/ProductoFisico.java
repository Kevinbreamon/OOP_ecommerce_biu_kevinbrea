package tienda;

import java.util.List;

public class ProductoFisico extends Producto {
    private int stock;
    private float peso;
    private List<String> dimensiones;

    public ProductoFisico(String nombre, float precio, String categoria, int productoId, int id, String descripcion,
                          String urlImagen, int stock, float peso, List<String> dimensiones) {
        super(nombre, precio, categoria, productoId, id, descripcion, urlImagen);
        this.stock = stock;
        this.peso = peso;
        this.dimensiones = dimensiones;
    }

     // A continuación están establecido los getters y setters de la clase 

        public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public List<String> getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(List<String> dimensiones) {
        this.dimensiones = dimensiones;
    }
}