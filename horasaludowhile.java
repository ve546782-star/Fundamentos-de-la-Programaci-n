import java.util.Scanner;

public class horasaludowhile {
    public static void main(String[] args) {
        Scanner peruano = new Scanner(System.in);
        int hora;

        while (true) {
            System.out.print("Ingresa la hora (0-23) precione -1 para terminar: ");
            hora = peruano.nextInt();

            if (hora == -1) {
                System.out.println("terminando programa");
                break;
            }

            switch (hora) {
                case 6: case 7: case 8: case 9: case 10: case 11: case 12:
                    System.out.println("¡Buenos días!");
                    break;
                case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20:
                    System.out.println("¡Buenas tardes!");
                    break;
                case 21: case 22: case 23: case 0: case 1: case 2: case 3: case 4: case 5:
                    System.out.println("¡Buenas noches!");
                    break;
                default:
                    System.out.println("Hora no válida. Ingresa un número entre 0 y 23.");
                    break;
            }
        }

        peruano.close();
    }
}