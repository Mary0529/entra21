package Exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio02 {
	
	//Crie uma Array List e imprima os últimos elementos por primeiro

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(12);
		list.add(14);
		list.add(21);
		list.add(55);
		list.add(1);

		for (int i = list.size() - 1; i >= 0; i--) {
			int elemento = list.get(i);

			System.out.println(elemento);
		}

	}

}
