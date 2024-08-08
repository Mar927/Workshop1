public abstract class Embarcacion {
    protected Capitan capitan;
    protected double precioBase;
    protected double recargo;
    protected int anioFabricacion;
    protected double eslora;
    protected Usuario usuario;

    public Embarcacion(Capitan capitan, double precioBase, double recargo, int anioFabricacion, double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.recargo = recargo;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }

    public abstract double calcularMontoAlquiler();

    // Getters y Setters
    public Capitan getCapitan() {
        return capitan;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getRecargo() {
        return recargo;
    }

    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}