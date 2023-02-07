package ATIVIDADE1;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Float salário, abono, nsalario;
		Scanner Leia = new Scanner(System.in);
		System.out.println("\n Digite o seu salário: ");
		salário = (float) Leia.nextDouble();
		System.out.println("\n Digite o valor do abono: ");
		abono = (float) Leia.nextDouble();
		nsalario = salário+abono;
		System.out.println("O seu novo salário" +nsalario);
		

	}

}
