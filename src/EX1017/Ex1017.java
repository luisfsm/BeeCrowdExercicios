package EX1017;

import java.util.Scanner;

public class Ex1017 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double horasViagem = sc.nextDouble();
        int MediaDeVelocidade = sc.nextInt();

        double mediaCombustivel = (horasViagem*MediaDeVelocidade)/12;

        System.out.println(String.format("%.3f", mediaCombustivel));

        sc.close();
    }
    
}
