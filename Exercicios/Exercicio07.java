package Exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio07 {

	/*
	 * Descreva um algoritmo que leia 5 valores decimais e os coloque em uma Array
	 * List. Em seguida, modifique a Array List de modo que os valores das POSIÇÕES
	 * ímpares sejam aumentados em 5% e os das POSIÇÕES pares sejam aumentados em
	 * 2%. Imprima a Array List resultante
	 */

	public static void main(String[] args) {

		List<Double> lista = new ArrayList<>();

		// Lendo os 5 valores decimais
		lista.add(55.0);
		lista.add(15.0);
		lista.add(20.0);
		lista.add(25.0);
		lista.add(30.0);

		// Modificando os valores da lista
		for (int i = 0; i < lista.size(); i++) {
			if (i % 2 == 0) { // Posições pares
				double valor = lista.get(i);
				valor = valor * 0.02; // Aumentando em 2%
				lista.set(i, valor);
			} else { // Posições ímpares
				double valor = lista.get(i);
				valor = valor * 0.05; // Aumentando em 5%
				lista.set(i, valor);
			}
		}

		// Imprimindo a lista resultante
		for (double valor : lista) {
			System.out.println(valor);
		}
	}

}
