import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio617 {


    public static String mensaje(List<String> nombres){
        String mensaje = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < nombres.size(); j++) {
                mensaje += nombres.get(j).charAt(i);
            }
        }
        return mensaje;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casos = scanner.nextInt();
        for (int i = 0; i < casos; i++) {
            int numeroPuntuaciones = scanner.nextInt();
            List<String> nombres = new ArrayList<>();
            for (int j = 0; j < numeroPuntuaciones; j++) {
                nombres.add(scanner.next());
            }
            System.out.println(mensaje(nombres));
        }
    }
}
