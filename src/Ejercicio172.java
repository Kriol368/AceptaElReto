import java.util.Scanner;

public class Ejercicio172 {


    public static boolean comen(String[] panes){
        for (int i = 0; i < panes.length; i++) {
            if (i == panes.length - 1){
                if ((panes[i - 1].equals("D")) && (panes[0].equals("I"))){
                    return false;
                }
            } else if (i == 0) {
                if ((panes[panes.length - 1].equals("D")) && (panes[i + 1].equals("I"))){
                    return false;
                }
            }else {
                if ((panes[i - 1].equals("D")) && (panes[i + 1].equals("I"))){
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int sillas;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero de sillas: ");
        sillas = scanner.nextInt();
        String[] panes = new String[sillas];
        System.out.println("Introduce los panes: ");
        for (int i = 0; i < panes.length; i++) {
            panes[i] = scanner.next();
        }
        if (comen(panes)){
            System.out.println("TODOS COMEN");
        }else {
            System.out.println("ALGUNO NO COMEN");
        }
    }
}

