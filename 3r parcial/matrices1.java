import java.util.Scanner;

public class matrices1 {
    public static void main(String[] args) {
        Scanner peruano = new Scanner(System.in);

        System.out.print("Ingrese el número de vendedores: ");
        int n = peruano.nextInt();

        System.out.print("Ingrese el número de zonas: ");
        int m = peruano.nextInt();

        int[][] ventas = new int[n][m];

        System.out.println("Ingrese las ventas");
        for (int i = 0; i < n; i++) {
            System.out.println("Vendedor " + (i + 1) + ":");
            for (int j = 0; j < m; j++) {
                System.out.print("  Zona " + (j + 1) + ": ");
                ventas[i][j] = peruano.nextInt();
            }
        }

        int zonaMasVendida = -1;
        int maxZona = 0;
        int totalGeneral = 0;

        for (int j = 0; j < m; j++) {
            int totalZona = 0;
            for (int i = 0; i < n; i++) {
                totalZona += ventas[i][j];
            }
            if (totalZona > maxZona) {
                maxZona = totalZona;
                zonaMasVendida = j;
            }
        }

        int vendedorMas = -1, vendedorMenos = -1;
        int maxVenta = 0, minVenta = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int totalVendedor = 0;
            for (int j = 0; j < m; j++) {
                totalVendedor += ventas[i][j];
            }

            totalGeneral += totalVendedor;

            if (totalVendedor > maxVenta) {
                maxVenta = totalVendedor;
                vendedorMas = i;
            }

            if (totalVendedor < minVenta) {
                minVenta = totalVendedor;
                vendedorMenos = i;
            }
        }

        System.out.println("Resultados de las ventas");
        System.out.println("Zona que más computadoras vendió: Zona " + (zonaMasVendida + 1) + " con " + maxZona + " computadoras.");
        System.out.println("Vendedor que menos computadoras vendió: Vendedor " + (vendedorMenos + 1) + " con " + minVenta + " computadoras.");
        System.out.println("Vendedor que más computadoras vendió: Vendedor " + (vendedorMas + 1) + " con " + maxVenta + " computadoras.");
        System.out.println("Total general de computadoras vendidas: " + totalGeneral);
    }
}