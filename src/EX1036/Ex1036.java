package EX1036;
import java.io.IOException;

import java.util.Scanner;

public class Ex1036 {
    public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(System.in);

        double a =sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if ((a == 0) | (b * b - 4 * a * c < 0)) {
			System.out.println("Impossivel calcular");
            return;
		}
        
        double bascara = Math.sqrt((b * b) - 4 * a * c);
        double R1 = (-b + bascara) / (2 * a);
        double R2 = (-b - bascara) / (2 * a);
        System.out.println(String.format("R1 = %.5f", R1));
        System.out.println(String.format("R2 = %.5f", R2));

        sc.close();
    }
}
