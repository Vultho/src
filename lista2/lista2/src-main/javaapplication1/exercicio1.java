package javaapplication1;

import java.util.Scanner;
public class exercicio1 {
    public static int maiorOuMenor(int numero1, int numero2, int maior){
        if(numero1 > numero2){
            numero1 = maior;
            System.out.println("o numero maior é" + maior);
        }
        else if(numero1<numero2){
            numero2 = maior;
            System.out.println("o numero maior é" + maior);
        }
        return maior;
   }
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        int numero1 = ler.nextInt();
        int numero2= ler.nextInt();
        int maior = 0;
        int teste = maiorOuMenor (numero1, numero2, maior);
        
    }
}