package exemplo_lpoo_aplicacao;

public class Ferrari {

	public static void main(String[] args) { // marco a caixa 'public static void main...' para ele criar o método principal, ou seja, eu vou executar esse classe de nome ferrari
		Carro ferrari = new Carro(); //chamo a classe Carro, dps defino o nome do objeto (no caso ferrari) e dps a criação do objeto usando o new

// resumindo: criei um objeto de nome ferrari usando a classe Carro como modelo
// obs: a classe ferrari, que estou criando, está no msm pacote da classe Carro (instanciar = dps de criar o objeto)
		// agr a gnt vai atribuir valores, as variáveis ano e cor
		ferrari.ano = 2012;
		ferrari.cor = "Vermelho";
		System.out.println("Carro: Ferrari");
		System.out.println("Ano: "+ferrari.ano);
		System.out.println("Cor: "+ferrari.cor);
		ferrari.ligar();
		ferrari.acelerar();
		
	}

}
