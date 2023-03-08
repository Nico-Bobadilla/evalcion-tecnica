//Ejercicio 2
import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el orden n del cuadrado mágico: ");
        int n = input.nextInt();

        if (n % 2 == 0) {
            System.out.println("El orden debe ser un número impar.");
            return;
        }

        int[][] magicSquare = new int[n][n];
        int row = n-1;
        int col = n/2;

        for (int i = 1; i <= n*n; i++) {
            magicSquare[row][col] = i;
            row++;
            col++;

            if (row == n && col == n) {
                row = 0;
                col = n-2;
            } else if (row == n) {
                row = 0;
            } else if (col == n) {
                col = 0;
            } else if (magicSquare[row][col] != 0) {
                row -= 2;
                col--;
            }
        }

        System.out.println("El cuadrado mágico de orden " + n + " es:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(magicSquare[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

//Ejercicio 3

public static int moveZerosToLeft(int[] arr) {
    int writeIdx = arr.length - 1;
    for (int i = arr.length - 1; i >= 0; i--) {
        if (arr[i] != 0) {
            arr[writeIdx] = arr[i];
            writeIdx--;
        }
    }
    for (int i = writeIdx; i >= 0; i--) {
        arr[i] = 0;
    }
    return arr.length - writeIdx - 1;
}


//Ejercicio 4

package documentos;

public abstract class Documento {
    // Clase  de la que heredan las demás clases de documentos
}

public class Factura extends Documento {
    // Clase que representa una factura
}

public class Pedido extends Documento {
    // Clase que representa un pedido
}

public class UrgentOrder extends Pedido {
    // Clase que representa un pedido urgente, que hereda de Pedido
}

package recursosHumanos;

import documentos.Documento;

public class Contrato extends Documento {
    // Clase que representa un contrato
}

public class CV extends Documento {
    // Clase que representa un cv
}

// archivo que muestra el documento creado

import java.util.Scanner;

public class ProgramaDocumentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué tipo de documento desea crear? (1=Factura, 2=Pedido, 3=UrgentOrder, 4=Contrato, 5=CV)");
        int opcion = scanner.nextInt();

        Documento documento;
        switch(opcion) {
            case 1:
                documento = new Factura();
                break;
            case 2:
                documento = new Pedido();
                break;
            case 3:
                documento = new UrgentOrder();
                break;
            case 4:
                documento = new recursosHumanos.Contrato();
                break;
            case 5:
                documento = new recursosHumanos.CV();
                break;
            default:
                System.out.println("Opción inválida");
                return;
        }

        
        System.out.println("Se ha creado el siguiente documento: " + documento.getClass().getSimpleName());
    }
}








