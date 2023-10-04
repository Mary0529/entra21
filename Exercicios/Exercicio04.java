package Exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio04 {

	/*
	 * Faça um algoritmo que atribua valores à Array List de acordo com o quadrado
	 * do seu índice Ex: [0] = 0 [1] = 1 [2] = 4 [3] = 9 [4] = 16;
	 */

	public static void main(String[] args) {

		int numero = 0;

		List<Integer> lista = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			numero = i * i;
			lista.add(numero);
		}

		System.out.println(lista);

	}

}
