import java.util.Scanner;

public class Ejercicio616 {


    public static String marcador(String[] sonidos) {
        int puntosIzquierda = 0;
        int puntosDerecha = 0;
        String direccion = "Derecha";
        for (int i = 0; i < sonidos.length; i++) {
            if (sonidos[i].equals("PIC")) {
                if (direccion.equals("Derecha")) {
                    direccion = "Izquierda";
                } else {
                    direccion = "Derecha";
                }
            } else if (sonidos[i].equals("PONG!")){
                if (direccion.equals("Derecha")){
                    puntosIzquierda++;
                }else {
                    puntosDerecha++;
                }
            }
        }


        return puntosIzquierda + " " + puntosDerecha;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longitud;
        do {
            longitud = scanner.nextInt();
            String[] sonidos = new String[longitud];
            for (int i = 0; i < longitud; i++) {
                sonidos[i] = scanner.next();
            }
            System.out.println(marcador(sonidos));
        } while (longitud != 0);
    }
}
