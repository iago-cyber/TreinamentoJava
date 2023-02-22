package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta{
	private String tipo = "Conta Corrente";
	@Override
	public void saca(double valor) {
		try {
			if (valor > this.saldo) {
				throw new SaldoInsuficienteException(valor);
			} else {
				this.saldo -= (valor+0.10);
			}
		} catch (SaldoInsuficienteException e) {
			System.out.println(e);
		}
	}
	@Override
	public String getTipo(){
		return "Conta Corrente";
	}

}
