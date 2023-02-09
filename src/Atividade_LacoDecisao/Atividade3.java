package Atividade_LacoDecisao;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Leia = new Scanner(System.in);
		
		System.out.println("\n Nome do doador:  ");
		String nome = Leia.next(); 
		
		System.out.println("\n Idade do doador: ");
		int idade = Leia.nextInt();
		
		System.out.println("\n Primeira doação true/false? ");
		boolean outrasD = Leia.nextBoolean();
		
		if (idade>=18 && idade<=69) {
	     System.out.println( nome + "Está apta(o) para doar sangue" );
		}
		
		else if (idade>=60 && idade<=69 && outrasD) {
         System.out.println( nome + "Está apta(o) para doar sangue");
          }
		
		else {
			System.out.println(nome + "Não está apta(o) para doar sangue");
		     }
	}
}