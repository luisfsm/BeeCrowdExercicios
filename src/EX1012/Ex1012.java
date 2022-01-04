package EX1012;

import java.util.Scanner;

public class Ex1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ladoA = sc.nextDouble();
        double ladoB = sc.nextDouble();
        double ladoC = sc.nextDouble();
        double pi = 3.14159;

        double areaDotriangulo = (ladoA * ladoC)/2;
        double areaDoCirculo = pi*Math.pow(ladoC, 2);
        double areaDoTrapezio = (ladoA + ladoB) * ladoC / 2;
        double areaQuadrado = ladoB*ladoB;
        double areaRetangulo = ladoA * ladoB;

        System.out.println(String.format("TRIANGULO: %.3f", areaDotriangulo));
        System.out.println(String.format("CIRCULO: %.3f", areaDoCirculo));
        System.out.println(String.format("TRAPEZIO: %.3f", areaDoTrapezio));
        System.out.println(String.format("QUADRADO: %.3f", areaQuadrado));
        System.out.println(String.format("RETANGULO: %.3f", areaRetangulo));

        sc.close();
    }
}
