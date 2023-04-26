import java.util.Scanner;
import java.util.Random;

public class Menu {
    public Scanner scanner;
    public Menu() {
        scanner = new Scanner(System.in);
    }
    public void mostrarMenu(){
        int opcion = 0;
        while (opcion != 2){
            System.out.println("\nMENU JUEGO");
            System.out.println("1.- Empezar juego");
            System.out.println("2.- Salir");
            System.out.println("Seleccione una opcion : ");
            opcion = scanner.nextInt();
            System.out.println();
            switch (opcion){
                case 1:
                    Random random = new Random();
                    int jugadaComputadora=random.nextInt(3); // Genera un número aleatorio entre 0 y 2
                    String[] opciones={"Piedra", "Papel", "Tijera"};

                    System.out.print("0 .-Piedra\n1 .-Papel\n2 .-Tijera \nIngrese su jugada : ");
                    int jugadaJugador = scanner.nextInt();

                    System.out.println("\nLa computadora elige: " + opciones[jugadaComputadora]);
                    System.out.println("Usted elige: " + opciones[jugadaJugador]);
                    System.out.println(" ");

                    if (jugadaComputadora == jugadaJugador) {
                        System.out.println("Empate");
                    } else
                        if ((jugadaComputadora == 0 && jugadaJugador == 2) ||
                            (jugadaComputadora == 1 && jugadaJugador == 0) ||
                            (jugadaComputadora == 2 && jugadaJugador == 1)) {
                        System.out.println("La computadora gana");
                    } else {
                        System.out.println("Usted gana");
                    }
                break;
                case 2:
                    System.out.println("Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}
