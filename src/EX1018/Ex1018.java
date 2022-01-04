package EX1018;

import java.util.Scanner;

public class Ex1018 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int valor = sc.nextInt();
        int fixedValor = valor;
        int cedulas100 =0, cedulas50 =0,cedulas20 = 0,cedulas10 = 0,cedulas5= 0,cedulas2 = 0,cedulas1 = 0;

        
        while(valor != 0){
            cedulas100 = valor/100;
            valor = valor%100;
            cedulas50 = valor/50;
            valor = valor%50;
            cedulas20 = valor/20;
            valor = valor%20;
            cedulas10 = valor/10;
            valor = valor%10;
            cedulas5 = valor/5;
            valor = valor%5;
            cedulas2 = valor/2;
            valor = valor%2;
            cedulas1 = valor/1;
            valor = valor%1;
        }

        System.out.println(fixedValor);
        System.out.println(String.format("%d nota(s) de R$ 100,00", cedulas100));
        System.out.println(String.format("%d nota(s) de R$ 50,00", cedulas50));
        System.out.println(String.format("%d nota(s) de R$ 20,00", cedulas20));
        System.out.println(String.format("%d nota(s) de R$ 10,00", cedulas10));
        System.out.println(String.format("%d nota(s) de R$ 5,00", cedulas5));
        System.out.println(String.format("%d nota(s) de R$ 2,00", cedulas2));
        System.out.println(String.format("%d nota(s) de R$ 1,00", cedulas1));

        sc.close();
    }
}
