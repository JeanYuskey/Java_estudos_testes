package testes;

import java.text.DecimalFormat;
import java.util.Scanner;

//Exercício 3 -  Desenvolva uma aplicação no console(terminal) de ponto de vendas (PDV), conforme modelo abaixo:
//- Valor total: 200,00 
//- Desconto(%): 5
//- Total com desconto: 190,00 (valor calculado)
//- Valor pago: 200,00
//- Troco: 10,00 (valor calculado)
public class PDV {

	public static void main(String[] args) {
		// VARIÁVEIS
		double total, desconto, totalDesconto, valorPago, troco;
		// OBJETOS
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//ENTRADA1
		System.out.println("PDV");
		System.out.print("Valor total: ");
		total = teclado.nextDouble();
		System.out.print("Desconto(%): ");
		desconto = teclado.nextDouble();
		//PROCESSAMENTO1
		totalDesconto = total - (desconto*total) / 100;
		//SAÍDA1
		System.out.println("Total com desconto: R$ "+formatador.format(totalDesconto));
		//ENTRADA2
		System.out.println("_________________________________");
		System.out.print("Valor pago em dinheiro: ");
		valorPago = teclado.nextDouble();
		//PROCESSAMENTO2
		troco = valorPago - totalDesconto;
		//SAÍDA2
		System.out.println("Troco: R$"+formatador.format(troco));
		teclado.close();
	}

}
