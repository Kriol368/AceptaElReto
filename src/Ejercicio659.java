import java.util.*;

public class Ejercicio659 {



    public static Map<Integer, String > equivalencias(){
        Map<Integer, String > equivalencias = new HashMap<>();
        equivalencias.put(1,"T");
        equivalencias.put(2,"G");
        equivalencias.put(3,"C");
        equivalencias.put(4,"F");
        equivalencias.put(5,"D");
        equivalencias.put(6,"R");
        equivalencias.put(7,"H");
        return equivalencias;
    }

    public static String jeroglifico(int valor, Map<Integer,String> equivalencias) {
        String jeroglifico = "";
        List<Integer> valores = new ArrayList<>();
        do {
            valores.add(valor % 10);
            valor = valor / 10;
        }while (valor > 0);
        int cont = 1;
        for (int i = 0; i < valores.size(); i++) {
            for (int j = valores.get(i); j > 0; j--) {
                jeroglifico = equivalencias.get(cont) + jeroglifico;
            }
            cont++;
        }




        return jeroglifico;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor;
        System.out.println("Introduce valores (0 para temrminar): ");
        do {
            valor = scanner.nextInt();
            if (valor == 0) {
                break;
            } else {
                System.out.println((jeroglifico(valor,equivalencias())));
            }
        } while (true);
    }
}
