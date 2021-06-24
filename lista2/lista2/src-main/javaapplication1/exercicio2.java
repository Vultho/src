package javaapplication1;

import java.util.Scanner;

public class exercicio2 {
    public static int verificando (int numero1, int numero2, int verificado){
        if (numero1<0){
            numero1 = verificado;
            System.out.println("o numero " + verificado + " é negativo");
        }
        else if (numero1 == 0){
            numero1 = verificado;
            System.out.println("o numero é " + verificado);
        }
        else if (numero1>0){
            numero1 = verificado;
            System.out.println("o numero " + verificado + " é positivo");
        }
        else if (numero2<0){
            numero1 = verificado;
            System.out.println("o numero " + verificado + " é negativo");
        }
        else if (numero2 == 0){
            numero1 = verificado;
            System.out.println("o numero é " + verificado);
        }
        else if (numero2>0){
            numero2 = verificado;
            System.out.println("o numero " + verificado + " é positivo");
    }
    return verificado;
    }

public static void main(String args[]) {
    Scanner numero = new Scanner(System.in);
    int numero1 = numero.nextInt();
    int numero2 = numero.nextInt();
    int verificado = 0;
    int resultado = verificando (numero1 , numero2 , verificado);
    
}
}