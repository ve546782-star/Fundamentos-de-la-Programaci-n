import java.util.Scanner;

public class tablamultiplicar {
    public static void main(String[] args) {
         Scanner peruano = new Scanner(System.in);
         int A, B;

         do {
            System.out.println("Ingrese un número para generar su tabla de multiplar (0 para terminar): ");
            A = peruano.nextInt();

            if (A != 0){
                for (B = 1; B <= 9; B++);
                System.out.println(A + " x " + B + " = " + (A * B));
            }
            System.out.println();

         } while (A != 0);
         System.out.println("terminando programa");

        
    }
    
}
