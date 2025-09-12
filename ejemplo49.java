import java.util.Scanner;

public class ejemplo49 {
    public static void main(String[] args) {
        Scanner peruano = new Scanner(System.in);

        System.out.print("Ingrese el número de elementos serie Fibonacci: ");
        int N = peruano.nextInt();

        if (N <= 0) {
            System.out.println("El número debe ser mayor que cero.");
            return;
        }

        int A = 0, B = 1;

        
        System.out.print("Serie Fibonacci: ");
        if (N == 1) {
            System.out.print(A);
        } else {
            System.out.print(A + ", " + B);
        }
        int M = 1;
        
        while (M <= N - 2) {
            int C = A + B;
            System.out.print(", " + C);
            A = B;
            B = C;
            M = M + 1;
        }
    }
}
