package javaapplication1;

import java.util.Scanner;

public class consoante{
public static void main(String []args){


System.out.println("introduza a letra:");
Scanner read = new Scanner(System.in);
String N;
    N = read.next();
char n=N.charAt(0);

switch(n){

case'a', 'e', 'i', 'o', 'u' -> System.out.println("a letra"+N+"e uma vogal");
default -> System.out.println("a letra   "   +  N  +   "  e uma consoante");
 
   }
}