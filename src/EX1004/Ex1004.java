package EX1004;

import java.util.Scanner;

public class Ex1004 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int PROD = a * b;

        System.out.printf("PROD = %d",PROD);
        sc.close();
    }
}
