import java.util.Scanner;

public class piramidenumeros {
    public static void main(String[] args) {
        Scanner peruano = new Scanner(System.in);
        int A, B, C;

        System.out.print("Ingrese un número entero para la altura de la pirámide: ");
        A = peruano.nextInt();

        for (B = 1; B <= A; B++) {
             for (C = 1; C <= B; C++) {
                System.out.println(C + " ");
             }
             System.out.println();
        }
        peruano.close();
    }
    
}
