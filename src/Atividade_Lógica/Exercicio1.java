package Atividade_Lógica;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anos,meses,dias,idadeEmDias;
		Scanner Leia = new Scanner(System.in);
		System.out.println("\n Quantos anos você tem? ");
		anos = (int) Leia.nextInt();
		System.out.println("\n Quantos meses você tem? ");
		meses = (int) Leia.nextInt();
		
		
			idadeEmDias = anos*365;
		System.out.println("\n Sua idade em dias é: " +idadeEmDias);
		
		
		

	}

}
