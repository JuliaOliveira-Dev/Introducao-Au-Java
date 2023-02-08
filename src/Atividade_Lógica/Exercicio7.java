package Atividade_Lógica;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         float a,b,c,d,e,f,x,y;
         
         Scanner Leia = new Scanner(System.in);
         System.out.println("Entre com o valor de A: ");
         a = Leia.nextFloat();
        
         System.out.println("Entre com o valor de B: ");
         b = Leia.nextFloat();
   
         System.out.println("Entre com o valor de C: ");
         c = Leia.nextFloat();
         
         System.out.println("Entre com o valor de D: ");
         d = Leia.nextFloat();
       
         System.out.println("Entre com o valor de E: ");
         e = Leia.nextFloat();
         
         System.out.println("Entre com o valor de F: ");
         f = Leia.nextFloat();
         
         x = (c*e - b*f) / (a*e - b*d);
         y = (a*f - c*d) / (a*e - b*d);
         
         System.out.println("\n o valor de x foi de:" +x);
         System.out.println("\n o valor de y foi de:" +y);
	
	}

}
