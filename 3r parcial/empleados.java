import java.util.Scanner;

public class empleados {

    public static void main(String[] args) {
        Scanner peruano = new Scanner(System.in);

        String[] nombres = new String[5];
        double[] sueldosPorHora = new double[5];
        double[][] horasPorDia = new double[5][6]; 
        String[] descansos = new String[5];

        System.out.println("Por favor ingrese la información de los 5 choferes.\n");

        for (int i = 0; i < 5; i++) {
            System.out.println("Chofer " + (i + 1) + " ");

            System.out.print("Nombre: ");
            nombres[i] = leerTexto(peruano, "El nombre no puede estar vacío.");

            sueldosPorHora[i] = leerDoublePositivo(peruano, "Sueldo por hora: ");

            horasPorDia[i][0] = leerDoublePositivo(peruano, "Horas lunes: ");
            horasPorDia[i][1] = leerDoublePositivo(peruano, "Horas martes: ");
            horasPorDia[i][2] = leerDoublePositivo(peruano, "Horas miércoles: ");
            horasPorDia[i][3] = leerDoublePositivo(peruano, "Horas jueves: ");
            horasPorDia[i][4] = leerDoublePositivo(peruano, "Horas viernes: ");
            horasPorDia[i][5] = leerDoublePositivo(peruano, "Horas sábado: ");

            descansos[i] = leerDiaDescanso(peruano);
            System.out.println();
        }

        double totalEmpresa = 0;
        double mayorLunes = -1;
        String masLunes = "";

        System.out.println("Reporte semanal");
        for (int i = 0; i < 5; i++) {
            double totalHoras = 0;
            for (int j = 0; j < 6; j++) {
                totalHoras += horasPorDia[i][j];
            }
            double sueldoSemanal = totalHoras * sueldosPorHora[i];
            totalEmpresa += sueldoSemanal;

            System.out.println(nombres[i] + ": " + totalHoras + " horas - $" + sueldoSemanal + " - Descansa: " + descansos[i]);

            if (horasPorDia[i][0] > mayorLunes) {
                mayorLunes = horasPorDia[i][0];
                masLunes = nombres[i];
            }
        }

        System.out.println("\nTotal que pagará la empresa: $" + totalEmpresa);
        System.out.println("El que trabaja más horas el lunes es: " + masLunes + " con " + mayorLunes + " horas.");

        peruano.close();
    }

    public static String leerTexto(Scanner scanner, String mensajeError) {
        String texto;
        do {
            texto = scanner.nextLine().trim();
            if (texto.isEmpty()) {
                System.out.print(mensajeError + " Intente nuevamente: ");
            }
        } while (texto.isEmpty());
        return texto;
    }

    public static double leerDoublePositivo(Scanner scanner, String mensaje) {
        double valor = -1;
        while (true) {
            System.out.print(mensaje);
            if (scanner.hasNextDouble()) {
                valor = scanner.nextDouble();
                scanner.nextLine(); 
                if (valor >= 0) break;
                else System.out.println("El número debe ser positivo. Intente nuevamente.");
            } else {
                System.out.println("Entrada inválida. Debe ser un número. Intente nuevamente.");
                scanner.nextLine(); 
            }
        }
        return valor;
    }

    public static String leerDiaDescanso(Scanner scanner) {
        String[] diasValidos = { "lunes", "martes", "miércoles", "miercoles", "jueves", "viernes", "sábado", "sabado", "domingo" };
        String dia;
        while (true) {
            System.out.print("Día de descanso: ");
            dia = scanner.nextLine().trim().toLowerCase();
            for (String valido : diasValidos) {
                if (dia.equals(valido)) {
                    if (dia.equals("miercoles")) dia = "miércoles";
                    if (dia.equals("sabado")) dia = "sábado";
                    return dia;
                }
            }
            System.out.println("Día inválido. Intente nuevamente. (Ej: lunes, martes...)");
        }
    }
}
