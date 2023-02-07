package Atividade3;

import java.util.Scanner;

import ATIVIDADE1.Salario;

public class Salario_LIQUIDO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       float Salario,Adicional,Horas,Descontos,Salariol;
       Scanner Leia = new Scanner(System.in);
       System.out.println("\n Digite o seu salário: ");
       Salario = (float) Leia.nextDouble();
       System.out.println("\n Digite o seu Adicional Noturno: ");
       Adicional = (float) Leia.nextDouble();
       System.out.println("\n Digite as horas extras: ");
       Horas = (float) Leia.nextDouble();
       System.out.println("\n Digite os Descontos: ");
       Descontos = (float) Leia.nextDouble();
       
       Salariol = Salario+Adicional+(Horas *5)-Descontos;
       System.out.println("\nSeu salário liquido é: " +Salariol);
      
       
       
       
	}
}
