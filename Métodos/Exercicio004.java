package Métodos;

public class Exercicio004 {

	/*
	 * Faça um programa que some 4 números. Passando esses 4 números como parâmetros
	 * para um método
	 */
	public static void Soma(int numUm, int numDois, int numTres, int numQuatro) {
		int soma = numUm + numDois + numTres + numQuatro;
		System.out.println("Numero Um: " + numUm);
		System.out.println("Numero Dois: " + numDois);
		System.out.println("Numero Tres: " + numTres);
		System.out.println("Numero Quatro: " + numQuatro);
		System.out.println("A Soma dos numeros é: " + soma);
	}

	public static void main(String[] args) {
		int dado = 100;
		Soma(20, 10, 50, dado);
		Soma(20, 10, 50, 40);

	}

}
