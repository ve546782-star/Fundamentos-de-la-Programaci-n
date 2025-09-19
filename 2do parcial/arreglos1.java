import java.util.Scanner;

public class arreglos1 {
    public static void main(String[] args) {
        Scanner peruano = new Scanner(System.in);

        System.out.print("¿Cuántas calificaciones deseas capturar? ");
        int numCalificaciones = peruano.nextInt();

        double[] calificaciones = new double[numCalificaciones];

        for (int i = 0; i < numCalificaciones; i++) {
            System.out.print("Ingresa la calificación #" + (i + 1) + ": ");
            calificaciones[i] = peruano.nextDouble();
        }

        peruano.close();

        double suma = 0;
        double max = calificaciones[0];
        double min = calificaciones[0];

        for (int i = 0; i < calificaciones.length; i++) {
            
            suma += calificaciones[i];
            if (calificaciones[i] > max) {
                max = calificaciones[i];
            }
            if (calificaciones[i] < min) {
                min = calificaciones[i];
            }
        }

        double promedio = suma / calificaciones.length;

        System.out.println("CALIFICACIONES");
        for (double cal : calificaciones) {
            System.out.print(cal + " ");
        }
        System.out.println("\nPromedio: " + promedio);
        System.out.println("Calificación máxima: " + max);
        System.out.println("Calificación mínima: " + min);
    }
}
