package javaapplication1;

import java.util.Scanner; 


public class exercicio6{ 
    public static int numeroMaior(int numero1, int numero2, int numero3, int maior){
        if(numero1 > numero2 || numero1 > numero3){
            numero1 = maior;
            System.out.println("O maior numero é " +maior);
        }
        else if (numero2 > numero1 || numero2 > numero3){
            numero1 = maior;
            System.out.println("O maior numero é " +maior);
        }
        else if(numero3 > numero2 || numero3 > numero1){
            numero1 = maior;
            System.out.println("O maior numero é " +maior);
        }
        return maior;
    }
    
      public static void main(String []args){ 
          Scanner numeros = new Scanner(System.in);
          System.out.println("Digite o 1º numero");
          int numero1 = numeros.nextInt();
          System.out.println("Digite o 2º numero");
          int numero2 = numeros.nextInt();
          System.out.println("Digite o 3º numero");
          int numero3 = numeros.nextInt();
          int maior = 0;
          int invocarMetodo = numeroMaior(numero1,numero2,numero3,maior);
      }
}
