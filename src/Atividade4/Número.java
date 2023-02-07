package Atividade4;

import java.util.Scanner;

public class Número {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int N1,N2,N3,N4,diferença;
     Scanner Leia = new Scanner(System.in);
     System.out.println("\n Digite o primeiro número: ");
     N1 = (int) Leia.nextDouble();
     System.out.println("\n Digite o segundo número: ");
     N2 = (int) Leia.nextDouble();
     System.out.println("\n Digite o terceiro número: ");
     N3 = (int) Leia.nextDouble();
     System.out.println("\n Digite o quarto número: ");
     N4 = (int) Leia.nextDouble();
     
     diferença = (N1*N2) - (N3*N4); 
	System.out.println("\n A diferença é: "+diferença);
	}

}
