package testes;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		int valor;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o valor da tabuada: ");
		valor = teclado.nextInt();
		/*Uso da estrutura de repetição
		 * inicio -> i=0
		 * fim -> i>10
		 * incremento -> i++ -> i=i+1
		 * 						0=0+1  = 1 ; i=1+1  = 2
		 */
		for (int i = 0; i < 10; i++) {
			System.out.println(valor + " x " + i +" = " +(valor*i));
			teclado.close();
		}
		

	}

}
