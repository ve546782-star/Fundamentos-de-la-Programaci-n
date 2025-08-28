import java.util.Scanner;

public class pares {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int resultado;
        Scanner peruano = new Scanner(System.in);
           System.out.println("Ingrese un numero entero");
           a= peruano.nextInt();
           System.out.println("Ingrese un numero entero");
           b= peruano.nextInt();
           System.out.println("Ingrese un numero entero");
           c= peruano.nextInt();
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;
        if (ab==10 || bc==10 || ac==10)  {
            resultado=10;
            System.out.println("El resultado es "+resultado);
        } else { if (ab==bc+10 || ab==ac+10) {
            resultado=5;
            System.out.println("El resultado es "+resultado);
        } else {
            resultado=0;
            System.out.println("El resultado es "+resultado);    
        }
        }
    }
}
