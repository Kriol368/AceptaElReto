import java.util.Scanner;

public class Ejercicio615 {

    public static int potencia(int pasosPotencia, int factor, int tiempo){
        int contador = 0;
        while (tiempo > pasosPotencia) {
            tiempo -= pasosPotencia;
            contador++;
        }
        tiempo -= contador;
        return tiempo * factor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casos = scanner.nextInt();
        int pasosPotencia;
        int factor;
        int tiempo;
        for (int i = 0; i < casos; i++) {
            pasosPotencia = scanner.nextInt();
            factor = scanner.nextInt();
            tiempo = scanner.nextInt();
            System.out.println(potencia(pasosPotencia,factor,tiempo));
        }
    }
}
