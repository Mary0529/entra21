package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio06 {

	/*
	 * Faça um algoritmo em que o usuário insere um número em um índice específico
	 * que ele mesmo informou
	 */

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();

		lista.add(7);
		lista.add(1);
		lista.add(6);
		lista.add(-6);
		lista.add(10);
		lista.add(7000);
		lista.add(4);

		Scanner scan = new Scanner(System.in);

		System.out.println("Insira o número");
		int numero = scan.nextInt();

		int indice = lista.indexOf(numero);

		if (indice != -1) {
			System.out.println("Número " + numero + " foi encontrado no índice " + indice);
		} else {
			System.out.println("Número " + numero + " não foi encontrado em nenhum índice");
		}

	}

}
