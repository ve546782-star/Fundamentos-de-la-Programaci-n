import java.util.Scanner;

public class meses {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 12");
        int Mes = teclado.nextInt ();
        switch (Mes) {
            case 1: System.out.println("Enero - 31 Dias");
                break;
                case 2: System.out.println("Febrero - 28 Dias");
                break;
                case 3: System.out.println("Marzo - 31 Dias");
                break;
                case 4: System.out.println("Abrir - 30 Dias");
                break;
                case 5: System.out.println("Mayo - 31 Dias");
                break;
                case 6: System.out.println("Junio - 30 Dias");
                break;
                case 7: System.out.println("Julio - 31 Dias");
                break;
                case 8: System.out.println("Agosto - 31 Dias");
                break;
                case 9: System.out.println("Septiembre - 30 Dias");
                break;
                case 10: System.out.println("Octubre - 31 Dias");
                break;
                case 11: System.out.println("Novirembre - 31 Dias");
                break;
                case 12: System.out.println("Diciembre - 31 Dias6");
                break;
                default: System.out.println("Error de Entrada");
                break;
        }
    }
    
}