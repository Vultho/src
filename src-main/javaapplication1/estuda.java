package javaapplication1;

import java.util.Scanner;


public class estuda {
    public static void main (String[]args){
        System.out.println ("Qual turno você estuda? 'M' Matutino, 'V' Vespertino, 'N' Noturno"  );
        Scanner ler = new Scanner(System.in);
        String M=ler.next();
        
        char m= M.charAt(0);
        
       
        
        switch(m){
            case'M' -> System.out.println ("Bom dia");
            case 'V' -> System.out.println("Boa tarde");
            case 'N' -> System.out.println("Boa noite");
            default -> System.out.println ("Valor Invalido");
        }
                
            
        
        
                
        
    }
    
}
