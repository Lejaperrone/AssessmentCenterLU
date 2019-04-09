import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Estacionamiento estacionamiento = new Estacionamiento(0, 100, 50);

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 1 para ingresar un vehiculo");
        System.out.println("Ingrese 2 para retirar un vehiculo");
        System.out.println("Ingrese 3 para ingresar 25 vehiculos");
        System.out.println("Ingrese 4 para retirar 25 vehiculos");
        System.out.println("Ingrese 5 para saber el precio por dia");
        System.out.println("Ingrese 6 para setear el precio por dia");
        System.out.println("Ingrese 7 para ver el estado actual del estacionamiento");

        while (true) {

            String opcion = teclado.nextLine();

            switch (opcion) {
                case "1":
                    estacionamiento.ingresoDetectado();
                    break;
                case "2":
                    estacionamiento.egresoDetectado();
                    break;
                case "3":
                    for (int i = 0; i < 25; i++) {
                        estacionamiento.ingresoDetectado();
                    }
                    break;
                case "4":
                    for (int j = 0; j < 25; j++) {
                        estacionamiento.egresoDetectado();
                    }
                    break;
                case "5":
                    System.out.println("El precio por día es: $" + estacionamiento.getPrecioPorDia());
                    break;
                case "6":
                    System.out.println("Ingrese el nuevo precio por dia");
                    int precio = teclado.nextInt();
                    int nuevoPrecio = estacionamiento.setPrecioPorDia(precio);
                    System.out.println("El nuevo precio por dia es: $" + nuevoPrecio);
                    break;
                case "7":
                    System.out.println("Cantidad Estacionados " + estacionamiento.getCantidadEstacionados());
                    System.out.println("Espacios Disponibles " + estacionamiento.getEspaciosDisponibles());
                    break;
            }
        }
    }
}
