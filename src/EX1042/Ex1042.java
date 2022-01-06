package EX1042;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex1042 {
    public static void main(String[] args) {

        List<Integer> listaNumero = new ArrayList<Integer>();
        
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        listaNumero.add(a);
        listaNumero.add(b);
        listaNumero.add(c);

        Collections.sort(listaNumero);

        for(int numero : listaNumero){
            System.out.println(numero);
        }

        System.out.println(String.format("\n%d\n%d\n%d", a,b,c));

        sc.close();
    }
}
