package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio08 {

	/*
	 * Faça um algoritmo que descubra se uma Array List possui o número que o
	 * usuário entrou. Imprima também o seu índice
	 */

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		// Preencher a lista com alguns números
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();

		int indice = list.indexOf(numero);

		if (indice != -1) {
			System.out.println("O número " + numero + " está no índice " + indice + ".");
		} else {
			System.out.println("O número " + numero + " não foi encontrado na lista.");
		}

	}

}
