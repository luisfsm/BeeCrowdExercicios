package EX1044;

import java.util.Scanner;

public class Ex1044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int primeiroValor = sc.nextInt();
        int segundoValor = sc.nextInt();
        
        if(segundoValor % primeiroValor ==0 || primeiroValor % segundoValor ==0){
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }

        sc.close();
    }
    
}
