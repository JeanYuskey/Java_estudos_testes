package exemplo_lpoo_aplicacao;

public class Cessna {

	public static void main(String[] args) {
		Aviao cessna = new Aviao(); //sem nenhuma novidade, nós, apenas, estamos criando um objeto de nome cessna, tendo como modelo a classe Aviao
		cessna.ano = 2015;
		cessna.cor = "Branco";
		cessna.envergadura = 11;
		System.out.println("Avião: Cessna");
		System.out.println("Ano: "+ cessna.ano);
		System.out.println("Cor: "+ cessna.cor);
		System.out.println("Envergadura "+cessna.envergadura+"m");
		cessna.aterrizar();
		cessna.desligar();
		//obs: foi criado um n° de Chassi aleatório pq na classe modelo Carro tem um construtor q gera esse n° aleatório automaticamente
		
		//Base: Aula de Java_Polimorfismo
		//OBJ: Colocar 2 métodos, o ligar e o acelerar que herdou da classe carro
		System.out.println("-------------------------------------");
		cessna.ligar();
		cessna.acelerar();
		//Após isso, vou utilizar o polimorfismo para modificar o método acelerar, ("Vruuummmmmmmm"), ou seja,
		//quando for executar o método acelerar quero q o aviao decole e para isso devo ir lá na classe Aviao e sobre-escrever o método acelerar
	}

}
