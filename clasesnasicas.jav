import java.util.Date;
import java.util.List;
import java.util.ArrayList;

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

public abstract class Usuario {
    protected String nombre;
    protected String apellido;
    protected String username;
    protected String correo;
    protected int edad;
    protected Date fechaCreacion;
    protected String direccion;

    public Usuario(String nombre, String apellido, String username, String correo, int edad, Date fechaCreacion, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.correo = correo;
        this.edad = edad;
        this.fechaCreacion = fechaCreacion;
        this.direccion = direccion;
    }

    public void actualizarDatos(String datos) { }

    public boolean verificarCuenta(String contrasena) {
        return true;
    }

    public boolean autenticarSesion(String string, String contrasena) {
        return true;
    }

    // A continuación están establecido los getters y setters de la clase 

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getContraseña() { return contraseña; }
    public void setContraseña(String contraseña) { this.contraseña = contraseña; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public Date getFechaCreacion() { return fechaCreacion; }
    public void setFechaCreacion(Date fechaCreacion) { this.fechaCreacion = fechaCreacion; }

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }
}

public class Cliente extends Usuario {
    private String direccion;
    private String metodoPago;

    public Cliente(String nombre, String apellido, String username, String correo, int edad, Date fechaCreacion, String direccion, String metodoPago) {
        super(nombre, apellido, username, correo, edad, fechaCreacion, direccion);
        this.metodoPago = metodoPago;
    }

    public void consultarMetodoPago() { }
    public void añadirProductoMensaje(String mensaje) { }
    public void pagarCarrito() { }
    public void gestionarCarritoCompra() { }

    // A continuación están establecido los getters y setters de la clase 

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
}

public class Admin extends Usuario {
    public Admin(String nombre, String apellido, String username, String correo, int edad, Date fechaCreacion, String direccion) {
        super(nombre, apellido, username, correo, edad, fechaCreacion, direccion);
    }

    public void gestionarUsuarios(Usuario usuario) { }
    public void gestionarProductos(Producto producto) { }
    public void consultarReabastecimiento() { }

    // A continuación están establecido los getters y setters de la clase 

    public Admin(String nombre, String apellido, String username, String correo,
                 String contraseña, int edad, Date fechaCreacion, String rol) {
        super(nombre, apellido, username, correo, contraseña, edad, fechaCreacion, rol);
    }

    public void gestionarUsuario(Usuario usuario) {
        System.out.println("Gestionando usuario: " + usuario.getUsername());
        // Aquí puedes añadir lógica para editar, suspender, eliminar, etc.
    }

    public void gestionarProducto(Producto producto) {
        System.out.println("Gestionando producto: " + producto.getNombre());
        // Aquí puedes incluir lógica para actualizar stock, eliminar, etc.
    }

    public void consultarResultados() {
        System.out.println("Consultando resultados de ventas, productos y usuarios.");
        // Lógica de reporte o dashboard
    }
}

public class ArticuloCarrito {
    private Producto producto;
    private int cantidad;

    public ArticuloCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public float getSubtotal() {
        return producto.precio * cantidad;
    }

    // A continuación están establecido los getters y setters de la clase 

      public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private List<ArticuloCarrito> articulos;
    private int carritoId;

    public CarritoDeCompras(int carritoId) {
        this.carritoId = carritoId;
        this.articulos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto, int cantidad) {
        articulos.add(new ArticuloCarrito(producto, cantidad));
    }

    public void removerProductoPorId(int productoId) {
        articulos.removeIf(a -> a.producto.productoId == productoId);
    }

    public void modificarCantidad(int productoId, int nuevaCantidad) {
        for (ArticuloCarrito articulo : articulos) {
            if (articulo.producto.productoId == productoId) {
                articulo.cantidad = nuevaCantidad;
                break;
            }
        }
    }

    public float calcularTotal() {
        float total = 0;
        for (ArticuloCarrito articulo : articulos) {
            total += articulo.getSubtotal();
        }
        return total;
    }

    public void vaciar() {
        articulos.clear();
    }

    // A continuación están establecido los getters y setters de la clase 

        public int getCarritoId() {
        return carritoId;
    }

    public List<ArticuloCarrito> getArticulos() {
        return articulos;
    }

}