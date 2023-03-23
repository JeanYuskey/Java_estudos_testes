/* Determinar a inversa de uma matriz dada pelo cliente
 * Sabemos que A*A^-1 = I
 * Como a matriz é 2x2, temos q descobrir 4 incógnitas para a resolução do problema
 * 
*
package testes;

import java.util.Scanner;

public class Matriz2x2 {

	public static void main(String[] args) {
		
		int m11, m12, m21, m22;
		
		int a,b,c,d;
		
		int mmc1 = 0,mmc2,mmc3,mmc4,aux,i;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Matriz 3x3");
		System.out.println("\nColoque os 4 valores da Matriz 2x2 em ordem, demonstrado na sequência abaixo"+"\n m11  m12"+"\n m21  m22");
		System.out.println("Digite o m11:");
		m11 = teclado.nextInt();
		System.out.println("Digite o m12:");
		m12 = teclado.nextInt();

		System.out.println("Digite o m21:");
		m21 = teclado.nextInt();
		System.out.println("Digite o m22:");
		m22 = teclado.nextInt();
		
		teclado.close();
		
		for (i = 2; i <=m21; i++) {
			aux = m11;
			if ((aux % m21) == 0) {
				mmc1 = aux;
				i = m21 + 1;
			}
		}
		return;
	}
}
*/