import java.util.Scanner;

public class ejemplo46 {
    public static void main(String[] args) {
        Scanner peruano = new Scanner(System.in);
        int M= -1;
        int CA;
        double AH = 0;

        while (M <= 12) {
                System.out.println("INGRESE EL AHORRO DEL MES " + M + ": " );
                CA = peruano.nextInt();
                AH = AH + CA;
                M = M + 1;
                System.out.println("El ahorro del mes " + M + " es " + AH);

                }
        }

            
    }
    

