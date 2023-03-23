package testes;

import java.util.Scanner;

//Exercício 7:  Desenvolva o jogo “Pedra – Papel – Tesoura” (Jokenpô)

public class JoKenPo {

	public static void main(String[] args) {
		int jogador, computador;
		Scanner teclado = new Scanner(System.in);
		System.out.println("_____JoKenPô_____" + "\n");
		System.out.println("1.Pedra" + "\n2.Tesoura" + "\n3.Papel");
		System.out.print("Digite a sua opção desejada: ");
		// lógica do jogador
		jogador = teclado.nextInt();
		System.out.println("");
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Jogador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Jogador escolheu TESOURA");
			break;

		default:
			System.out.println("Opção inválida");
			break;
		}
		// lógica do computador
		computador = (int) (Math.random() * 3 + 1); // Para gerar um n° aleatório de 1 a 3 temos que utilizar o
													// Math.random e temos que colocar o int em parênteses, pois esse
													// gerador de n° gera números não inteiros
		// E tbm, temos que colocar + 1, pois se n colocasse ia gerar os números 0, 1 e
		// 2, portanto, com essa correção, irá gerar os números 1, 2 e 3 pois os valores
		// estão sendo somado por 1
		teclado.close();
		switch (computador) {
		case 1:
			System.out.println("Computador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Computador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Computador escolheu TESOURA");
			break;
		}
		//lógica para determinar o vencedor
		if (jogador == computador) {
			System.out.println("EMPATE");
		} else {
			if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2)) {
				System.out.println("JOGADOR VENCEU");
			}else {
				System.out.println("COMPUTADOR VENCEU ");
			}
		}
	}

}
