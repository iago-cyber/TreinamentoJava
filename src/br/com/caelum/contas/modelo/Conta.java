package br.com.caelum.contas.modelo;

import exerciciosFJ11.Data;

public abstract class Conta implements Comparable<Conta> {
	private static int identificador; // um atributo de classe
	private String titular;
	private int numero;
	private String agencia;
	protected double saldo;
	private Data dataAbertura = new Data();

	Conta() {
		// atributos estaticos devem ser acessados pelo nome da classe e não
		// pelo this
		Conta.identificador = Conta.identificador + 1;
	}

	public void saca(double valor) {
		try {
			if (valor > this.saldo) {
				throw new SaldoInsuficienteException(valor);
			} else {
				this.saldo -= valor;
			}
		} catch (SaldoInsuficienteException e) {
			System.out.println(e);
		}
	}

	public void deposita(double valor) {
		try {
			if (valor < 0) {
				throw new IllegalArgumentException();
			} else {
				this.saldo += valor;
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e + "\nValor de deposito negativo");
		}
	}

	public double getRendimento() {
		return saldo * 0.1;
	}

	public String recuperaDadosParaImpressao() {
		String dados = "\nTitular: " + this.titular;
		dados += "\nNumero: " + this.numero;
		dados += "\nAgencia: " + this.agencia;
		dados += "\nSaldo: R$" + this.saldo;
		dados += "\nData de Abertura: " + this.dataAbertura.getDataFormatada();
		dados += "\nTipo: " + this.getTipo();

		return dados;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String nomeDoTitular) {
		this.titular = nomeDoTitular;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numeroDaConta) {
		this.numero = numeroDaConta;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getDataAbertura() {
		return this.dataAbertura.getDataFormatada();
	}

	public void setDataAbertura(Data dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public int getIdentificador() {
		return Conta.identificador;
	}

	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}

	public abstract String getTipo();

	public void transfere(double transferencia, Conta destinatario) {
		this.saca(transferencia);
		destinatario.deposita(transferencia);
	}

}
