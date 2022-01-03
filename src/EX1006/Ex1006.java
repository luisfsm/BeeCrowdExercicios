package EX1006;

import java.util.Scanner;

public class Ex1006 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble()*2.0;
        double b = sc.nextDouble()*3.0;
        double c = sc.nextDouble()*5.0;

        double resultado = (a + b + c)/10;
        System.out.println(String.format("MEDIA = %.1f", resultado));
        sc.close();
    }
}
