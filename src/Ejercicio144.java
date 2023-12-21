import java.util.Scanner;

public class Ejercicio144 {


    public static StringBuilder teclado(String entrada){
        String resultado = "";
        int posicion = 0;
        int size = 0;
        StringBuilder stringBuilder = new StringBuilder((resultado));
        for (int i = 0; i < entrada.length(); i++) {
            if (entrada.charAt(i) == '-'){
                posicion = 0;
            } else if (entrada.charAt(i) == '+') {
                if (size > 0) {
                    posicion = size - 1;
                }
            } else if (entrada.charAt(i) == '*') {
                if (size > 0) {
                    posicion++;
                }
            } else if (entrada.charAt(i) == '3') {
                if ((size != 0) && (posicion < size)){
                    stringBuilder.deleteCharAt(posicion);
                    size--;
                }

            }else {
                stringBuilder.insert(posicion, entrada.charAt(i));
                posicion++;
                size++;
            }
        }



        return stringBuilder;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada;
        do {
            entrada = scanner.next();
            System.out.println(teclado(entrada));
        }while (scanner.hasNext());
    }
}
