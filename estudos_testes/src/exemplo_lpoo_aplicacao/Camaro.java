package exemplo_lpoo_aplicacao;

public class Camaro {

	public static void main(String[] args) {
		Carro camaro = new Carro(); //criei um novo objeto chamado camaro, tendo como modelo a classe Carro sem parâmetro(no caso, sem nada dentro dos parênteses)
		camaro.ano = 2012;
		camaro.cor = "Amarelo";
		System.out.println("Carro: Camaro");
		System.out.println("Ano: "+camaro.ano);
		System.out.println("Cor: "+camaro.cor);
		camaro.ligar();
		camaro.acelerar();

	}

}
