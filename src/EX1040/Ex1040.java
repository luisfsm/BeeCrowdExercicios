package EX1040;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1040 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double nota1 = sc.nextDouble()*2;
        double nota2 = sc.nextDouble()*3;
        double nota3 = sc.nextDouble()*4;
        double nota4 = sc.nextDouble()*1;
        double media = (nota1+nota2+nota3+nota4)/10;


        System.out.println("Media: "+df.format(media));
        if(media >=7){
            System.out.println("Aluno aprovado.");

        }else if(media>=5 && media < 7) {
            System.out.println("Aluno em exame.");

            double notaExame = sc.nextDouble();

            System.out.println("Nota do exame: "+df.format(notaExame));
            media = (media+notaExame)/2;
            if(media>=5){
                System.out.println("Aluno aprovado.");
            }else{
                System.out.println("Aluno reprovado.");
            }

            System.out.println("Media final: "+df.format(media));

        }else {
            System.out.println("Aluno reprovado.");
        }

        sc.close();
    }
}
