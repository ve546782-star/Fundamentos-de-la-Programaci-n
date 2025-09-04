import java.util.Scanner;

public class NumMayor1 {
    public static void main(String[] args) {
       Scanner teclado= new Scanner(System.in);
       System.out.println("¿Cuantos números desea ingresar?");
       int serie=teclado.nextInt();
       int i=1;
       int mayor= -99;    
       while(i<=serie){
       System.out.println("Ingrese un número");
       int num=teclado.nextInt();
 if(num>=-99 && num<=99 && num != 0){
      if(num>mayor){
      mayor=num;
      }
      if(num<0){
          System.out.println("Se ha ingresado un número negativo");
      }
      i++;
       } else {
      
              System.out.println("Numero no valido, ingrese un número entre el rango -99 a 99 que no sea cero");
 }}
       System.out.println("El numero mayor es "+mayor);        
    }
}
