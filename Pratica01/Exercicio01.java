package Pratica01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		// Faça um programa que verifique (usando if e else)
		// se uma letra digitada é vogal ou consoante

		// Entrada

		System.out.println("informe uma letra");
		String letra = entrada.next();

		// Processo - vogal ou consoante

		// Vogal - A, E, I, O, U

		if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
			System.out.println(letra + " vogal.");
		} else
			System.out.println(letra + " consoante.");

	}

}
