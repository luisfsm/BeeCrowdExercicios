package EX1007;

import java.util.Scanner;

public class Ex1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int diff = (a*b - c*d);

        System.out.println(String.format("DIFERENCA = %d", diff));

        sc.close();
    }
    
}
