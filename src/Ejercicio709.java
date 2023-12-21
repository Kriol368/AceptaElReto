import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio709 {

    public static void añadirVotos(HashMap<String, Integer> numeroDeVotos, String actual) {
        if (numeroDeVotos.containsKey(actual)) {
            int cantidadActual = numeroDeVotos.get(actual) + 1;
            numeroDeVotos.replace(actual, cantidadActual);
        } else {
            numeroDeVotos.put(actual, 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int votos;
        do {
            votos = scanner.nextInt();
            if (votos != 0) {
                HashMap<String, Integer> numeroDeVotos = new HashMap<>();
                TreeSet<String> llaves = new TreeSet<>();
                for (int i = 0; i < votos; i++) {
                    String actual = scanner.next();
                    llaves.add(actual);
                    añadirVotos(numeroDeVotos, actual);
                }
                String[] llavesArray = llaves.toArray(new String[0]);
                int max = 0;
                String ganador = "";
                for (int i = 0; i < llaves.size(); i++) {
                    int actual = numeroDeVotos.get(llavesArray[i]);
                    if (actual > max){
                        max = actual;
                        ganador = llavesArray[i];
                    } else if (actual == max) {
                        ganador = "EMPATE";
                    }
                }
                System.out.println(ganador);
            } else {
                break;
            }
        } while (true);
    }
}
