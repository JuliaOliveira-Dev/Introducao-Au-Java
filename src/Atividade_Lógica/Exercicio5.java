package Atividade_Lógica;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           double nota1,nota2,nota3,peso1,peso2,peso3, mediaPonderada;
           Scanner Leia = new Scanner(System.in);
           
           System.out.print("\n Calcule a primeira nota: ");
           nota1 = (double) Leia.nextDouble();
           
           System.out.print("\n Calcule a segunda nota: ");
           nota2 = (double) Leia.nextDouble();
           
           System.out.print("\n Calcule a terceira nota: ");
           nota3 = (double) Leia.nextDouble();
           
           peso1 = 2.0;
           peso2 = 3.0;
           peso3 = 5.0;
           
           mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
           System.out.print("\n A média pondera do aluno é de: " +mediaPonderada);
	}

}
