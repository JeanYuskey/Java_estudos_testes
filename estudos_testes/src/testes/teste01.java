package testes;
public class teste01 {
	
    public static void main (String[] args) {
     
        int numero = 12;
    // Uso da variável
        System.out.println(numero);
    // Outra Declaração com Inicialização double preco = 137. 6;
       double preco = 123.4;
       
       System.out.println(preco+"           "+numero);
       
    // 
       String nome ="Jean";
       System.out.println(nome);
       
       int valor1 = 10;
       int valor2 = 5;
       System.out.println(valor1+valor2);
       
    //Conversão Camel Case
       String variavelTesteAula = "Yuskey";
       
       double casasDecimais = 2.512345;
       System.out.println(casasDecimais);
       System.out.println(valor1*casasDecimais);
       
    //Operadores Aritméticos
       int resultado1;
       int resultado2;
       int resultado3;
       int resultado4;
       resultado1 = valor1+valor2;
       resultado2 = valor1-valor2;
       resultado3 = valor1*valor2;
       resultado4 = valor1/valor2;
       System.out.println(resultado1);
       System.out.println(resultado2);
       System.out.println(resultado3);
       System.out.println(resultado4);
       
    //Operadores Lógicos(Boolean -> True e False)
       int idade1 = 18;
       boolean resultadoB1; //Se tiver uma idade maior q 18 é T, senão F
       resultadoB1 = idade1 >= 18;
       System.out.println(resultadoB1);
       
       
       int idade2 = 16;
       boolean resultadoB2; //Se tiver uma idade maior q 18 é T, senão F
       resultadoB2 = idade2 >= 18;
       System.out.println(resultadoB2);
       
    //IF e ELSE (estrutura de decisão)]
       int idade3 = 16;
       if(idade3 >= 18){
    	   System.out.println("Login realizado com sucesso");
       }
       else {
    	   System.out.println("Loguin negado");
       }

       
       int idade4 = 39;
       if(idade4 >= 18){
    	   System.out.println("Login realizado com sucesso"); 
       }
       else {
    	   System.out.println("Loguin negado");
       }

    //
       int opcao = 4; //1 mostrar saldo
    // int opcao = 2; //2 mostrar o nome do assinante
    // int opcao = 3; //3 encaminhar para um atendente
       			      //Banco de Dados
       if(opcao==1) {
    	   System.out.println("Saldo da sua conta é R$1.500,00 no momento");
       }else if(opcao==2) {
    	   System.out.println("O Usuário na conta é Theo Augusto Cardoso");
       }else if(opcao==3) {
    	   System.out.println("Você será encaminhado(a) para um atendente");
       }else {
    	   System.out.println("Opção não encontrada, por favor tente novamente");
       }
       


    //Arrays -> possibilidade de coletar mais de um a informação em um única variável
       String[] produto = {"Pacote Office", "Excel", "Word"};
       
       System.out.println(produto[0]);
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    }
}