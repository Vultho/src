
 
package javaapplication1;

import java.util.Scanner;

public class temperatura {

     
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      
      System.out.println("Temperatura em Celsius ");
      double g= s.nextInt();
      
      double f= (g-32)/1.8;
      
      System.out.println("A temperatura em fahalguma é"+f);
      
      
     
              
     
    }
}