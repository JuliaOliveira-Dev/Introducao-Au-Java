package Atividade_Lógica;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          double custoConsumidor,custoFábrica,percentualDistribuidor,PercentualImposto,custoDistribuidor,CustoConsumidor, custoImposto;
          Scanner Leia = new Scanner(System.in);
          
          System.out.print("\nEntre com o custo de fábrica:" );
          	custoFábrica = Leia.nextDouble();
          	
          	percentualDistribuidor = 0.28;
          	PercentualImposto = 0.45;
          	custoDistribuidor = custoFábrica * percentualDistribuidor;
          	custoImposto = custoFábrica * PercentualImposto;
          	custoConsumidor = custoDistribuidor + custoImposto + custoFábrica;
          	
          	System.out.print("O custo ao consumidor é: R$" +custoConsumidor);
	}

}
