import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio660 {


    public static int cuantosPictogramas(String cadena){
        Set<String> silabas = new HashSet<>();
        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚäëïöüÄËÏÖÜàèìòùÀÈÌÒÙ";
        String[] palabras = cadena.split(" ");
        for (int i = 0; i < palabras.length ; i++) {
            for (int j = 0; j < palabras[i].length() - 1; j++) {
                String actual = palabras[i];
                if (actual.length() == 1){
                    silabas.add(actual);
                }else if (!vocales.contains(actual.charAt(j)+"") && vocales.contains(actual.charAt(j+1)+"")){
                   if (actual.length()>2 && j < actual.length()-3) {
                       if (vocales.contains(actual.charAt(j + 3) + "")) {
                           silabas.add(actual.charAt(j) + "" + actual.charAt(j + 1));
                       } else {
                           silabas.add(actual.charAt(j) + "" + actual.charAt(j + 1) + actual.charAt(j + 2));
                       }
                   }else if(j == actual.length()-3) {
                       silabas.add(actual.charAt(j) + "" + actual.charAt(j + 1) + actual.charAt(j + 2));
                   }else {
                       silabas.add(actual.charAt(j)+""+actual.charAt(j+1));
                   }

                } else if (vocales.contains(actual.charAt(j)+"") && vocales.contains(actual.charAt(j+1)+"")) {
                    silabas.add(actual.charAt(j+1)+"");
                } else if (j==0 && vocales.contains(actual.charAt(j)+"")) {
                    silabas.add(actual.charAt(j)+"");
                }
            }
        }



        return silabas.size();
    }

    public static void main(String[] args) {
        int veces;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero de veces: ");
        veces = scanner.nextInt();
        scanner.nextLine();
        String cadena;
        for (int i = 0; i < veces; i++) {
            System.out.println("Introduce una cadena");
            cadena = scanner.nextLine();
            System.out.println(cuantosPictogramas(cadena));
        }
    }
}
