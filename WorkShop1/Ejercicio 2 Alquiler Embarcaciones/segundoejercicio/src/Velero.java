public class Velero extends Embarcacion {
    private int cantidadMastiles;

    public Velero(Capitan capitan, double precioBase, double recargo, int anioFabricacion, double eslora, int cantidadMastiles) {
        super(capitan, precioBase, recargo, anioFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    @Override
    public double calcularMontoAlquiler() {
        double monto = precioBase + recargo;
        if (anioFabricacion > 2020) {
            monto += 20000;
        }
        if (cantidadMastiles > 4) {
            monto *= 1.10;
        }
        return monto;
    }

    // Getters y Setters
    public int getCantidadMastiles() {
        return cantidadMastiles;
    }

    public void setCantidadMastiles(int cantidadMastiles) {
        this.cantidadMastiles = cantidadMastiles;
    }
}