package EX1020;

import java.util.Scanner;

public class Ex1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diasEntrada = sc.nextInt();

        int idade = diasEntrada/365;
        int meses = (diasEntrada%365)/30;
        int dias = (diasEntrada%365)%30;

        System.out.println(String.format("%d ano(s)\n%d mes(es)\n%d dia(s)", idade,meses,dias));
        
        sc.close();
    }
}
