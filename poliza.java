import java.util.Scanner;

public class poliza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char poliza;
        double base, costoTotal;
        char alcohol, lentes, enfermedad, mayor40;

        System.out.print("Ingrese su póliza (A o B): ");
        poliza = scanner.next().toUpperCase().charAt(0);

        if (poliza == 'A') {
            base = 1200;
        } else {
            base = 950;
        }

        costoTotal = base;

        System.out.print("¿Tiene un habito con alcohol? (S/N): ");
        alcohol = scanner.next().toUpperCase().charAt(0);
        if (alcohol == 'S') {
            costoTotal += base * 0.10;
        }

        System.out.print("¿Usted utiliza lentes? (S/N): ");
        lentes = scanner.next().toUpperCase().charAt(0);
        if (lentes == 'S') {
            costoTotal += base * 0.05;
        }

        System.out.print("¿Tiene alguna enfermedad (deficiencia cardíaca, diabetes)? (S/N): ");
        enfermedad = scanner.next().toUpperCase().charAt(0);
        if (enfermedad == 'S') {
            costoTotal += base * 0.05;
        }

        System.out.print("¿Es mayor de 40 años? (S/N): ");
        mayor40 = scanner.next().toUpperCase().charAt(0);
        if (mayor40 == 'S') {
            costoTotal += base * 0.20;
        } else {
            costoTotal += base * 0.10;
        }

        System.out.printf("El costo total de la póliza es: $%.2f%n"+ costoTotal);

        scanner.close();
    }
}