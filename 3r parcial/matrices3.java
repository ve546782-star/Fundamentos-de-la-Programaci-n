import java.util.Scanner;

public class matrices3 {
    public static void main(String[] args) {
        Scanner peruano = new Scanner(System.in);

        System.out.print("Ingrese el número de estudiantes: ");
        int n = peruano.nextInt();
        System.out.print("Ingrese el número de exámenes: ");
        int m = peruano.nextInt();

        double[][] calif = new double[n][m];
        double[] promedios = new double[n];

        System.out.println("Ingrese las calificaciones");
        for (int i = 0; i < n; i++) {
            System.out.println("Alumno " + (i + 1));
            for (int j = 0; j < m; j++) {
                System.out.print("Examen " + (j + 1) + ": ");
                calif[i][j] = peruano.nextDouble();
            }
        }

        for (int i = 0; i < n; i++) {
            double suma = 0;
            for (int j = 0; j < m; j++) {
                suma += calif[i][j];
            }
            promedios[i] = suma / m;
        }

        System.out.println("Promedio de los estudiantes");
        for (int i = 0; i < n; i++) {
            System.out.printf("Alumno %d: %.2f%n", (i + 1), promedios[i]);
        }

        System.out.println("Alumnos con promedio entre 9 y 10");
        boolean hayAltos = false;
        for (int i = 0; i < n; i++) {
            if (promedios[i] >= 9 && promedios[i] <= 10) {
                hayAltos = true;
                System.out.printf("Alumno %d -> Promedio: %.2f%n", (i + 1), promedios[i]);
            }
        }
        if (!hayAltos) System.out.println("Ninguno.");

        System.out.println("Alumnos con calificacion menor a 7");
        boolean hayBajos = false;
        for (int i = 0; i < n; i++) {
            if (promedios[i] < 7) {
                hayBajos = true;
                System.out.printf("Alumno %d -> Promedio: %.2f%n", (i + 1), promedios[i]);
            }
        }
        if (!hayBajos) System.out.println("Ninguno.");

        double[] promExamenes = new double[m];
        for (int j = 0; j < m; j++) {
            double suma = 0;
            for (int i = 0; i < n; i++) {
                suma += calif[i][j];
            }
            promExamenes[j] = suma / n;
        }

        System.out.println("Promedio por examenes");
        for (int j = 0; j < m; j++) {
            System.out.printf("Examen %d: %.2f%n", (j + 1), promExamenes[j]);
        }

        int posAlto = 0, posBajo = 0;
        for (int j = 1; j < m; j++) {
            if (promExamenes[j] > promExamenes[posAlto]) posAlto = j;
            if (promExamenes[j] < promExamenes[posBajo]) posBajo = j;
        }

        System.out.println("Resultados");
        System.out.printf("Examen con promedio más alto: Examen %d (%.2f)%n", (posAlto + 1), promExamenes[posAlto]);
        System.out.printf("Examen con promedio más bajo: Examen %d (%.2f)%n", (posBajo + 1), promExamenes[posBajo]);
    }
}