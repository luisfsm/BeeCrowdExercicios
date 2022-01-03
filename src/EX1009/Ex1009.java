package EX1009;

import java.util.Scanner;

public class Ex1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        double salario = sc.nextDouble();
        double vendas = sc.nextDouble()*0.15;

        double salarioFinal = salario+vendas;
        System.out.println(String.format("TOTAL = R$ %.2f", salarioFinal));
        sc.close();
        
    }
}
