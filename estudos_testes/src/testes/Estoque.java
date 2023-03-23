package testes;

import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual produto deseja cadastrar?");
		String produto = teclado.next(); //tipo String
		
		System.out.print("Qual quantidade do produto: ");
		int quantidade = teclado.nextInt(); //tipo int
		
		System.out.print("Insira o preço do produto: ");
		double preco = teclado.nextDouble(); //tipo double
		
		System.out.println("Produto cadastrado com sucesso!");
		teclado.close();
		
		System.out.println("O valor total em produtos "+produto+" é de R$"+(quantidade*preco));

	}

}