package javaapplication1;

import java.util.Scanner; 

public class Vogal{ 
  public static String verificar (String N){
         System.out.println("introduza a letra:"); 
           switch(N){ 

   case"a", "e", "i", "o", "u" -> System.out.println("a letra "+N+" é uma vogal");
default -> System.out.println("a letra "+N+" é uma consoante"); 
  }
  return N;
  }
  public static void main(String []args){ 
  Scanner read = new Scanner(System.in); 
   String N=read.next();
   String teste = verificar(N);
    } 
  } 
