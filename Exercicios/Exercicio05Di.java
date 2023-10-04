package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio05Di {

	/* Faça um algoritmo que coloque o número 0 no índice que o usuário escolheu */

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		// Adiciona alguns números à lista para exemplo
		lista.add(1);
		lista.add(2);
		lista.add(3);

		System.out.println("Lista original: " + lista);

		System.out.print("Informe o índice onde deseja colocar o número 0: ");
		int indice = scanner.nextInt();

		// Verifica se o índice fornecido pelo usuário é válido
		if (indice >= 0 && indice < lista.size()) {
			// Insere o número 0 no índice especificado
			lista.add(indice, 0);
			System.out.println("Lista modificada: " + lista);
		} else {
			System.out.println("Índice inválido. A lista permanece inalterada.");
		}
	}

}
