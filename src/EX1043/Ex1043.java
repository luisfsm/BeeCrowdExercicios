package EX1043;

import java.util.Scanner;

public class Ex1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double ladoA = sc.nextDouble();
        double ladoB = sc.nextDouble();
        double ladoC = sc.nextDouble();

        if ((ladoA < ladoB + ladoC) && (ladoB < ladoA + ladoC) && (ladoC < ladoB + ladoA)) {
            double perimetro = ladoA + ladoB + ladoC;
            System.out.printf("Perimetro = %.1f\n", perimetro);
      } else {
            double area = ((ladoA + ladoB) * ladoC) / 2;
            System.out.printf("Area = %.1f\n", area);
        }
        sc.close();
    }
    
}
