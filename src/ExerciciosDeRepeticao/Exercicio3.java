package ExerciciosDeRepeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner Leia = new Scanner(System.in);
		int idade = 0, menorQue21 = 0, MaiorQue50 = 0;
		while (idade != -99) {
			System.out.println("Digite a idade: ");
			idade = Leia.nextInt();
			if (idade< 21 && idade != -99) {
				menorQue21++;
			
			}
			   if (idade > 50 && idade != -99) {
				   MaiorQue50++;
			 }
		    
		} 
          System.out.println("Total de pessoas com menos de 21 anos: " + menorQue21);
          System.out.println("Total de pessoas com mais de 50 anos: " +MaiorQue50);
	}

}
