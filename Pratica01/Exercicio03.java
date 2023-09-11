package Pratica01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		// Faça um programa que pergunte o preço de três produtos e informe qual 
        //produto você deve comprar, sabendo que a decisão é sempre o mais barato.
		
		 // Entrada
		
		System.out.println("informe o valor 1");
		double valorUm = entrada.nextDouble();
		System.out.println("informe o valor 2");
		double valorDois = entrada.nextDouble();
        System.out.println("informe o valor 3");
        double valorTres = entrada.nextDouble();
        
        String qualprodutocomprar = "";
         
        //Processo
        
        if(valorUm < valorDois && valorUm < valorTres) {
        	qualprodutocomprar = "produto 1";
        } else if (valorDois < valorUm && valorDois < valorTres) {
        	qualprodutocomprar = "produto 2";
        } else { 
        	qualprodutocomprar = "produto 3";
        }  
        
        // Saida
        
        System.out.println("o produto que deve comprar é " + qualprodutocomprar);
	
	}

}
