import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio156 {


    public static int Recorrido(int[] pisos){
        int recorrido = 0;
        for (int i = 0; i < pisos.length - 1; i++) {
            if (pisos[i] > pisos[i+1]){
                recorrido += pisos[i] - pisos[i+1];
            } else if (pisos[i] < pisos[i+1]) {
                recorrido += pisos[i+1] - pisos[i];
            }
        }
        return  recorrido;
    }

    public static void main(String[] args) {
        System.out.println(Recorrido(new int[] {5, 5, 4}));
    }
}


 /* List<Integer> pisos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        do {
            pisos.add(scanner.nextInt());
        }while (pisos.get(pisos.size() != -1) */