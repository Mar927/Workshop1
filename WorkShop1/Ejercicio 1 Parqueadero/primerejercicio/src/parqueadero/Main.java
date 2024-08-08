package parqueadero;

public class Main {
    public static void main(String[] args) {

        Parqueadero parqueadero = new Parqueadero(1.5);

        Carro carro1 = new Carro("1234ABC", "Toyota", "Corolla");
        Carro carro2 = new Carro("5678DEF", "Honda", "Civic");
        Carro carro3 = new Carro("9101GHI", "Ford", "Focus");

        parqueadero.parquearCarro(carro1, 0, 0);
        parqueadero.parquearCarro(carro2, 1, 1);
        parqueadero.parquearCarro(carro3, 2, 2);

        parqueadero.parquearCarro(carro1, 0, 0); // Este debería fallar

        // Llamada al método corregida, eliminando el objeto Carro
        double costo = parqueadero.cobrarPorTiempo(3);
        System.out.println("Costo de estacionamiento para 3 horas: " + costo);

        parqueadero.mostrarEstadoParqueadero();
    }
}