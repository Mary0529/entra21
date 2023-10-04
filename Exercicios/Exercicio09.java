package Exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio09 {

	/*
	 * Faça um algoritmo que remova o valor do meio da ArrayList. Caso a array list
	 * tenha tamanho par, remova o valor da segunda metade. Por exemplo: Em uma
	 * ArrayList de tamanho 6, remova o valor no índice 4
	 */

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();

		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		lista.add(6);

		int lis = lista.size() / 2;
		if (lista.size() % 3 == 1) {
			lis--;
		}
		lista.remove(lis);
		System.out.println(lista); // Output: [1,2,3,5,6]

	}

}
