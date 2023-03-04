package testes;

import java.text.DecimalFormat;
import java.util.Scanner;

//Exercício 4 - Desenvolva uma aplicação no console(terminal) para calcular o valor da hora de um serviço.
public class ValorServico {

	public static void main(String[] args) {
		// VARIÁVEIS
		double hora, remuneracao, custo, cargaHoraria;
		// OBJETOS
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		// ENTRADA
		System.out.println("Cálculo do valor da hora de um serviço");
		System.out.print("Remuneração mensal pretendida: ");
		remuneracao = teclado.nextDouble();
		System.out.print("Custo opercaional mensal: ");
		custo = teclado.nextDouble();
		System.out.print("Carga horária mensal de trabalho: ");
		cargaHoraria = teclado.nextDouble();
		// PROCESSAMENTO
		hora = (remuneracao + (remuneracao*0.3) + custo + (remuneracao*0.2)) / cargaHoraria;
		//SAÍDA
		System.out.println("Valor da hora: "+formatador.format(hora));
		teclado.close();
	}

}
