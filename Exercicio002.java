package Métodos;

public class Exercicio002 {

	public static void Soma(int numUm, int numDois, int numTres, int numQuatro) {
		System.out.println("Numero Um: " + numUm);
		System.out.println("Numero Dois: " + numDois);
		System.out.println("Numero Tres: " + numTres);
		System.out.println("Numero Quatro: " + numQuatro);
		System.out.println("A Soma dos numeros é: " + (numUm + numDois + numTres + numQuatro));
	}

	public static void main(String[] args) {

		Soma(10, 50, 40, 20);
		Soma(100, 55, 400, 200);
		Soma(15, 50, 45, 25);
		Soma(19, 59, 49, 29);

	}

}
