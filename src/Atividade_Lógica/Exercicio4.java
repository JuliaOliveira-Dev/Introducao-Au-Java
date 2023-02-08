package Atividade_Lógica;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner Leia = new Scanner(System.in);
         int a, b, c, r, s,d;
          System.out.print("\n Insira o valor de A: ");
          a = Leia.nextInt();
         
         System.out.print("\n Insira o valor de B: ");
          b = Leia.nextInt();
         
         System.out.print("\n Insira o valor de c: ");
          c = Leia.nextInt();
         
          r = (int) ((a + b)) * ((a + b));
          s = (int) ((b + c)) * ((b + c));
          d = (r + s) /2;
         
          
         System.out.print("O resultado de D é: " + d);
         
	}

}
