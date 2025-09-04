import java.util.Scanner;

public class figuras {
    public static void main(String[] args) {
        Scanner peruano = new Scanner(System.in);
        int opcion;

            System.out.println("seleccione una figura");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectángulo");
            System.out.println("3. Triángulo");
            System.out.println("4. Círculo");
            opcion = peruano.nextInt();

            switch(opcion) {
                case 1:
                    System.out.print("Ingresa el lado del cuadrado: ");
                    double lado = peruano.nextDouble();
                    System.out.println("Área del cuadrado: " + (lado * lado));
                    break;
                case 2:
                    System.out.print("Ingresa la base del rectángulo: ");
                    double baseRect = peruano.nextDouble();
                    System.out.print("Ingresa la altura del rectángulo: ");
                    double alturaRect = peruano.nextDouble();
                    System.out.println("Área del rectángulo: " + (baseRect * alturaRect));
                    break;
                case 3:
                    System.out.print("Ingresa la base del triángulo: ");
                    double baseTri = peruano.nextDouble();
                    System.out.print("Ingresa la altura del triángulo: ");
                    double alturaTri = peruano.nextDouble();
                    System.out.println("Área del triángulo: " + ((baseTri * alturaTri) / 2));
                    break;
                case 4: 
                    System.out.print("Ingresa el radio del círculo: ");
                    double radio = peruano.nextDouble();
                    System.out.println("Área del círculo: " + (Math.PI * radio * radio));
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        } 
    }
