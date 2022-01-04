package EX1016;

import java.util.Scanner;

public class Ex1016 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kms = sc.nextInt();
        int minutos = kms*2;

        System.out.println(String.format("%d minutos", minutos));

        sc.close();
        
    } 
}
