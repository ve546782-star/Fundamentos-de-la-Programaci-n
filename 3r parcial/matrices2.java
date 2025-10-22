import java.util.Scanner;

public class matrices2 {
    public static void main(String[] args) {
        Scanner peruano = new Scanner(System.in);
        int[][] matrix = new int[4][4];
        boolean filled = false;

        while (true) {
            System.out.println("1. Rellenar la matriz");
            System.out.println("2. Suma de filas y columnas");
            System.out.println("3. Suma de una fila específica");
            System.out.println("4. Suma de una columna específica");
            System.out.println("5. Mayor y menor con posiciones");
            System.out.println("6. Contar pares");
            System.out.println("7. Contar impares");
            System.out.println("8. Matriz con cuadrados");
            System.out.println("9. Suma diagonal principal");
            System.out.println("10. Suma diagonal");
            System.out.println("11. Media de la matriz");
            System.out.println("0. Salir");
            int option = peruano.nextInt();

            if (option == 0) break;

            if (option == 1) {
                fillMatrix(matrix, peruano);
                filled = true;
                System.out.println("Matriz rellenada con exito:");
                printMatrix(matrix);
            } else if (filled) {
                switch (option) {
                    case 2:
                        sumRowsAndColumns(matrix);
                        break;
                    case 3:
                        sumSpecificRow(matrix, peruano);
                        break;
                    case 4:
                        sumSpecificColumn(matrix, peruano);
                        break;
                    case 5:
                        findMaxMin(matrix);
                        break;
                    case 6:
                        countEven(matrix);
                        break;
                    case 7:
                        countOdd(matrix);
                        break;
                    case 8:
                        squareMatrix(matrix);
                        break;
                    case 9:
                        sumMainDiagonal(matrix);
                        break;
                    case 10:
                        sumInverseDiagonal(matrix);
                        break;
                    case 11:
                        averageMatrix(matrix);
                        break;
                    default:
                        System.out.println("Opción invalida");
                }
                System.out.println("Matriz actual:");
                printMatrix(matrix);
            } else {
                System.out.println("Debes rellenar la matriz primero.");
            }
        }
        peruano.close();
    }

    private static void fillMatrix(int[][] matrix, Scanner peruano) {
        boolean[] used = new boolean[16]; 
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                while (true) {
                    System.out.print("Introduce valor para [" + i + "][" + j + "]: ");
                    int value = peruano.nextInt();
                    if (value < 0 || value >= 16 || used[value]) {
                        System.out.println("Valor repetido o inválido (usa 0-15 únicos). Intenta de nuevo.");
                    } else {
                        matrix[i][j] = value;
                        used[value] = true;
                        break;
                    }
                }
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    private static void sumRowsAndColumns(int[][] matrix) {
        System.out.println("Suma de filas:");
        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += matrix[i][j];
            }
            System.out.println("Fila " + i + ": " + sum);
        }
        System.out.println("Suma de columnas:");
        for (int j = 0; j < 4; j++) {
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                sum += matrix[i][j];
            }
            System.out.println("Columna " + j + ": " + sum);
        }
    }

    private static void sumSpecificRow(int[][] matrix, Scanner peruano) {
        int row;
        do {
            System.out.print("Elige fila (0-3): ");
            row = peruano.nextInt();
        } while (row < 0 || row > 3);
        int sum = 0;
        for (int j = 0; j < 4; j++) {
            sum += matrix[row][j];
        }
        System.out.println("Suma de fila " + row + ": " + sum);
    }

    private static void sumSpecificColumn(int[][] matrix, Scanner peruano) {
        int col;
        do {
            System.out.print("Elige columna (0-3): ");
            col = peruano.nextInt();
        } while (col < 0 || col > 3);
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += matrix[i][col];
        }
        System.out.println("Suma de columna " + col + ": " + sum);
    }

    private static void findMaxMin(int[][] matrix) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int maxI = 0, maxJ = 0, minI = 0, minJ = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxI = i;
                    maxJ = j;
                }
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minI = i;
                    minJ = j;
                }
            }
        }
        System.out.println("Mayor: " + max + " en [" + maxI + "][" + maxJ + "]");
        System.out.println("Menor: " + min + " en [" + minI + "][" + minJ + "]");
    }

    private static void countEven(int[][] matrix) {
        int count = 0;
        for (int[] row : matrix) {
            for (int val : row) {
                if (val % 2 == 0) count++;
            }
        }
        System.out.println("Números pares: " + count);
    }

    private static void countOdd(int[][] matrix) {
        int count = 0;
        for (int[] row : matrix) {
            for (int val : row) {
                if (val % 2 != 0) count++;
            }
        }
        System.out.println("Números impares: " + count);
    }

    private static void squareMatrix(int[][] matrix) {
        System.out.println("Matriz con cuadrados:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print((val * val) + "\t");
            }
            System.out.println();
        }
    }

    private static void sumMainDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += matrix[i][i];
        }
        System.out.println("Suma diagonal principal: " + sum);
    }

    private static void sumInverseDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += matrix[i][3 - i];
        }
        System.out.println("Suma diagonal inversa: " + sum);
    }

    private static void averageMatrix(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int val : row) {
                sum += val;
            }
        }
        double avg = (double) sum / 16;
        System.out.println("Media: " + avg);
    }
}