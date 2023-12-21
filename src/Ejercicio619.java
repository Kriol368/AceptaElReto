import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio619 {


    public static boolean puedeZXSpectrum(int ancho, int alto, String[] imagen) {
        int contadorAncho = 0;
        for (int i = 0; i < ancho / 8; i++) {
            HashSet<String> colores = new HashSet<>();

            for (int j = 0; j < alto; j++) {
                for (int k = 0; k < alto; k++) {
                    colores.add(imagen[k].charAt(j + contadorAncho) + "");
                }
            }
            if (colores.size() > 2) {
                return false;
            }
            contadorAncho += 8;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ancho = scanner.nextInt();
        int alto = scanner.nextInt();
        String[] imagen = new String[alto];
        for (int i = 0; i < alto; i++) {
            imagen[i] = scanner.next();
        }
        System.out.println(puedeZXSpectrum(ancho, alto, imagen));
    }
}
