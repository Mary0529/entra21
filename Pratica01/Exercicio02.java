package Pratica01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		// Para doar sangue é necessário ter entre 18 e 67 anos.
		// Faça um aplicativo que pergunte a idade de uma pessoa e diga se ela pode doar
		// sangue ou não.
		// Use alguns dos operadores lógicos OU (||) e E (&&)

		// Entrada

		System.out.println("Informe sua idade");
		int idade = entrada.nextInt();

		// Processo

		if (idade >= 18 && idade <= 67) {
			// Saida
			System.out.println("pode doar");
		} else {
			// Saida 
			System.out.println("não pode doar");
		}

	}

}
