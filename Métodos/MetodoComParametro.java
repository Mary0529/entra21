package Métodos;

public class MetodoComParametro {
	public static void metodoComParametro(String nome) {
		System.out.println("Meu nome: " + nome);
	}

	public static void metodoComMaisParametros(int idadeUm, int idadeDois, String texto) {
		System.out.println("A soma das idades: " + (idadeUm + idadeDois));
		System.out.println("E o texto: " + texto);
	}

	public static void main(String[] args) {
		// para chamar um metado: vou escrever o nome dele, sem esquecer dos parenteses

		String nome = "mary";
		metodoComParametro(nome);
		metodoComParametro("Maria");

		metodoComMaisParametros(15, 23, "Ola");

	}

}
