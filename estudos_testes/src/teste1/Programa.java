package teste1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); //Captura de teclado
		
		Produtos produto = new Produtos(); //Mostrar que a classe existe (instanciar a classe),ou seja, a classe Produtos se chama produto
		//Tudo que for inserido em produto, ele irá enviar para as variáveis da classe Produtos
		
		System.out.println("Nome do produto: "); //Informar ao usuário oq será solicitado
		produto.produto = teclado.next(); //Direcionar as informações
		
		System.out.println("Insira a quantidade: "); //Informar ao usuário oq será solicitado
		produto.quantidade = teclado.nextDouble();
		
		System.out.println("Insira o Preço individual: "); //Informar ao usuário oq será solicitado
		produto.preco = teclado.nextDouble();
		
		System.out.println("Confirmação: "+produto.produto+", Estoque: "+produto.quantidade+" Preço: "+produto.preco); //Resposta ao usuário e concatenação
		
		System.out.println("Deseja acrescentar produtos ao estoque? ");
		int estoque = teclado.nextInt();
		produto.addProdutos(estoque);
		System.out.println("Atualização: "+produto.produto+", Estoque atual: "+produto.quantidade+" Preço: "+produto.preco);
		
		System.out.println("Foi realizada alguma venda no período? ");
		estoque = teclado.nextInt(); //ñ posso ter a msm variável indicado nas programações, portanto deve tirar o "Int", assim ele já indicará que es trata da msm variável, oq adiciona no estoque e oq remove do estoque
		produto.subProdutos(estoque);
		System.out.println("Atualização após vendas: "+produto.produto+", Estoque atual: "+produto.quantidade+" Preço: "+produto.preco+" Valor atual do estoque: R$ "+produto.quantidade*produto.preco);
		
		JOptionPane.showMessageDialog(null, "Atualização após vendas: "+produto.produto+", Estoque atual: "+produto.quantidade+" Preço: "+produto.preco+" Valor atual do estoque: R$ "+produto.quantidade*produto.preco); //Resposta ao usuário em Java (Complemento)
		
		teclado.close();

	}

}
