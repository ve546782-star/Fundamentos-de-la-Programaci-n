import java.util.Scanner;
import static java.util.Objects.equals;

public class multas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String res,s="si";
        int Velocidad;
        System.out.println("Ingrese la Velocidad");
        Velocidad= teclado.nextInt();
        System.out.println("¿Hoy es el cumpleaños del conductor?");
        res=teclado.next();
        
        if(res.equals(s)) {
            System.out.println("No hay multa");
        } else if (Velocidad<=60) {
            
                System.out.println("0=Sin multa");
            }else if(Velocidad>=61 && Velocidad <=80) {

                System.out.println("1=Multa pequeña");
            }else {
                
                System.out.println("2=Multa grande");
         }
     }
}