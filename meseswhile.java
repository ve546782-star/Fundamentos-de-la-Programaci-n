import java.util.Scanner;

public class meseswhile {
    public static void main(String[] args) {
        Scanner peruano = new Scanner(System.in);

        String[] nombresdeMeses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        int[] diasMeses = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        int mes;

        while (true) {
            System.out.println("\nIngrese un número del 1 al 12 para ver el mes o 0 para terminar el programa");
            mes = peruano.nextInt();

            if (mes == 0) {
                System.out.println("terminando programa");
                break;
            }

            if (mes < 1 || mes > 12) {
                System.out.println("Número inválido. Intente nuevamente.");
            } else {
                System.out.println(nombresdeMeses[mes - 1] + " - " + diasMeses[mes - 1] + " días");
            }
        }

        peruano.close();
    }
}