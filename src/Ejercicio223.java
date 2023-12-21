import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio223 {



    public static String Segmento(int[] numeros){
        List<Integer> primero = new ArrayList<>();
        List<Integer> ultimo = new ArrayList<>();
        List<Integer> veces = new ArrayList<>();

        if ((numeros.length == 1) && (numeros[0] != 0)){
            return "1 -> [0,0]";
        } else if (numeros.length == 1) {
            return "SIGUE BUSCANDO";
        }
        boolean todoceros = true;

        int posicion = 0;
        do {
            int primeroActual = 0;
            int ultimoActual = 0;
            for (int i = posicion; i < numeros.length; i++) {
                if (numeros[i] != 0) {
                    primeroActual = i;
                    todoceros = false;
                    break;
                }
                posicion ++;
            }
            if (todoceros){
                return "SIGUE BUSCANDO";
            }
            for (int i = primeroActual; i < numeros.length; i++) {
                if (numeros[i] == 0) {
                    ultimoActual = i - 1;
                    posicion = i + 1;
                    break;
                }
                if(i == numeros.length -1){
                    ultimoActual = i;
                }
                posicion ++;
            }
            primero.add(primeroActual);
            ultimo.add(ultimoActual);
            veces.add(ultimoActual - primeroActual + 1);
        }while (posicion < numeros.length);

        int maximo = veces.get(0);
        int iniciomax = primero.get(0);
        int finalmax = ultimo.get(0);
        for (int i = 0; i < veces.toArray().length; i++) {
            if (veces.get(i) > maximo){
                maximo = veces.get(i);
                iniciomax = primero.get(i);
                finalmax = ultimo.get(i);
            }
        }
        return maximo + " -> " + "[" + iniciomax + "," + finalmax + "]";

    }

    public static void main(String[] args) {
        int cuantos;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero de valores: ");
        cuantos = scanner.nextInt();
        System.out.println("Introduce los valores: ");
        int[] numeros = new int[cuantos];
        for (int i = 0; i < cuantos; i++) {
            numeros[i] = scanner.nextInt();
        }
        System.out.println(Segmento(numeros));
    }
}
