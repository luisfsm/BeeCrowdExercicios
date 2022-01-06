package EX1041;

import java.util.Scanner;

public class Ex1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double EixoX = sc.nextDouble();
        double EixoY = sc.nextDouble();

        if (EixoX == 0 && EixoY == 0) {
            System.out.println("Origem");
        } else if (EixoX == 0) {
            System.out.println("Eixo Y");
        } else if (EixoY == 0) {
            System.out.println("Eixo X");
        }else if(EixoX>0 && EixoY > 0){
            System.out.println("Q1");
        }else if(EixoX > 0 && EixoY < 0){
            System.out.println("Q4");
        }else if(EixoX < 0 && EixoY >0 ){
            System.out.println("Q2");
        }else if(EixoX < 0 && EixoY < 0){
            System.out.println("Q3");
        }

        sc.close();
    }
    
}
