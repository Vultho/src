package javaapplication1;

import java.util.Scanner;
public class exercicio3 {
    public static String verificar (String fEm){
         System.out.println("Digite 'f' para feminino e 'm' para masculino");
        switch (fEm){
            case "f" -> System.out.println("Sexo feminino ");
            case"m" -> System.out.println("Sexo masculino ");
            
            default ->System.out.println("Sexo invalido ");
    }
     return fEm;   
    }
    
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        String fEm=teclado.next();
        String teste = verificar(fEm);
    }
}