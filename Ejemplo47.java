import java.util.Scanner;

public class Ejemplo47 {
    public static void main(String[] args) {
        Scanner peruano = new Scanner(System.in);
        int C = 1;
        int CA;
        int CN = 0;
        int CP = 0;
        double NU;

        System.out.println("ingrese un numero; ");
        NU = peruano.nextInt();
        
        do{
            System.out.println("ingrese un numero; ");
            CA = peruano.nextInt();

            if ( CA > 0){
                CP = CP + 1;
            } else {
                CN = CN + 1;
                
            }
            C++;
        } while (C <= NU); 
            System.out.println("positivos;"+ CP);
            System.out.println("Negativo:"+ CN);
            

        }

        
    }
    

