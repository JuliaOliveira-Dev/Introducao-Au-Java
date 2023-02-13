package ExerciciosDeRepeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner Leia = new Scanner(System.in);
		int idade,genero,comportamento;
		int calmo = 0, mulherNervosa = 0,HomemAgressivo = 0,OutroCalmo = 0;
		int nervoso40 = 0, CalmoMenor18 = 0; 
		
		for (int i = 0; i < 3; i++) { 
			System.out.println("Informe sua idade: ");
			idade = Leia.nextInt();
			System.out.println("Informe sua identificação de gêneros (1-feminino / 2-masculino / 3-outro: ");
			genero = Leia.nextInt();
			System.out.println("Informe o comportamento (1-calmo / 2-nervoso / 3-agressivo: ");
			comportamento = Leia.nextInt();
			
			if (comportamento == 1) {
				calmo++;
				if (genero == 3) {
					OutroCalmo++;
				}
				if (idade<18) {
					CalmoMenor18++;
				}
				
				
			}
			else if (comportamento == 2) {
				
				if(genero == 1) {
					mulherNervosa++;
				}
				if (idade> 40) {
					
				    nervoso40++;
				}
			}
			else if(comportamento == 3) {
				if (genero == 2) {
					HomemAgressivo++;
				}
			}
		
		}
		
		System.out.println("\n Numeros de pessoas calmas: " + calmo);
		System.out.println("\n Numeros de mulheres nervosas: " + mulherNervosa);
	    System.out.println("\nNumeros de homens agrresivos: " +HomemAgressivo);
	    System.out.println("\n Numero de outros calmos: " + OutroCalmo);
	    System.out.println("\nNumero de pessoas nervosas com mais de 40 anos: " + nervoso40);
	    System.out.println("\nNumeros de pessoas calmas com menos de 18 ano: " + CalmoMenor18);
	    
		
		
		

	}

}
