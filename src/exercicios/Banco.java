package exercicios;

public class Banco {
	private String nome;
	private int numero;
	private Conta[] contas;

	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ContaCorrente[10];
	}

	public String getNome() {
		return this.nome;
	}

	public int getNumero() {
		return this.numero;
	}

	public Conta[] getContas() {
		return this.contas;
	}

	public void adiciona(Conta c) {
		for (int i = 0; i < this.contas.length; i++) {
			if (contas[i] == null) {
				contas[i] = c;
				break;
			}
		}
	}

	public void mostrarContas() {
		for (int i = 0; i < this.contas.length; i++) {
			System.out.println("\nConta na posição "+i+"");
			System.out.println("\nBanco: " + this.nome + contas[i].recuperaDadosParaImpressao());
		}
	}
}
