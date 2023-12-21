import java.util.Scanner;

public class Ejercicio658 {

    public static int cuantosPisos(int bloques) {
        int cuantos = 0;
        int valor = 1;
        do {
            bloques -= valor * valor;
            cuantos++;
            valor += 2;
        } while (bloques > ((valor -2) * (valor -2)));

        return cuantos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bloques;
        System.out.println("Introduce valores (0 para temrminar): ");
        do {
            bloques = scanner.nextInt();
            if (bloques == 0) {
                break;
            } else {
                System.out.println(cuantosPisos(bloques));
            }
        } while (true);
    }
}
