package testes;

import java.util.Scanner;

public class AlcoolGasolina {

	public static void main(String[] args) {
		// VARIÁVEIS
		double alcool, gasolina;
		// OBJETOS
		Scanner teclado = new Scanner(System.in);
		// ENTRADA
		System.out.println("Álcool x Gasolina");
		System.out.print("Digite o valor do álcool: ");
		alcool =teclado.nextDouble();
		System.out.print("Digite o valor da gasolina:");
		gasolina = teclado.nextDouble();
		// PROCESSAMENTO E SAÍDA
		if (alcool < 0.7*gasolina) {
			System.out.println("Abastecer com o álcool!");
		} else {
			System.out.println("Abastecer com a gasolina!");
		}
		teclado.close();
	}

}
