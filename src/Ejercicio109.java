import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio109 {

    public static String[] Resultados() {
        Scanner scanner = new Scanner(System.in);
        String[] resultados = new String[2];

        int cuantos = 0;
        String stringActual1, stringActual2;
        int valoractual1, valoractual2;
        Map<String, Integer> puntuacion = new HashMap<>();
        do {
            stringActual1 = scanner.next();
            if (stringActual1.equals("FIN")) {
                break;
            }
            if (!puntuacion.containsKey(stringActual1)) {
                puntuacion.put(stringActual1, 0);
            }
            valoractual1 = scanner.nextInt();
            stringActual2 = scanner.next();
            if (!puntuacion.containsKey(stringActual2)) {
                puntuacion.put(stringActual2, 0);
            }
            valoractual2 = scanner.nextInt();
            if (valoractual1 > valoractual2) {
                int valorGanador = puntuacion.get(stringActual1) + 2;
                int valorPerdedor = puntuacion.get(stringActual2) + 1;
                puntuacion.replace(stringActual1, valorGanador);
                puntuacion.replace(stringActual2, valorPerdedor);
            } else {
                int valorGanador = puntuacion.get(stringActual2) + 2;
                int valorPerdedor = puntuacion.get(stringActual1) + 1;
                puntuacion.replace(stringActual2, valorGanador);
                puntuacion.replace(stringActual1, valorPerdedor);
            }
            cuantos++;
        } while (true);
        int cuantosDeberian = puntuacion.size() * (puntuacion.size() - 1);
        String[] equipos = puntuacion.keySet().toArray(new String[0]);
        int[] puntuaciones = new int[puntuacion.size()];
        int contador = 0;
        for (Integer valor : puntuacion.values()) {
            puntuaciones[contador] = valor;
            contador++;
        }
        int max = 0;
        int posicion = 0;
        boolean empate = false;
        for (int i = 0; i < puntuaciones.length; i++) {
            if (puntuaciones[i] > max) {
                max = puntuaciones[i];
                posicion = i;
                empate = false;
            } else if (puntuaciones[i] == max) {
                empate = true;
            }
        }

        if (empate) {
            resultados[0] = "EMPATE";
        } else {
            resultados[0] = equipos[posicion] + " ";
        }
        resultados[1] = String.valueOf(cuantosDeberian - cuantos);


        return resultados;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            String liga;
            liga = scanner.next();
            if (liga.equals("FIN")) {
                break;
            }
            String[] resultados = Resultados();
            System.out.println(resultados[0] + " " + resultados[1]);
        } while (true);
    }
}
