package javaapplication1;

import java.util.Scanner;
public class pecadoisnumero {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        int maior;
        int menor;


        System.out.println("digite um numero");
        menor = ler.nextInt();

        System.out.println("outro numero");
        maior = ler.nextInt();

       if (maior<0){
           System.out.println("´negativo");
       }
       else{
           System.out.println("O maior valor é " + maior);
           
       }

    }
}