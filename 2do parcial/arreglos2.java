import java.util.Scanner;

public class arreglos2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] estudiantes = new String[1];
        System.out.println("REGISTRO DE ESTUDIANTES");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.print("Ingresa el nombre del estudiante " + (i + 1) + ": ");
            estudiantes[i] = sc.nextLine();
        }

        System.out.println("\nLista de estudiantes:");
        for (String nombre : estudiantes) {
            System.out.println("- " + nombre);
        }

        System.out.print("\nIngresa el nombre a buscar: ");
        String buscado = sc.nextLine();
        boolean encontrado = false;
        for (String nombre : estudiantes) {
            if (nombre.equalsIgnoreCase(buscado)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El estudiante " + buscado + " está en la lista.");
        } else {
            System.out.println("El estudiante " + buscado + " no fue encontrado.");
        }

        System.out.print("\n¿Cuántas calificaciones deseas capturar? ");
        int numCalificaciones = sc.nextInt();

        double[] calificaciones = new double[numCalificaciones];
        int reprobadas = 0;

        System.out.println("\nCaptura de calificaciones");
        for (int i = 0; i < numCalificaciones; i++) {
            System.out.print("Ingresa la calificación #" + (i + 1) + ": ");
            calificaciones[i] = sc.nextDouble();

            if (calificaciones[i] < 7.0) {
                reprobadas++;
            }
        }

        if (reprobadas > 0) {
            System.out.println("\nHay " + reprobadas + " calificación(es) reprobatoria(s):");
            for (double cal : calificaciones) {
                if (cal < 7.0) {
                    System.out.println("- " + cal);
                }
            }
        } else {
            System.out.println("\nNo hay calificaciones reprobatorias.");
        }

        sc.close();
    }
}
