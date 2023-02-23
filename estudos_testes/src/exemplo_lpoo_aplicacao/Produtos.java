package exemplo_lpoo_aplicacao;

//produto(String), quantidade(double) e preço(double)
//Vamos criar variáveis públicas = todas as informações serão utilizadas na classe main, a classe Programa
//Criamos uma classe chamada de Produtos
//E essa classe deve ser ultilizada para a classe principal, por conta disso nós colocamos o public na frente do tipo da variável

public class Produtos {
	
	public String produto;
	public double quantidade;
	public double preco;
	
//Após a criação da classe, nós devemos criar os métodos(a forma de uso das variáveis) logo abaixo, utilizando o "VOID"
//Depois de criar o nome do método(ação), colocamos o "parenteses" em que dentro dela inserimos uma "variável e o tipo dela" para acumular o que o "addProdutos" vai fazer
//o uso "this" tem a função de referenciar algum dos itens colocado la no class Produtos, no caso nós vamos referenciar a "quantidade"
	
	public void addProdutos(int estoque) { //adicionar do estoque
		this.quantidade += estoque;
		
	}
	public void subProdutos(int estoque) { //remover do estoque 
		this.quantidade -= estoque;
		
	}


}
