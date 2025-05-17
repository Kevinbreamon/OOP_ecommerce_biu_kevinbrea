package tienda;

public class ProductoDigital extends Producto {
    private String licencia;
    private int duracion;

    public ProductoDigital(String nombre, float precio, String categoria, int productoId, int id, String descripcion,
                           String urlImagen, String licencia, int duracion) {
        super(nombre, precio, categoria, productoId, id, descripcion, urlImagen);
        this.licencia = licencia;
        this.duracion = duracion;
    }

    // A continuación están establecido los getters y setters de la clase 

        public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

}