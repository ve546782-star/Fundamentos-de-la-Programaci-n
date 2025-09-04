import java.util.Scanner;

public class entradacine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PRECIO_BASE = 50;
        final double PRECIO_MIERCOLES = 30;
        final double PRECIO_PAREJA_JUEVES = 75;

        System.out.print("Ingrese el número de personas: ");
        int personas = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Ingrese el día de la semana (ejemplo: lunes, martes, miercoles...): ");
        String dia = scanner.nextLine().toLowerCase();

        System.out.print("¿Tiene membresía? (sí/no): ");
        String tieneMembresiaStr = scanner.nextLine().toLowerCase();
        boolean tieneMembresia = tieneMembresiaStr.equals("si") || tieneMembresiaStr.equals("sí");

        double precioTotal = 0;

        switch (dia) {
            case "miercoles":
                precioTotal = personas * PRECIO_MIERCOLES;
                break;

            case "jueves":
                int parejas = personas / 2;
                int individuales = personas % 2;
                precioTotal = (parejas * PRECIO_PAREJA_JUEVES) + (individuales * PRECIO_BASE);
                break;

            default:
                precioTotal = personas * PRECIO_BASE;
                break;
        }
        if (tieneMembresia) {
            precioTotal = precioTotal * 0.90;
        }

        System.out.println("El precio total a pagar es: $" + precioTotal);

        scanner.close();
    }
}