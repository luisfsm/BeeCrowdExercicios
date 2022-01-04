package EX1015;

import java.util.Scanner;

public class Ex1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double eixox1 = sc.nextDouble();
        double eixoY1 = sc.nextDouble();
        double eixox2 = sc.nextDouble();
        double eixoY2 = sc.nextDouble();
        
        double distancia = Math.sqrt((Math.pow((eixox2-eixox1),2)+Math.pow((eixoY2-eixoY1),2)));

        System.out.println(String.format("%.4f", distancia));
        
        sc.close();
    }
    
}
