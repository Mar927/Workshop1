package parqueadero;

public class Parqueadero {
    private final Carro[][] parqueadero;
    private final double tarifaPorHora;

    public Parqueadero(double tarifaPorHora) {
        this.parqueadero = new Carro[5][10];  // Matriz de 5x10
        this.tarifaPorHora = tarifaPorHora;
    }

    public boolean parquearCarro(Carro carro, int fila, int columna) {
        if (fila >= 0 && fila < parqueadero.length && columna >= 0 && columna < parqueadero[0].length) {
            if (parqueadero[fila][columna] == null) {
                parqueadero[fila][columna] = carro;
                return true;
            } else {
                System.out.println("Este espacio no se encuentra disponible");
            }
        } else {
            System.out.println("Este lugar no se encuentra al interior del parqueadero");
        }
        return false;
    }

    // Si el parámetro 'carro' no se utiliza, se puede eliminar
    public double cobrarPorTiempo(int horas) {
        return horas * tarifaPorHora;
    }

    public void mostrarEstadoParqueadero() {
        for (Carro[] fila : parqueadero) {
            for (Carro carro : fila) {
                if (carro != null) {
                    System.out.print("X ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}