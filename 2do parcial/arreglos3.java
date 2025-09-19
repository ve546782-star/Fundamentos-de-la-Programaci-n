  import java.util.Scanner;

public class arreglos3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos estudiantes vas a ingresar? ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] estudiantes = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el nombre del estudiante " + (i + 1) + ": ");
            estudiantes[i] = sc.nextLine();
        }

        System.out.println("\nListado de estudiantes:");
        for (String estudiante : estudiantes) {
            int length = estudiante.length();


            if (estudiante.equals(estudiante.toLowerCase())) {
                estudiante = estudiante.toUpperCase();
            } else if (estudiante.equals(estudiante.toUpperCase())) {
                estudiante = estudiante.toLowerCase();
            }
            System.out.println(estudiante + " - Número de caracteres: " + length);
        }

        sc.close();
    }
}
