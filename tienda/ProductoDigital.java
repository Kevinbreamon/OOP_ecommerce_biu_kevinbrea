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

        @Override
    public void mostrarDetalle() {
        System.out.println("📱 Producto Digital:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: $" + getPrecio());
        System.out.println("Categoría: " + getCategoria());
        System.out.println("Descripción: " + getDescripcion());
        System.out.println("Licencia: " + licencia);
        System.out.println("Duración de licencia: " + duracion + " días");
        System.out.println("Imagen URL: " + getUrlImagen());
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