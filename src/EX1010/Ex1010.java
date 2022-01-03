package EX1010;

import java.util.Scanner;

public class Ex1010 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        double C = sc.nextDouble();
        int D = sc.nextInt();
        int E = sc.nextInt();
        double F = sc.nextDouble();
        double resultado = (B*C)+(E*F);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",resultado);

        sc.close();
       
    }
}
