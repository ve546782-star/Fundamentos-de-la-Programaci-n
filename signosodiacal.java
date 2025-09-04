import java.util.Scanner;

public class signosodiacal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu día de nacimiento (1-31): ");
        int dia = sc.nextInt();

        System.out.print("Ingresa tu mes de nacimiento (1-12): ");
        int mes = sc.nextInt();

        String horoscopo = "";

        switch (mes) {
            case 1:
                horoscopo = (dia <= 20) ? "Capricornio" : "Acuario";
                break;
            case 2:
                horoscopo = (dia <= 19) ? "Acuario" : "Piscis";
                break;
            case 3:
                horoscopo = (dia <= 20) ? "Piscis" : "Aries";
                break;
            case 4:
                horoscopo = (dia <= 20) ? "Aries" : "Tauro";
                break;
            case 5:
                horoscopo = (dia <= 21) ? "Tauro" : "Géminis";
                break;
            case 6:
                horoscopo = (dia <= 21) ? "Géminis" : "Cáncer";
                break;
            case 7:
                horoscopo = (dia <= 22) ? "Cáncer" : "Leo";
                break;
            case 8:
                horoscopo = (dia <= 23) ? "Leo" : "Virgo";
                break;
            case 9:
                horoscopo = (dia <= 23) ? "Virgo" : "Libra";
                break;
            case 10:
                horoscopo = (dia <= 23) ? "Libra" : "Escorpio";
                break;
            case 11:
                horoscopo = (dia <= 22) ? "Escorpio" : "Sagitario";
                break;
            case 12:
                horoscopo = (dia <= 21) ? "Sagitario" : "Capricornio";
                break;
            default:
                horoscopo = "Fecha inválida";
                break;
        }

        System.out.println("Tu horóscopo es: " + horoscopo);
        sc.close();
    }
}