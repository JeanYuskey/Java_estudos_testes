package fundamentos;

public class Fundamentos {

	public static void main(String[] args) {
		String nome;
		nome = "Jean Yuskey";
		int idade = 21;
		char sexo = 'M';
		double temperatura = 26.7;
		boolean arCondicionado = false;
		
		System.out.println("Uso de variáveis na linguagem JAVA");
		System.out.println("Exemplos:");
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Sexo: "+sexo);
		System.out.println("Temperatura: "+temperatura);
		System.out.println("Boolean: "+arCondicionado);
		System.out.println("__________________________");
		System.out.println("");
		
		double i = 10;
		
		System.out.println("Operadores Aritméticos e Atribuições");
		System.out.println("Exemplos:");
		System.out.println("i = " + i);
		System.out.println("i = " + i +"+5 | i = " +(i+5));
		System.out.println("i = " + i +"-5 | i = " +(i-5));
		System.out.println("i = " + i +"*5 | i = " +(i*5));
		System.out.println("i = " + i +"/5 | i = " +(i/5));
		System.out.println("i = " + i +"%5 | i = " +(i%5));
		
		System.out.println("i += 5     | i = " + (i += 5));
		System.out.println("i -= 5     | i = " + (i -= 5));
		System.out.println("i *= 5     | i = " + (i *= 5));
		System.out.println("i /= 5     | i = " + (i /= 5));
		i++;
		System.out.println("i++        | i = " + i);
		i--;
		System.out.println("i--        | i = " + i);
		System.out.println("__________________________");
		
		System.out.println("ESTRUTURA DE CONTROLE");
		System.out.println("");
		System.out.println("Estrutura de controle condicional");
		System.out.println("");
		System.out.println("Exemplo 1 - Uso do 'if'");
		if (sexo == 'M') {
			System.out.println("Alistamento militar obrigatório");
		}
		
		System.out.println("");
		System.out.println("Exemplo 2 - Uso do 'if - else'");
		if (idade < 18) {
			System.out.println("Menor de idade");
		} else {
			System.out.println("Maior de idade");
		}
		
		System.out.println("");
		System.out.println("Exemplo 3 - Uso do 'else - if'");
		if(idade < 16) {
			System.out.println("PROIBIDO VOTAR");
		} else if (idade > 18 && idade < 70) {
			System.out.println("VOTO OBRIGATÓRIO");
		} else if (idade == 16 || idade == 17 || idade > 70) {
			System.out.println("VOTO FACULTATIVO");
		}
		
		System.out.println("");
		System.out.println("Exemplo 4 - Uso do 'switch case'");
		System.out.println("1. Cadastro de clientes");
		System.out.println("2. Cadastro de Usuários");
		System.out.println("3. Relatórios");
		int opcao =  3;
		switch (opcao) {
		case 1:
			System.out.println("CLIENTES");
			break;
		case 2:
			System.out.println("USUÁRIOS");
			break;
		case 3:
			System.out.println("RELATÓRIOS");
			break;
		default:
			System.out.println("Opção Inválida");
		}
		
		System.out.println("");
		System.out.println("Estrutura de repetições");
		System.out.println("");
		System.out.println("Exemplo 5 - Uso do 'for'");
		for (int j = 10; j > 0 ; j--) {
			System.out.println("Hello "+j);
		}
		System.out.println("");
		System.out.println("Exemplo 6 - Tabuada");
		for (int tabuada = 0; tabuada <=10; tabuada++) {
			System.out.println("");
			for (int valor = 0; valor <=10; valor++ ) {
				System.out.println(tabuada+ " x " +valor+ " = "+(tabuada*valor));
			}
		}
		//System.out.println("");
		//System.out.println("Exemplo bonûs - h/m/s");
		//for (int h = 00; h <= 23; h++ ) {
		//	for (int m = 00; m <= 59; m++) {
		//		for (int s = 00; s <=59; s++) {
		//			System.out.println(h+":"+m+":"+s);
		//		}
		//	}
		//}
		System.out.println("");
		System.out.println("Exemplo 7 - Uso da estrutura 'while'");
		int contador = 1;
		while (contador <= 10) {
			System.out.println(contador);
			contador++;	
		}
		System.out.println("");
		System.out.println("Exemplo 8 - Uso da estrutura 'do while'");
		char novoJogo;
		do {
			System.out.println("Deseja jogar novamente?(s/n)");
			novoJogo = 'n';
		} while (novoJogo == 's');
		System.out.println("GAME OVER");
	}	

}
