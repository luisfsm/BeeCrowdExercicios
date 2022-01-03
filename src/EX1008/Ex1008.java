package EX1008;

import java.util.Scanner;

public class Ex1008 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int funcionarios = sc.nextInt();
        int horas = sc.nextInt();
        double horaTrabalho = sc.nextDouble();
        double salario = horas * horaTrabalho;

        System.out.println(String.format("NUMBER = %d", funcionarios));
        System.out.println( String.format("SALARY = U$ %.2f",salario));
        
        sc.close();
        
    }
}
