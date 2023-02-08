package Atividade_Lógica;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            double x1,x2,y1,y2,d;
            Scanner Leia = new Scanner(System.in);
            System.out.print("Digite as cordenadas do primeiro ponto (x1,y1): ");
            x1 = Leia.nextDouble();
            y1 = Leia.nextDouble();
            System.out.print("Digite as cordenadas do segundo ponto (x2,y2): ");
            x2 = Leia.nextDouble();
            y2 = Leia.nextDouble();
            
            
            d = Math.sqrt ((x2 - x1)) * ((x2 - x1)) + ((y2 - y1)) * ((y2 - y1));
           
            System.out.print("A distância entre os pontos é:" + d);
            
	}

}
