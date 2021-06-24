import java.util.Scanner; 

public class Vogal{ 
  public static void main(String []args){ 
   

   System.out.println("introduza a letra:"); 
   Scanner read = new Scanner(System.in); 
   
   String N=read.next();
   char c=N.charAt(0);
   
   System.out.println(N);

    switch(c){ 

   case'a', 'e', 'i', 'o', 'u' -> System.out.println("a letra "+N+" é uma vogal");
default -> System.out.println("a letra "+N+" é uma consoante"); 
     } 

 } 
} 
