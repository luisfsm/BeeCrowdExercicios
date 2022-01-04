package EX3299;

import java.util.Scanner;

public class Ex3299 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numeroTxt = sc.nextLine();
 
        if(numeroTxt.contains("13")){
            System.out.println(String.format("%s es de Mala Suerte", numeroTxt));
        }else{
            System.out.println(String.format("%s NO es de Mala Suerte", numeroTxt));
        }

        sc.close();
    }
    
}
