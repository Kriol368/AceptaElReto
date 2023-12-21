import java.util.Scanner;

public class Ejercicio657 {

    public static String cercano(int A, int B, int C){
        int distanciaAnterior;
        int distanciaPosterior;
        if (A > 0 && B > 0 || A < 0 && B < 0){
            distanciaAnterior = Math.abs(B - A);
        }else {
            distanciaAnterior = Math.abs(B - A - 1);
        }
        if (C > 0 && B > 0 || C < 0 && B < 0){
            distanciaPosterior= Math.abs(C - B);
        }else {
            distanciaPosterior = Math.abs(C - B - 1);
        }
        if (distanciaAnterior > distanciaPosterior){
            return String.valueOf(C);
        } else if (distanciaPosterior > distanciaAnterior) {
            return String.valueOf(A);
        }else{
            return "EMPATE";
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casos;
        System.out.println("Introduce el numero de casos: ");
        casos = scanner.nextInt();
        System.out.println("Introduce los casos: ");
        for (int i = 0; i < casos; i++) {
            int A, B, C;
            A = scanner.nextInt();
            B = scanner.nextInt();
            C = scanner.nextInt();
            System.out.println(cercano(A,B,C));
        }
    }
}
