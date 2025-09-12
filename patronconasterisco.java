import java.util.Scanner;

public class patronconasterisco {
    public static void main(String[] args) {
        Scanner peruano = new Scanner(System.in);
        int a, b, c;

        System.out.print("Ingrese el número: ");
        a = peruano.nextInt();

        System.out.println("\nPatrón 1:");
        for (b = 1; b <= a; b++) {
            for (c = 1; c <= a; c++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

        System.out.println("\nPatrón 2:");
        for (b = 1; b <= a; b++) {
            for (c = 1; c <= 2 * (a - b) + 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nPatrón 3:");
        for (b = 1; b <= a; b++) {
            for (c = 1; c <= 2 * b - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }

        peruano.close();
    }
}
