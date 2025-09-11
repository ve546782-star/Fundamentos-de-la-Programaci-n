import java.util.Scanner;

public class numeroperadorwhile {
    public static void main(String[] args) {
        Scanner peruano = new Scanner(System.in);
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Ingresa el primer número: ");
            int num1 = peruano.nextInt();

            System.out.print("Ingresa el segundo número: ");
            float num2 = peruano.nextFloat();

            System.out.print("Ingresa un operador (+, -, *, /): ");
            char operador = peruano.next().charAt(0);

            switch (operador) {
                case '+':
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case '/':
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Error: División por cero no permitida");
                    }
                    break;
                default:
                    System.out.println("Operador no válido");
                    break;
            }

            System.out.print("¿Deseas realizar otra operación? (s/n): ");
            continuar = peruano.next();
        }

        System.out.println("Programa terminado.");
        peruano.close();
    }
}
