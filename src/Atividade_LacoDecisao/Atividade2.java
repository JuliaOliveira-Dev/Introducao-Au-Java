package Atividade_LacoDecisao;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int num;
		Scanner Leia = new Scanner(System.in);
		
		System.out.println("\nDigite um número: ");
		num = Leia.nextInt();
		
	    if (num % 2 == 0) {
	    	System.out.println("\n o numero: " + num +"é par");
	    }
	    else {
	    	System.out.println("\n o numero: " + num + "é impar");
	    }
	    
	    if (num>0) {
	    	System.out.println("\n e positivo ");
	    }
	    else if (num<0) {
	    	System.out.println("\n e negativo");
	    }
	    		
	    	
	    }
		
		
	}


