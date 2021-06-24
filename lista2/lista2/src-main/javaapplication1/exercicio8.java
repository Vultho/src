package javaapplication1;

import java.util.Scanner; 


public class exercicio8{ 
    public static float produtoBarato(float produto1, float produto2, float produto3, float barato){
        if(produto1 < produto2 || produto1 < produto3){
            produto1 = barato;
            System.out.println("o preço mais barato é  " +barato);
        }
        else if (produto2 < produto1 || produto2 < produto3){
            produto1 = barato;
            System.out.println("o preço mais barato é " +barato);
        }
        else if(produto3 < produto2 || produto3 < produto1){
            produto1 = barato;
            System.out.println("o preço mais barato é " +barato);
        }
        return barato;
    }
    
      public static void main(String []args){ 
          Scanner numeros = new Scanner(System.in);
          System.out.println("Digite o preço 1º produto");
          float produto1 = numeros.nextFloat();
          System.out.println("Digite o preço 2º produto");
          float produto2 = numeros.nextFloat();
          System.out.println("Digite o preço 3º produto");
          float produto3 = numeros.nextFloat();
          float barato = 0;
          float invocarMetodo = produtoBarato(produto1, produto2, produto3, barato);
      }
}
