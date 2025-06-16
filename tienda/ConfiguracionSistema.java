package tienda;

//  Configuración global del e-commerce (única instancia).

public final class ConfiguracionSistema {

    private static ConfiguracionSistema instancia;

    private ConfiguracionSistema() { }   

    public static synchronized ConfiguracionSistema getInstancia() {
        if (instancia == null) instancia = new ConfiguracionSistema();
        return instancia;
    }

    // Parámetros de configuración
    private String cadenaConexion = "jdbc:mysql://localhost:3306/ecommerce";
    private boolean modoOscuroUI = false;
    private String emailSoporte = "soporte@breastore.com";

    // getters y setters de la clase
    public String getCadenaConexion() { return cadenaConexion; }
    public void setCadenaConexion(String c) { cadenaConexion = c; }

    public boolean isModoOscuroUI() { return modoOscuroUI; }
    public void setModoOscuroUI(boolean v) { modoOscuroUI = v; }

    public String getEmailSoporte() { return emailSoporte; }
    public void setEmailSoporte(String e) { emailSoporte = e; }
}