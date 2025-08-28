import java.util.Scanner;
public class VerificarEdad {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("introduce tu edad: ");
        int Edad = sc.nextInt();

        if (Edad < 18) {
            System.out.println("Menor de edad.");
        } else if (Edad >= 18 && Edad < 65) {
            System.out. println("Mayor de Edad");
        } else if (Edad >= 65){
            System.out.println("Adulto Mayor");

        }

sc.close();
    }
}

/* if (Edad < 18) {
            System.out.println("Menor de edad.");
        } else if (Edad >= 18 && Edad < 65) {
            System.out. println("Mayor de Edad");
        } else {
            System.out.println("Adulto Mayor");
        }
sc.close();
    }
 
*/