package Atividade_Lógica;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int idadeEmDias,anos,meses,dias;
          Scanner Leia = new Scanner(System.in);
          System.out.println("\n Insira a idade em dias: ");
          idadeEmDias = (int) Leia.nextInt();
           
          anos = idadeEmDias / 365;
          meses = (idadeEmDias % 365) /30;
          dias = (idadeEmDias % 365) /30;
          System.out.println("\n Sua idade em dias é: " +anos + "anos," +meses + "meses," +dias + "dias");
	}

}
