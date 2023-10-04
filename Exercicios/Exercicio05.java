package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio05 {

	/* Faça um algoritmo que coloque o número 0 no índice que o usuário escolheu */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = 0;

		List<Integer> list = new ArrayList<>();

		System.out.println("Informe um indice");
		int indice = scan.nextInt();

		for (int i = 0; i < list.size(); i++) {
			list.add(num);
			indice = num;

		}

		System.out.println(list);

	}

}
