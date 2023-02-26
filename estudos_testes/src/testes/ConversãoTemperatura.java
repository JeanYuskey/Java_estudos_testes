package testes;

import java.text.DecimalFormat;
import java.util.Scanner;

//Exercício 1 -  Desenvolva uma aplicação no console(terminal) que faça a conversão de temperatura em Fahrenheit para Celsius.
public class ConversãoTemperatura {

	public static void main(String[] args) {
		//VARIAVÉIS
		double c,f;
		//OBJETOS
		//Serve p/ capturar oq será digitado no teclado, e p/ isso deve usar um objeto criado a partir de uma classe modelo chamado Scanner
		//Dentro do parêntese deve colocar o parâmtro System.in e após isso importar esse comando, clicando no Ctrl+Shift+O
		Scanner teclado = new Scanner(System.in);
		//Para fazer a formatação do resultado em uma ou duas casas decimais, irei criar uma outra classe usando o DecimalFormat
		//Dentro do parêntese,"#0.0", significa q vai formatar o resultado em apenas uma casa decimal
		//Dps disso, Ctrl+Shift+O
		DecimalFormat formatador = new DecimalFormat("#0.0");
		//ENTRADA DE DADOS
		System.out.println("Conversão de temperatura");
		System.out.print("Digite a temperatura em Fahrenheit: ");
		//Nessa linha será capturado oq for digitado no teclado e armazenar na variável f
		f = teclado.nextDouble();
		//PROCESSAMENTO
		c = (5 * (f - 32))/9;
		//SAÍDA
		System.out.println("Temperatura em Celsius: "+formatador.format(c)+"°C"); //formatação em uma casa decimal
		teclado.close();

	}

}
