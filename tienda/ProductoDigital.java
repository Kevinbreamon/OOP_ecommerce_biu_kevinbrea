package tienda;

public class ProductoDigital extends Producto {
    private String licencia;
    private int duracion;

    public ProductoDigital(String nombre, float precio, String categoria, int productoId, int id, String descripcion,
                           String urlImagen, String licencia, int duracion) {
        super(nombre, precio, categoria, productoId, id, descripcion, urlImagen);
        setLicencia(licencia);
        setDuracion(duracion);
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Producto Digital:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: $" + getPrecio());
        System.out.println("Categoría: " + getCategoria());
        System.out.println("Descripción: " + getDescripcion());
        System.out.println("Licencia: " + licencia);
        System.out.println("Duración de licencia: " + duracion + " días");
        System.out.println("Imagen URL: " + getUrlImagen());
    }

    // Getters y setters con sus respectivas validaciones

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        if (licencia != null && !licencia.trim().isEmpty()) {
            this.licencia = licencia;
        } else {
            System.out.println("Error: La licencia no puede ser vacía.");
        }
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        if (duracion > 0) {
            this.duracion = duracion;
        } else {
            System.out.println("Error: La duración debe ser mayor a cero.");
        }
    }
}