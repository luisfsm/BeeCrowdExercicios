package EX1005;

import java.util.Scanner;

public class Ex1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble()*3.5;
        double n2 = sc.nextDouble()*7.5;
        double result = (n1+n2)/11;
        System.out.println(String.format("MEDIA = %.5f" , result));
        sc.close();
    }

}
