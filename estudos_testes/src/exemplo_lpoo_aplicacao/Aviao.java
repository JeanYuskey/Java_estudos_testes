package exemplo_lpoo_aplicacao;

public class Aviao extends Carro { //A palavra reservada extends é usada para criar a herança
	//dentro dessa classe modelo(subclasse) vou criar um novo atributo e método
	double envergadura;
	
	void aterrizar( ) {
		System.out.println("-------------__________________");
	}
	
	/*Conceito de Polimorfismo (sobre-escrever método)
	Criamos um novo método na classe Aviao com o msm nome da classe Carro, ou seja, o método acelerar da clase Carro
	*/
	void acelerar() {
		System.out.println("____________------------------");
		
	//Note no Outline que esse método acelerar é formado por um triângulo azul cheio e maior e um outro, ao lado, menor
	//Isso significa que esse método n é novo, e sim, um método sobre-escrito q vai ter um comportamento diferente em todos os objetos que forem criados a partir dessa classe
	}
}
