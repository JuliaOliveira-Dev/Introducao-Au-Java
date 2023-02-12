package Atividade_LacoRepeticao;

import java.util.Scanner;

public class Atividade4_ex3 {

	public static void main(String[] args) {
		Scanner Leia = new Scanner(System.in);
		
		int num,somaIdadeMenor=0,somaIdadeMaior=0;
		
		System.out.println("Digite aqui a idade: ");
		num = Leia.nextInt();
		
		while (num >= 0) {
			if (num<21) {
				
			System.out.println("Digite aqui o valor de idade: ");
			num = Leia.nextInt();
			
			System.out.println("Total de pessoas menores de 21 anos: " + somaIdadeMenor);
			System.out.println("Total de pessoas maiores de 50 anos:" + somaIdadeMaior);
				
			}
		}
	}

}
