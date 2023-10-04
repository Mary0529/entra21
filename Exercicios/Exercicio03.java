package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio03 {

	/*
	 * Crie uma Array List O usuário vai colocando valores decimais até ele colocar
	 * o número 0. Calcular: a) Qual o menor número b) Qual o maior número c)
	 * Calcular a média
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int soma = 0;
		int contador = 0;
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;

		System.out.println("Digite qualquer numero para entrar ou 0 para parar");
		int elemento = scan.nextInt();

		List<Integer> liste = new ArrayList<>();

		while (elemento != 0) {
			System.out.println("Digite elementos para a lista");
			elemento = scan.nextInt();
			liste.add(elemento);

			soma = soma + elemento;
			contador++;

			if (elemento > maximo) {
				maximo = elemento;
			}
			if (elemento < minimo) {
				minimo = elemento;
			}
		}

		System.out.println(liste);
		System.out.println("O maior numero é: " + maximo);
		System.out.println("O menor numero é: " + minimo);
		System.out.println("A media é: " + soma / contador);

	}

}
