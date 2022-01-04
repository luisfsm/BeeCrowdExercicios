package EX1019;

import java.util.Scanner;

public class Ex1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int duracaoSegundos = sc.nextInt();
        int horas = duracaoSegundos / 3600;
        duracaoSegundos -= horas * 3600;

        int minutos = duracaoSegundos / 60;
        duracaoSegundos -= minutos * 60;

        int segundos = duracaoSegundos;
        System.out.println(String.format("%d:%d:%d", horas ,minutos,segundos));	
        sc.close();
        
    }
    
}
