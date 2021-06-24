package javaapplication1;

import java.util.Scanner;
public class femininoetc {
    public static void main(String args[]) {
      
        System.out.println("Digite 'f' para feminino e 'm' para masculino");
        
        Scanner teclado = new Scanner(System.in);
        String M=teclado.next();
        
        char m=M.charAt(0);
        
        switch (m){
            case 'f' -> System.out.println("Sexo feminino ");
            case'm' -> System.out.println("Sexo masculino ");
            
            default ->System.out.println("Sexo invalido ");
            
        }
     
     

    }
    
                
        
    }
    