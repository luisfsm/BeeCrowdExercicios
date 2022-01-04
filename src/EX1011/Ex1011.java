package EX1011;

import java.util.Scanner;

public class Ex1011 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int raio = sc.nextInt();
        double pi = 3.14159;

        double formula = (4.0/3)*pi*Math.pow(raio, 3);

        System.out.println(String.format("VOLUME = %.3f", formula));

        sc.close();
        
    }
    
}
