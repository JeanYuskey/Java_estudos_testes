package exemplo_lpoo_aplicacao;

import java.util.Random;

public class Carro { // Essa classe é apenas usada como modelo para criar os objetos, por isso não foi marcado o public static void main
	int ano; //variável
	String cor; //variável
	
//dps das variáveis, eu vou criar o primeiro construtor
	
	//Para não deixar o n° de Chassi dos carros em braco, viu gerar um número aleatório na criação desse Chassi e para fazer isso:
	//Vamos usar a classe Random (o JAVA tem várias classes modelos prontas para vc usar)
	//Dps deve importar esse recurso e para isso digite a combinação de tecla: Ctrl + Shift + O
	
	public Carro() { //obs: a gnt não usa a palavra class
		Random gerador = new Random();
		int chassi = gerador.nextInt(1000); //criado uma variável de nome chassi e voua tribuir a essa variável um n° aleatório (dentro do parênteses deve definir um valor limite desses n° aleatórios, no caso de ter colocado 1000, irá gerar um valor entre 0 a 999)
		
		System.out.println("Chassi: " +chassi); // ao inicializar os objetos ferrari e fusca, irá aparecer printado "Chassi:...", ou seja, essa informação veio diretamente do primeiro construtor criado
	}
	
//agr vou criar um segundo construtor
	public Carro(int ano, String cor) { //quando criamos um construtor com parâmetros, é necessário que este construtor receba a variável definido, no caso a variável ano e cor
		this.ano = ano; // a palavra "this" se refere ao construtor
		this.cor = cor;
		//Portanto, ao criar um objeto tendo como modelo este construtor, eu preciso setar esses dois parâmetros
		System.out.println("          ___________");
		System.out.println("         /     /     \\");
		System.out.println(" _______/_____/_______\\");
		System.out.println("[0[\\\\[0[___   | - ____|");
		System.out.println("\\_____|___/. \\___|//. \\/");
		System.out.println("  \\\\_ \\\\__/   \\\\__/ ");
		System.out.println("__________________________");
		
	}
	
	void ligar() { //método
		System.out.println("engine ON ........");
	}
	void desligar() { //método
		System.out.println("engine OFF .");
	}
	void acelerar() { //método
		System.out.println("Vruuuummmmmmmmmm");
	}
}
//Base: Aula de Java_Polimorfismo
//Resumo: Dentro do nosso pacote exemplo_lpoo_aplicacao, temos:
//uma super classe Carro q têm 2 atributos (ano e cor) e 3 métodos (ligar, desligar e acelerar)
//Criamos um objeto chamado fusca através da classe Carro e nela utilizamos os 3 métodos

//E tbm, criamos uma outra classe chamada Aviao, em que ela estende a classe Carro, ou seja, a Herança
//Nesta classe Aviao, criei um outro atributo (envergadura) e um outro método (aterrizar)
