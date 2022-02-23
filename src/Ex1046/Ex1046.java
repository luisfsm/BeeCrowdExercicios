package Ex1046;

import java.util.Scanner;

public class Ex1046 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int resultado = 0;

        if(horaInicial > horaFinal){
            resultado = (24- (horaInicial-horaFinal));
        }else if(horaFinal > horaInicial ){
            resultado = (horaFinal - horaInicial);
        }else{
            resultado = 24;
        }
        
        System.out.printf("O JOGO DUROU %d HORA(S)\n", resultado);
        sc.close();
    }
    
}
