package AulaJava;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String nome="Julia Oliveira"; 
        int idade=21;
        double altura= 1.62,nota1,nota2,nota3,media;
        
        Scanner Leia = new Scanner(System.in); 
        
        System.out.println("\nseu nome é:"+nome); 
        System.out.println("\nsua idade é:" +idade);
        System.out.println("nsua altura é:" +altura);
        
        System.out.println("\nEntre com a primeira nota: ");
        nota1 = Leia.nextDouble();
        System.out.println("\nEntre com a segunda nota: ");
        nota2 = Leia.nextDouble();
        System.out.println("\nEntre com a terceira nota: ");
	    nota3 = Leia.nextDouble();
	    		
	    		media = nota1+nota2+nota3 /3;
	    System.out.println("\nmedia do aluno "+nome+" foi de: "+media);
	System.out.printf("\nMédia do aluno %s",nome," foi de: %.2f "+media);
	}
	
	 }
