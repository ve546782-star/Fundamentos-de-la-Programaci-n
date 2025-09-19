import java.util.Scanner;

public class arreglos4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidadEstudiantes = 3;

        String[] nombres = new String[cantidadEstudiantes];
        int[] edades = new int[cantidadEstudiantes];
        double[] promedios = new double[cantidadEstudiantes];

        System.out.println("REGISTRO DE ESTUDIANTES");
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.print("Ingresa el nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();

            System.out.print("Ingresa la edad de " + nombres[i] + ": ");
            edades[i] = sc.nextInt();

            System.out.print("Ingresa el promedio de " + nombres[i] + ": ");
            promedios[i] = sc.nextDouble();
            sc.nextLine(); 
        }

        System.out.println("\nLista de estudiantes:");
        System.out.printf("%-15s %-10s %-10s%n", "Nombre", "Edad", "Promedio");
        System.out.println("------------------------------------");

        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.printf("%-15s %-10d %-10.2f%n", nombres[i], edades[i], promedios[i]);
        }

        sc.close();
    }
}
