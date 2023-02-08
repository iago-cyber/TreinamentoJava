package exercicios;

public abstract class Conta {
	private static int identificador; // um atributo de classe
	private String nomeDoTitular;
	private int numeroDaConta;
	private String agencia;
	private double saldo;
	private Data dataAbertura = new Data();

	Conta() {
		// atributos estaticos devem ser acessados pelo nome da classe e não
		// pelo this
		Conta.identificador = Conta.identificador + 1;
	}

	public void sacar(double valor) {
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

	public void depositar(double valor) {
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
		String dados = "\nTitular: " + this.nomeDoTitular;
		dados += "\nNumero: " + this.numeroDaConta;
		dados += "\nAgencia: " + this.agencia;
		dados += "\nSaldo: R$" + this.saldo;
		dados += "\nData de Abertura:" + this.dataAbertura.getDataFormatada();

		return dados;
	}

	public double getSaldo(){
		return this.saldo;
	}
	
	public String getNomeDoTitular() {
		return this.nomeDoTitular;
	}

	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}

	public int getNumeroDaConta() {
		return this.numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
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

}
