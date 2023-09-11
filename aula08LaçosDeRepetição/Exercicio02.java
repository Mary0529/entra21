package aula08LaçosDeRepetição;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		// Faça um programa que leia um nome de usuário
		// e a sua senha e não aceite a senha igual ao nome do usuário,
		// mostrando uma mensagem de erro e voltando a pedir as informações,
		// caso seja certo, de os parabéns e encerre o programa.

		// Armazenar em variaveis o login e a senha
		// Verificar se o login e a senha estão corretos
		// login == "Maria"

		// Login e senha
		// Informe o seu login
		System.out.println("Nome de Usuario");
		String usuario = scan.next();

		System.out.println("Informe sua Senha");
		String senha = scan.next();

		while (usuario.equals(senha)) {
			System.out.println("Entrada invalida");
			System.out.println("Informe o usuario");
			usuario = scan.next();

			System.out.println("Informe a senha");
			senha = scan.next();
		}

		System.out.println("parabens, usuario criado");

	}

}
