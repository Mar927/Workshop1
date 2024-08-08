public class Yate extends Embarcacion {
    private int cantidadCamarotes;
    private int vecesAlquilado;

    public Yate(Capitan capitan, double precioBase, double recargo, int anioFabricacion, double eslora, int cantidadCamarotes, int vecesAlquilado) {
        super(capitan, precioBase, recargo, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
        this.vecesAlquilado = vecesAlquilado;
    }

    @Override
    public double calcularMontoAlquiler() {
        double monto = precioBase + recargo;
        if (anioFabricacion > 2020) {
            monto += 20000;
        }
        return monto;
    }

    public double calcularPrecioCompra() {
        double precioCompra = precioBase;

        if (cantidadCamarotes > 8 && vecesAlquilado > 80) {
            precioCompra *= 0.95;
        } else if (cantidadCamarotes > 5 && vecesAlquilado > 50) {
            precioCompra *= 0.90;
        } else if (vecesAlquilado > 50) {
            precioCompra *= 0.80;
        } else if (vecesAlquilado > 20) {
            precioCompra *= 0.90;
        }
        return precioCompra;
    }

    // Getters y Setters
    public int getCantidadCamarotes() {
        return cantidadCamarotes;
    }

    public void setCantidadCamarotes(int cantidadCamarotes) {
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public int getVecesAlquilado() {
        return vecesAlquilado;
    }

    public void setVecesAlquilado(int vecesAlquilado) {
        this.vecesAlquilado = vecesAlquilado;
    }
}