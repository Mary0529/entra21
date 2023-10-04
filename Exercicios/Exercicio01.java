package Exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio01 {

	// Coloque 5 elementos em uma Array List e ordene-os

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();

		lista.add(13);
		lista.add(15);
		lista.add(28);
		lista.add(38);
		lista.add(23);

		lista.sort(null); // ordena a lista em ordem crescente

		System.out.println(lista);
		
	}

}
