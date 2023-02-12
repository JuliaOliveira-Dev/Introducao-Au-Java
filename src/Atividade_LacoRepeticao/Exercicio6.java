package Atividade_LacoRepeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner Leia = new Scanner(System.in);
		int num,quantidade=0,média=0,part1=0;
		
		System.out.println("Digite um número: ");
		num = Leia.nextInt();
		
		if (num%3==0 && num!=0) {
			part1+=num;
			quantidade++;
			
		while(num!=0);
		média = part1/quantidade;
		
		System.out.println("A média de todos os números multiplos de 3 é " +média);
		}
		

	}

}
