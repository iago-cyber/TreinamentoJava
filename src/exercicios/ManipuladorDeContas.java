package exercicios;

import java.util.Scanner;

public class ManipuladorDeContas {
	public void criaConta() {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o tipo de conta:\n1-corrente\n2-poupança");
		int tipoDeConta = s.nextInt();

		if (tipoDeConta == 1) {
			ContaCorrente conta = new ContaCorrente();
			System.out.println("Digite o nome do titular:");
			conta.setNomeDoTitular(s.nextLine());
			System.out.println("Digite o numero da conta:");
			conta.setNumeroDaConta(s.nextInt());
			System.out.println("Digite a agencia:");
			conta.setAgencia(s.nextLine());
			Data data = new Data();
			System.out.println("Digite a data de criação da conta");
			data.setData(s.nextInt(), s.nextInt(), s.nextInt());
			conta.setDataAbertura(data);
			System.out.print(conta.recuperaDadosParaImpressao());
			s.close();
		}
		if (tipoDeConta == 2) {
			ContaPoupanca conta = new ContaPoupanca();
			System.out.println("Digite o nome do titular:");
			conta.setNomeDoTitular(s.nextLine());
			System.out.println("Digite o numero da conta:");
			conta.setNumeroDaConta(s.nextInt());
			System.out.println("Digite a agencia:");
			conta.setAgencia(s.nextLine());
			Data data = new Data();
			System.out.println("Digite a data de criação da conta: dia mes ano");
			data.setData(s.nextInt(), s.nextInt(), s.nextInt());
			conta.setDataAbertura(data);
			System.out.print(conta.recuperaDadosParaImpressao());
			s.close();
		}
	}
}
