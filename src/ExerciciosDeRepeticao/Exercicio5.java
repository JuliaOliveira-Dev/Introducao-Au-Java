package ExerciciosDeRepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner Leia = new Scanner(System.in);
		int numero, soma = 0;
		do {
			System.out.println("\nDigite um número: ");
			numero = Leia.nextInt();
			soma += numero;
			
		} while (numero != 0);
		
		System.out.println("\n A soma dos numero digitados é: " + soma);
		

	}

}
