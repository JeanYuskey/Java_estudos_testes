package testes;

import java.text.DecimalFormat;
import java.util.Scanner;

//Exercício 2 -  Desenvolva uma aplicação no console(terminal) para calcular o valor da porcentagem usando Regra de 3, conforme modelo abaixo:
//x% de y = valor
public class Regra3 {

	public static void main(String[] args) {
		//VARIÁVEIS
		double x,y,valor;
		//OBJETOS
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//ENTRADA
		System.out.println("Regra de 3");
		System.out.println("x% de y = valor");
		System.out.print("Digite o valor de x: ");
		x = teclado.nextDouble();
		System.out.println("Digite o valor de y: ");
		y = teclado.nextDouble();
		//PROCESSAMENTO
		valor = (x * y)/ 100;
		//SAÍDA
		System.out.println(x + "% de "+ y +" = "+formatador.format(valor));
		
		teclado.close();

	}

}
