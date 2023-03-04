package testes;

import java.text.DecimalFormat;
import java.util.Scanner;

//Exercício 6: Desenvolva um aplicativo no console(terminal) para calcular o valor do IMC. O aplicativo deverá exibir além do valor do IMC a classificação de acordo com a tabela do IMC.
public class IMC {

	public static void main(String[] args) {
		// VARIÁVEIS
		double peso, altura, imc;
		// OBJETOS
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		// ENTRADA
		System.out.println("Cálculo do IMC");
		System.out.print("Digite o seu peso: ");
		peso = teclado.nextDouble();
		System.out.print("DIgite sua altura: ");
		altura = teclado.nextDouble();
		// PROCESSAMENTO
		imc = peso / (altura * altura);
		// SAÍDA
		System.out.println("IMC: " + formatador.format(imc));
		teclado.close();
		// classificação
		if (imc < 18.5) {
			System.out.println("Abaixo do peso");
		} else if (imc < 25) {
			System.out.println("Peso ideal");
		} else if (imc < 30) {
			System.out.println("Levemente acima do peso");
		} else if (imc < 35) {
			System.out.println("Obesidade grau I");
		} else if (imc < 40) {
			System.out.println("Obesidade grau II");
		} else {
			System.out.println("Obesidade grau III (Mórbida)");
		}

	}

}
