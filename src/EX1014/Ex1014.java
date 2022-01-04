package EX1014;

import java.util.Scanner;

public class Ex1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Quilometros = sc.nextInt();
        double real = sc.nextDouble();
        double resultado = Quilometros / real;
        
        System.out.println(String.format("%.3f km/l", resultado));

        sc.close();
        
    }
}
