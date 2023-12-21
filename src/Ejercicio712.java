import java.util.Scanner;

public class Ejercicio712 {


    public static String respuesta(int[] tiempos, int consultaActual){
        int tiempoInicio = 0;
        int tiempoFinal = 0;
        int numeroEventos = 0;
        int sumatiempoActual;
        int sumatiempoMin = Integer.MAX_VALUE;
        for (int i = 0; i < tiempos.length - consultaActual; i++) {
            sumatiempoActual =  tiempos[i+consultaActual - 1] - tiempos[i];
            if (sumatiempoActual < sumatiempoMin){
                sumatiempoMin = sumatiempoActual;
                tiempoInicio = tiempos[i];
                tiempoFinal = tiempos[i + consultaActual - 1];
                numeroEventos = consultaActual;
            }
        }
        return tiempoInicio + " " + tiempoFinal + " " + numeroEventos;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eventos = scanner.nextInt();
        int[] tiempos = new int[eventos];
        String[] descripciones = new String[eventos];
        for (int i = 0; i < eventos; i++) {
            tiempos[i] = scanner.nextInt();
            descripciones[i] = scanner.nextLine();
        }
        int consulas = scanner.nextInt();
        for (int i = 0; i < consulas; i++) {
            int consultaActual = scanner.nextInt();
            System.out.println(respuesta(tiempos,consultaActual));
        }
    }
}
