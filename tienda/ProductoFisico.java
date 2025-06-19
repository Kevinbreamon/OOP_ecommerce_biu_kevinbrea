package tienda;

import tienda.excepciones.InventarioInsuficienteException;
import java.util.List;

public class ProductoFisico extends Producto {
    private int stock;
    private float peso;
    private List<String> dimensiones;

    public ProductoFisico(String nombre, float precio, String categoria, int productoId, int id, String descripcion,
                          String urlImagen, int stock, float peso, List<String> dimensiones) {
        super(nombre, precio, categoria, productoId, id, descripcion, urlImagen);
        setStock(stock);
        setPeso(peso);
        setDimensiones(dimensiones);
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Producto Físico:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Categoría: " + categoria);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Dimensiones: " + dimensiones);
        System.out.println("Stock disponible: " + stock + " unidades");
        System.out.println("Imagen: " + urlImagen);
    }

    // Excepciones 

    @Override
    public void reducirStock(int cantidad) throws InventarioInsuficienteException {
        if (cantidad > stock) {
            throw new InventarioInsuficienteException(nombre, cantidad, stock);
        }
        stock -= cantidad;
    }


    // Getters y setters establecido con sus respectivas validaciones

    @Override
    public int getStock() { return stock; }  

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Error: El stock no puede ser negativo.");
        }
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("Error: El peso debe ser mayor a cero.");
        }
    }

    public List<String> getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(List<String> dimensiones) {
        if (dimensiones != null) {
            this.dimensiones = dimensiones;
        } else {
            System.out.println("Error: Las dimensiones no pueden ser nulas.");
        }
    }
    
}