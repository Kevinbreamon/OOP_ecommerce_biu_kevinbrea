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
        setNombre(nombre);
        setPrecio(precio);
        setCategoria(categoria);
        this.productoId = productoId;
        this.id = id;
        setDescripcion(descripcion);
        this.urlImagen = urlImagen;
    }

    public void editar(String nombre, String descripcion, String categoria) {
        setNombre(nombre);
        setDescripcion(descripcion);
        setCategoria(categoria);
    }

    public void eliminar() {
        System.out.println("El producto ha sido eliminado de forma exitosa.");
    }

    public void añadir() {
        System.out.println("El producto ha sido añadido de forma exitosa.");
    }

    public void actualizarStockPrecio(float precio) {
        setPrecio(precio);
    }

    public void mostrarDetalle() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Descripción: " + descripcion);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", categoria='" + categoria + '\'' +
                ", productoId=" + productoId +
                ", id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", urlImagen='" + urlImagen + '\'' +
                '}';
    }

    //  A continuacion los getters y setters con sus validaciones

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede ser vacío.");
        }
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("Error: El precio no puede ser negativo.");
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (categoria != null && !categoria.trim().isEmpty()) {
            this.categoria = categoria;
        } else {
            System.out.println("Error: La categoría no puede ser vacía.");
        }
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