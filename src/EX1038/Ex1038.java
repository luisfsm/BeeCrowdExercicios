package EX1038;

import java.util.Scanner;

public class Ex1038 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorFinal = 0;
        int codigoProduto = sc.nextInt();
        double qtdeProduto = sc.nextDouble();

        switch(codigoProduto){
            case 1 : 
                valorFinal = 4.00*qtdeProduto;
            break;
            case 2 :
                valorFinal = 4.50*qtdeProduto;
            break;
            case 3 : 
                valorFinal = 5.00*qtdeProduto;
            break;
            case 4 :
                valorFinal = 2.00*qtdeProduto;
            break;
            case 5 :
                valorFinal = 1.50*qtdeProduto;
            break;
        }

        System.out.println(String.format( "Total: R$ %.2f",valorFinal));

        sc.close();
    }
    
}
