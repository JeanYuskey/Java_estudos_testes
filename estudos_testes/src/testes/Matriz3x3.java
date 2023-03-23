/* Determinar a inversa de uma matriz dada pelo cliente
 * Sabemos que A*A^-1 = I
 * Como a matriz é 3x3, temos q descobrir 9 incógnitas para a resolução do problema
 * 
*
package testes;

import java.util.Scanner;

public class Matriz3x3 {

	public static void main(String[] args) {
		
		int m11, m12, m13, m21, m22, m23, m31, m32, m33;
		
		int a,b,c,d,e,f,g,h,i;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Matriz 3x3");
		System.out.println("\nColoque os 9 valores da Matriz 3x3 em ordem, demonstrado na sequência abaixo"+"\n m11  m12  m13"+"\n m21  m22  m23"+"\n m31  m32  m33");
		System.out.println("Digite o m11:");
		m11 = teclado.nextInt();
		System.out.println("Digite o m12:");
		m12 = teclado.nextInt();
		System.out.println("Digite o m13:");
		m13 = teclado.nextInt();
		System.out.println("Digite o m21:");
		m21 = teclado.nextInt();
		System.out.println("Digite o m22:");
		m22 = teclado.nextInt();
		System.out.println("Digite o m23:");
		m23 = teclado.nextInt();
		System.out.println("Digite o m31:");
		m31 = teclado.nextInt();
		System.out.println("Digite o m32:");
		m32 = teclado.nextInt();
		System.out.println("Digite o m33:");
		m33 = teclado.nextInt();
		
		(m11*a + m12*d + m13*g) = (m21*b + m22*e + m23*h) = (m31*c + m32*f + m33*i) = 1;
		
		
		teclado.close();
		
	}

}
*/
