import java.util.Scanner;

public class Ejercicio711 {


    public static int verificacion(int codigo){
        int verificacion = 0;
        String codigoString = String.valueOf(codigo);
        int[] digitos = new int[codigoString.length()];
        int valor = codigo;
        for (int i = digitos.length-1; i >= 0; i--) {
            digitos[i] = valor % 10;
            valor = valor/10;
        }
        for (int i = 0; i < digitos.length; i++) {
            int actual;
            int menor = Integer.MAX_VALUE;
            int mayor = 0;
            if (i % 2 != 0){
                //pares
                for (int j = i - 1; j >= 0; j--) {
                    if (digitos[j] > mayor){
                        mayor = digitos[j];
                    }
                }
                actual = digitos[i] * 2 + mayor;
            }else {
                //impares
                for (int j = i + 1; j < digitos.length; j++) {
                    if (digitos[j] < menor){
                        menor = digitos[j];
                    }
                }
                actual = digitos[i] * 3 + menor;
            }
            verificacion += actual;
        }

        return verificacion;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casos = scanner.nextInt();
        for (int i = 0; i < casos; i++) {
            int codigo = scanner.nextInt();
            System.out.println(verificacion(codigo));
        }
    }
}
