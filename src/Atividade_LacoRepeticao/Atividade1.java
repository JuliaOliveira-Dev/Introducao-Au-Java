package Atividade_LacoRepeticao;

import java.util.Scanner;

public class Atividade1 {

	private static int x;

	public static void main(String[] args) {
		int n1,n2;
		int i;
		
		Scanner Leia = new Scanner(System.in);
		System.out.println("Insira o primeiro número do intervalo");
		n1 = Leia.nextInt();
		
		System.out.println("Insira o segundo número do intervalo");
		n2 = Leia.nextInt();
		
		for (i= n1; i <=n2; i++) {
			 if (n1 > n2) {
				 System.out.println("Intervalo inválido");
				 
			 }else {
				 for (x=n1; x<=n2; x++) {
					 if(x%3 == 0 && x%5 == 0) {
						 System.out.println("\n" +x);
					 }
				 }
			 }
		}
	}

}
