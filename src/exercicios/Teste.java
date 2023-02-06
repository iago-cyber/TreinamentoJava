package exercicios;

import java.util.Scanner;

class Teste {
	public static void main(String[] args) {
		// Exercicios ex = new Exercicios();
		// ex.exercicio13();

		// Conta iago = new Conta();
		// Scanner s = new Scanner(System.in);
		// iago.setNomeDoTitular(s.nextLine());
		// iago.setAgencia("maracanã");
		// iago.setNumeroDaConta(502476);
		// iago.depositar(5000000);
		// Data data = new Data();
		// data.setData(02, 05, 1998);
		// iago.setDataAbertura(data);
		// System.out.print(iago.recuperaDadosParaImpressao());
		// s.close();

		// Fibonacci fibonacci = new Fibonacci();
		// for (int i = 1; i <= 6; i++) {
		// int resultado = fibonacci.calculaFibonacci(i);
		// System.out.println(resultado);
		// }

		// FibonacciTernario fibonacci = new FibonacciTernario();
		// for (int i = 1; i <= 6; i++) {
		// int resultado = fibonacci.calculaFibonacci(i);
		// System.out.println(resultado);
		// }

		// Pessoa italo = new Pessoa();
		// italo.nome= "italo";
		// for(int i=0;i<23;i++){
		// italo.fazAniversario();
		// }
		// System.out.print(italo.identidade());

		// Porta porta = new Porta();
		// porta.cor = "cinza";
		// porta.x = 1;
		// porta.y = 3;
		// porta.z = 0.2;
		// porta.abre();
		// porta.fecha();
		// System.out.print((porta.aberta==true)?"Esta aberta!":"Esta
		// fechada!");

		// Casa barraco = new Casa();
		// barraco.cor = "azul";
		// barraco.porta1.cor = "vermelho";
		// barraco.porta1.abre();
		// barraco.porta2.cor = "vermelho";
		// barraco.porta2.fecha();
		// barraco.porta3.cor = "verde";
		// barraco.porta3.abre();
		// System.out.println("Tem "+barraco.quantasPortasEstaoAbertas()+"
		// portas abertas!");

		// Conta iago = new Conta();
		// System.out.println(iago.getIdentificador());
		// Conta iago2 = new Conta();
		// System.out.println(iago2.getIdentificador());
		// Conta iago3 = new Conta();
		// System.out.println(iago3.getIdentificador());
		// Conta flip = new Conta();
		// System.out.println(flip.getIdentificador());

		// PessoaFisica iago = new PessoaFisica();
		// iago.setCPF("05851405104");
		
		ManipuladorDeContas gerente = new ManipuladorDeContas();
		gerente.criaConta();
	}
}