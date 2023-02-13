package ExerciciosDeRepeticao;

import java.util.Scanner;

public class Exercico2 {

	public static void main(String[] args) {
		Scanner Leia = new Scanner(System.in);
		 int par = 0, impar = 0, numero;
		 for (int i = 0; i <10; i++) {
			 System.out.println("Digite um número: ");
			 numero = Leia.nextInt();
			 if (numero%2 == 0) {
				 par ++;
				  }else {
				   impar ++;
			 }
			 
		 }
              System.out.println("Foram digitados " + par + " Numeros pares e " + impar + " Numeros impares.");
	}

}
