package Atividade_Lógica;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int segundos, horas, minutos, restosEsegundos;
     Scanner Leia = new Scanner(System.in);
     
     System.out.println("\n Insira a duração do evento em segundo ");
     segundos = (int) Leia.nextInt();
     
     horas = segundos/3600;
     minutos = (segundos%3600) /60;
     restosEsegundos = (segundos%3600) %60;
     
     System.out.println("\n Duração" +horas + "horas" +minutos + "minutos" +restosEsegundos + "restosEsegundos");
	}

}
