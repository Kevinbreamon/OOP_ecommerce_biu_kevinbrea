package tienda;

public abstract class Producto {
    protected String nombre;
    protected float precio;
    protected String categoria;
    protected int productoId;
    protected int id;
    protected String descripcion;
    protected String urlImagen;

    public Producto(String nombre, float precio, String categoria, int productoId, int id, String descripcion, String urlImagen) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.productoId = productoId;
        this.id = id;
        this.descripcion = descripcion;
        this.urlImagen = urlImagen;
    }

    public void editar(String nombre, String descripcion, String categoria) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
    }

    public void eliminar() {
        System.out.println("El producto ha sido eliminado de forma exitosa.");
    }

    public void añadir() {
        System.out.println("El producto ha sido añadido de forma exitosa.");
    }

    public void actualizarStockPrecio(float precio) {
        this.precio = precio;
    }

    // A continuación están establecido los getters y setters de la clase 
        public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }
}