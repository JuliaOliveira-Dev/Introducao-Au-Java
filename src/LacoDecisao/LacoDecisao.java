package LacoDecisao;

import java.util.Scanner;

public class LacoDecisao {

	private static final Scanner Leia = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           double n1,n2,n3,media;
           
           Scanner leitura = new Scanner(System.in);
           
           System.out.println("\n Entre com a primeira nota: ");
           n1 = Leia.nextDouble();
           
           System.out.println("\n Entre com a segunda nota: ");
           n2 = Leia.nextDouble();
           
           System.out.println("\n Entre com a terceira nota: ");
           n3 = Leia.nextDouble();
	       
           media = (n1+n2+n3)/3;
        
        System.out.printf("\n Média: %.2f", media);
           
           if(media>=7  &&media<=10) {
        	   System.out.println("\nParabéns, você foi aprovade!!");
           }   
           else if (media>=5 && media<7) {
        	   System.out.println("\nAtenção você está de exame!!");
           }
           else if (media>=0 && media<5) {
        	   System.out.println("\nPoxa vida, você foi reprovado!!");
           }
           else {
        	   System.out.println("\nPor favor, verifique suas notas pois a meédia deu errado");
           }
        	   
           
	}
	
	
	
	}
	


