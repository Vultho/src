package javaapplication1;

import java.util.Scanner;
public class exercicio9 {
            public static double teste (double[][] num, double[] nSequencia){
                       Scanner myObj = new Scanner(System.in);
                for (int i = 0; i < num.length; i++) { //guardando os valores
            num[i][0] = myObj.nextFloat();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                num[i][1] = num[i][0] > num[j][0] ? num[i][1] + 1 : num[i][1];
            }
        }

        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                if (num[j][1] == i){
                    System.out.print(num[j][0] + ", ");
                }
            }
        }
        return nSequencia;
            }
            
            public static void main(String[] args) {
        double[][] num = new double[4][2];
        double[] nSequencia = new double[4];
        System.out.println("Digite 4 numeros");
        double metodo = teste (num, nSequencia);
        }
}
//refazer