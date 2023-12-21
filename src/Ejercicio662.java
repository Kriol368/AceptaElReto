import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio662 {


    public static String alturaMinima(List<List<Integer>> alturas){
        int inundadas = 0;
        int altura = 0;
        int cuantas = 0;
        for (int i = 0; i < alturas.size(); i++) {
            cuantas+= alturas.get(i).size();
        }
        do {
            inundadas = 0;
            altura++;
            for (int i = 0; i < alturas.size(); i++) {
                for (int j = 0; j < alturas.get(i).size(); j++) {
                    if (altura >= alturas.get(i).get(j)){
                        inundadas++;
                    }else {
                        break;
                    }
                }
            }
        }while (inundadas < cuantas/2);
        return altura + " " + inundadas;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ancho;
        int alto;
        System.out.println("Introduce el ancho y el alto (el alto siempre es impar): ");
        ancho = scanner.nextInt();
        alto = scanner.nextInt();
        List<List<Integer>> alturas = new ArrayList<>();
        for (int i = 0; i < alto; i++) {
            List<Integer> actual = new ArrayList<>();
            for (int j = 0; j < ancho; j++) {
                actual.add(scanner.nextInt());
            }
            alturas.add(actual);
        }
        System.out.println(alturaMinima(alturas));
    }
}
