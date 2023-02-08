package exercicios;

public class TestaArrays {
	
	TestaArrays() {
	
		Conta[] contas = new Conta[10];
		double media;
		double soma = 0;
		
		for (int i = 0; i < contas.length; i++) {
			Conta conta = new ContaCorrente();
			conta.depositar(i * 100.0);
			contas[i] = conta;
		}
		for (int i=0 ; i< contas.length ;i++){
			soma = contas[i].getSaldo()+(contas[i].getSaldo()+1);
			System.out.println("O saldo da "+(i+1)+"a conta é: "+contas[i].getSaldo());
		}
		System.out.println("A media das contas é: " + (media = soma/contas.length));
	}
	
}
