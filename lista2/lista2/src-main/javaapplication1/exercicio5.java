package javaapplication1;

import java.util.Scanner; 


public class exercicio5{ 
    public static int mediaAluno (int nota1 , int nota2, int media){
        media = nota1 + nota2 / 2;
        if (media > 7 || media == 0){
            System.out.println("Aprovado");
        }
        else if (media < 7){
            System.out.println("Reprovado");
        }
        else if (media == 10){
            System.out.println("Aprovado com Distinção");
        }
        return media;
    }
    
    
        public static void main(String args[]) {
            System.out.println("Digite a 1º nota");
            Scanner nota = new Scanner(System.in);
            int nota1 = nota.nextInt();
            System.out.println("Digite a 2º nota");
            int nota2 = nota.nextInt();
            int media = 0;
            int invocarMetodo = mediaAluno(nota1, nota2, media);
        }
}
 