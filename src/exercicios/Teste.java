package exercicios;

import java.util.Scanner;

class Teste {
	public static void main(String[] args) {
		// Exercicios ex = new Exercicios();
		// ex.exercicio13();

		// Conta iago = new ContaCorrente();
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

		// ManipuladorDeContas gerente = new ManipuladorDeContas();
		// gerente.criaConta();

		// new TestaArrays();

		// TestaSplit ts= new TestaSplit();
		// System.out.println(ts.ordemInvertida("Socorram-me, subi no ônibus em
		// Marrocos"));

		// Banco banco = new Banco("Raimundão da massa Bank", 121);
		// Data data = new Data();
		// data.setData(10, 2, 2023);
		// String nome="";
		// for (int i = 0; i < 10; i++) {
		// switch (i) {
		// case 0:
		// nome = "Iago";
		// break;
		// case 1:
		// nome = "Fillipy";
		// break;
		// case 2:
		// nome = "Daniel";
		// break;
		// case 3:
		// nome = "Edison";
		// break;
		// case 4:
		// nome = "Thomas";
		// break;
		// case 5:
		// nome = "Leticia";
		// break;
		// case 6:
		// nome = "Adriano";
		// break;
		// case 7:
		// nome = "Simone";
		// break;
		// case 8:
		// nome = "Paulo";
		// break;
		// case 9:
		// nome = "Herminio";
		// break;
		// }
		// ContaCorrente conta = new ContaCorrente();
		// conta.setNomeDoTitular(nome);
		// conta.setNumeroDaConta(i);
		// conta.setAgencia("1000");
		// conta.depositar(i * 1000.0);
		// conta.setDataAbertura(data);
		// banco.adiciona(conta);
		// }
		// banco.mostrarContas();

		// Conta iago = new ContaCorrente();
		// Data data = new Data();
		// data.setData(10, 2, 2023);
		// iago.setDataAbertura(data);
		// System.out.print(iago.recuperaDadosParaImpressao());

		// ArrayFibonacci fibonacci = new ArrayFibonacci();
		// for (int i = 1; i <= 6; i++) {
		// int resultado = fibonacci.calculaFibonacci(i);
		// System.out.println(resultado);
		// }

		Casa home = new Casa();
		Porta porta1 = new Porta();
		porta1.pinta("roxo");
		porta1.abre();
		porta1.setDimencoes(3, 5, 2);
		Porta porta2 = new Porta();
		porta2.pinta("rojo");
		porta2.fecha();
		porta2.setDimencoes(3, 5, 2);
		Porta porta3 = new Porta();
		porta3.pinta("lazuli");
		porta3.abre();
		porta3.setDimencoes(3, 5, 2);
		home.adicionaPorta(porta1);
		home.adicionaPorta(porta2);
		home.adicionaPorta(porta3);
		System.out.println("Tem "+home.quantasPortasEstaoAbertas()+" portas abertas.");
		System.out.println("Tem "+home.getTotalDePortas()+" portas na casa");
	}
}