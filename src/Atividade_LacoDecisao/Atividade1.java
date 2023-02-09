package Atividade_LacoDecisao;

import java.util.Scanner;

public class Atividade1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a,b,c;
		Scanner Leia = new Scanner(System.in);
		
		System.out.print("\nDigite o valor de A: ");
		a = Leia.nextInt();
		
		System.out.print("\nDigite o valor de B: ");
		b = Leia.nextInt();
		
		System.out.print("\nDigite o valor de C: ");
		c = Leia.nextInt();
		
		 if (a+b>c) {
		   System.out.print("\nA soma de A+B é maior que c ");
		 }
		 
		 else if (a+b<c) {
		   System.out.print("\nA soma de A+B é menor que C");
		 }
		 
		 else {
		   System.out.print("\nA soma de A+B é igual á C ");
		 }
		 
		 }
	

        
		
	}


