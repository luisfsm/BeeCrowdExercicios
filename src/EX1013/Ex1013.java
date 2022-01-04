package EX1013;

import java.util.Scanner;

public class Ex1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorA = sc.nextInt();
        int valorB = sc.nextInt();
        int valorC = sc.nextInt();

        int maiorAB = (valorA+valorB+Math.abs(valorA-valorB))/2;
        int maiorABC= (maiorAB+valorC+Math.abs(maiorAB - valorC))/2;

        System.out.println(Math.abs(valorA-valorB));
        System.out.println(String.format("%d eh o maior", maiorABC));

        sc.close();
    }
}
