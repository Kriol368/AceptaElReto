import java.util.Scanner;

public class Ejercicio618 {


    public static int desplazamiento(int ultimo, int siguiente, int[] espacioNiveles){
        int desplazamiento = 0;
        if (ultimo > siguiente){
            for (int i = ultimo ; i >= siguiente; i--) {
                desplazamiento-= espacioNiveles[i - 1];
            }
        } else if (siguiente > ultimo) {
            for (int i = ultimo + 1; i < siguiente; i++) {
                desplazamiento+= espacioNiveles[i - 1];
            }
        }
        return desplazamiento;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroNiveles = scanner.nextInt();
        int[] espacioNiveles = new int[numeroNiveles];
        for (int i = 0; i < numeroNiveles; i++) {
            espacioNiveles[i] = scanner.nextInt();
        }
        int casos = scanner.nextInt();
        int ultimo;
        int siguiente;
        for (int i = 0; i < casos; i++) {
            ultimo = scanner.nextInt();
            siguiente = scanner.nextInt();
            System.out.println(desplazamiento(ultimo,siguiente,espacioNiveles));
        }


    }
}
