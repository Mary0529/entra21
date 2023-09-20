package Métodos;

public class Exercicio001 {

	/*
	 * - Crie um metodo para imprimir seu nome, sua idade e cor favorita 
	 * - MESMA CLASSE, DOIS METODOS
	 */

	public static void main(String[] args) {
		imprimirInfor();
		Conta();
		infdeAltura();
		Soma();
		multiplicacao();
	}

	public static void imprimirInfor() {
		System.out.println("Olá, meu Nome é Maria Eduarda" + " Tenho 17 anos" + " E minha cor favorita é Azul");

	}
	/*
	 * Crie um metodo com duas variaveis com os valores 10 e 100, imprima a
	 * multiplicação e soma
	 */

	public static void Conta() {

		int numUm = 10;
		int numDois = 100;

		System.out.println("Soma: " + (numUm + numDois));
		System.out.println("Multiplicação: " + numUm * numDois);

	}

	/*
	 * Utilize o metodo conta(), já criado, quebre o mesmo em dois metodos
	 */
	public static void Soma() {

		int numUm = 10;
		int numDois = 100;

		System.out.println("Soma: " + (numUm + numDois));
	}

	public static void multiplicacao() {

		int numUm = 10;
		int numDois = 100;

		System.out.println("Multiplicação: " + numUm * numDois);
	}
	/*
	 * Crie mais um metodo, utilize o dados de altura de dois amigos e imprima a
	 * meédia e os nomes
	 */

	public static void infdeAltura() {

		String nomeUm = "Nicole";
		String nomeDois = "Sara";
		String nomeTres = "Beatriz";
		double alturaUm = 1.68;
		double alturaDois = 1.65;
		double alturaTres = 1.63;

		System.out.println("A media das minhas colegas é: " + (alturaUm + alturaDois + alturaTres) / 3);
		System.out.println("E o nome delas é " + " " + nomeUm + " , " + nomeDois + " e " + nomeTres);

	}

}
