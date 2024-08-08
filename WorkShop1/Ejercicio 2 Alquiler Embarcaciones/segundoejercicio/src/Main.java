public class Main {
    public static void main(String[] args) {
        // ejemplo de creación de un capitán
        Capitan capitan1 = new Capitan("Luis", "González", "12345");
        Capitan capitan2 = new Capitan("Tatiana", "López", "67890");

        // ejemplo de usuarios
        Usuario usuario1 = new Usuario("ID001", "Carlos", "Avenida Ciudad de Cali", "3175589966");
        Usuario usuario2 = new Usuario("ID002", "Andrea", "Avenida Simon Bolívar", "3115224141");

        // ejemplo de veleros
        Velero velero1 = new Velero(capitan1, 5000, 1000, 2022, 20, 5);
        Velero velero2 = new Velero(capitan2, 4000, 500, 2019, 15, 3);

        // ejemplo de yates
        Yate yate1 = new Yate(capitan1, 15000, 2000, 2023, 30, 6, 45);
        Yate yate2 = new Yate(capitan2, 20000, 3000, 2015, 35, 9, 85);

        // ejemplo de asignación de usuarios a embarcaciones
        velero1.setUsuario(usuario1);
        velero2.setUsuario(usuario2);
        yate1.setUsuario(usuario1);
        yate2.setUsuario(usuario2);

        // ejemplo de calcular y mostrar el valor de alquiler para cada embarcación
        System.out.println("Monto de alquiler para velero 1: $" + velero1.calcularMontoAlquiler());
        System.out.println("Monto de alquiler para velero 2: $" + velero2.calcularMontoAlquiler());
        System.out.println("Monto de alquiler para yate 1: $" + yate1.calcularMontoAlquiler());
        System.out.println("Monto de alquiler para yate 2: $" + yate2.calcularMontoAlquiler());

        // ejemplo de calcular y mostrar el valor precio de compra para cada yate
        System.out.println("Precio de compra para yate 1: $" + yate1.calcularPrecioCompra());
        System.out.println("Precio de compra para yate 2: $" + yate2.calcularPrecioCompra());
    }
}