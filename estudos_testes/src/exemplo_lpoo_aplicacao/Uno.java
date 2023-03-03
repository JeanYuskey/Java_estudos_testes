package exemplo_lpoo_aplicacao;

public class Uno {

	public static void main(String[] args) {
		Carro uno = new Carro(1991,"Branco");  // No objeto uno, foi utilizado o segundo construtor
		System.out.println("Carro: Uno");
		System.out.println("Ano: "+uno.ano);
		System.out.println("Cor: "+uno.cor);
		uno.ligar();
		
		//A principal vantagem de construir dessa forma é que vc economiza linhas de códigos, pq eu defino as variáveis dentro do parenteses na hora de criar o objeto
		//Importante salientar que não apareceu o n° do Chassi, isto pq essas informações estão no primeiro construtor, que não utilizamos
	}

}
