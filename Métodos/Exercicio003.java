package Métodos;

import java.util.Scanner;

public class Exercicio003 {

	/*
	 * Faça um programa em que o usuário entre com um número de 1 a 4 Com o número 1
	 * sendo verão, 2 sendo outono... Dependendo de o que o usuário informa, printe:
	 * 
	 * É verão E o tempo está quente
	 * 
	 * Ou
	 * 
	 * É inverno E está frio
	 */

	public static void Estacao(int escolha) {
		switch (escolha) {
		case 1:
			System.out.println("É Verão e está quente");
			break;
		case 2:
			System.out.println("É Outono e as folhas estão caindo");
			break;
		case 3:
			System.out.println("É Inverno e está frio ");
			break;
		case 4:
			System.out.println("É Primavera e as flores estão florecendo ");
			break;
		default:
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um dado");
		int dado = scan.nextInt();
		Estacao(dado);

	}

}
