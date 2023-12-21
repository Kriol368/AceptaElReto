import java.util.*;

public class Ejercicio661 {


    public static String orden(Map<String, Integer> valores, Map<String, Integer> pesos, List<String> objetos) {
        String orden = "";
        do {
            String mayorValor = Collections.max(valores.entrySet(), Map.Entry.comparingByValue()).getKey();
            int mayorValorInt = valores.get(mayorValor);
            for (int i = 0; i < objetos.size(); i++) {
                if (valores.get(objetos.get(i)) == mayorValorInt && !Objects.equals(objetos.get(i), mayorValor)){
                    if (pesos.get(objetos.get(i)) > pesos.get(mayorValor)){
                        mayorValor = objetos.get(i);
                    }
                }
            }
            orden += mayorValor + " ";
            valores.remove(mayorValor);
            pesos.remove(mayorValor);
            objetos.remove(mayorValor);
        }while (!valores.isEmpty());
        return orden;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int veces;
        System.out.println("Introduce el numero de tesoros: ");
        veces = scanner.nextInt();
        LinkedHashMap<String, Integer> valores = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> pesos = new LinkedHashMap<>();
        String nombreActual;
        int valorActual;
        int pesoActual;
        List<String> objetos = new ArrayList<>();

        for (int i = 0; i < veces; i++) {
            nombreActual = scanner.next();
            valorActual = scanner.nextInt();
            pesoActual = scanner.nextInt();
            objetos.add(nombreActual);
            valores.put(nombreActual, valorActual);
            pesos.put(nombreActual, pesoActual);
        }
        System.out.println(orden(valores,pesos,objetos));
    }
}
