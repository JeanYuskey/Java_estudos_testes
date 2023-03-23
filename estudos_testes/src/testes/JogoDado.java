package testes;

import java.util.Scanner;

public class JogoDado {

	public static void main(String[] args) {
		char opcao = 's';
		Scanner teclado = new Scanner(System.in);
		// Estrutura/Laço de repetição While
		while (opcao == 's') {
			System.out.println("Lançamento do DADO ...........");
			int dado = (int) (Math.random() * 6 + 1);
			System.out.println("Face: " + dado);
			System.out.print("Deseja lançar o dado novamente(s/n)?" );
			opcao = teclado.next().charAt(0); //chatAt(0) significa que ele vai capturar apenas a primeira letra
			//Por exemplo: se vc escrever "sim", ele vai capturar apenas a letra 's' e vai ignorar o "im"
			teclado.close();
		}
	}

}
