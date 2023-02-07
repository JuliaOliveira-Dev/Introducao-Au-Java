package Atividade2;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Float nota1,nota2,nota3,nota4,média;
	Scanner Leia = new Scanner(System.in);
    System.out.println("\n Digite a primeira nota: ");
    nota1 = (float) Leia.nextDouble();
    System.out.println("\n Digite a segunda nota: ");
    nota2 = (float) Leia.nextDouble();
    System.out.println("\n Digite a terceira nota: ");
    nota3 = (float)  Leia.nextDouble();
    System.out.println("\n Digite a quarta nota: ");
    nota4 = (float) Leia.nextDouble();
    média = (nota1+nota2+nota3+nota4) / 4;
    System.out.println("\nSua média final é: " +média);
    
	}
	

}
