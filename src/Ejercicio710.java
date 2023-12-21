import java.util.Scanner;

public class Ejercicio710 {

    public static int plazasRepesca(int[]plazasConfederaciones, int plazasTotales){
        int sumaplazas = 0;
        for (int i = 0; i < plazasConfederaciones.length; i++) {
            sumaplazas += plazasConfederaciones[i];
        }
        return plazasTotales - sumaplazas;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casos = scanner.nextInt();
        int[] plazasConfedereaciones = new int[6];
        for (int i = 0; i < casos; i++) {
            int plazasTotales = scanner.nextInt();
            for (int j = 0; j < 6; j++) {
                plazasConfedereaciones[j] = scanner.nextInt();
            }
            System.out.println(plazasRepesca(plazasConfedereaciones,plazasTotales));
        }
    }
}
