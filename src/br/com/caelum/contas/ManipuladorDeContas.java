package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {
	private Conta conta;

	public void criaConta(Evento evento) {
		String tipo = evento.getSelecionadoNoRadio("tipo");
		if (tipo.equals("Conta Corrente")) {
			this.conta = new ContaCorrente();
			this.conta.setAgencia(evento.getString("agencia"));
			this.conta.setNumero(evento.getInt("numero"));
			this.conta.setTitular(evento.getString("titular"));
		} else if(tipo.equals("Conta Poupan�a")) {
			this.conta = new ContaPoupanca();
			this.conta.setAgencia(evento.getString("agencia"));
			this.conta.setNumero(evento.getInt("numero"));
			this.conta.setTitular(evento.getString("titular"));
		}
	}

	public void deposita(Evento evento) {
		double valorDigitado = evento.getDouble("valorOperacao");
		if (this.conta.getTipo().equals("Conta Corrente")) {
			this.conta.deposita(valorDigitado);
		}else if (this.conta.getTipo().equals("Conta Poupan�a")) {
			this.conta.deposita(valorDigitado);
		}
	}

	public void saca(Evento evento) {
		double valorDigitado = evento.getDouble("valorOperacao");
		if (this.conta.getTipo().equals("Conta Corrente")) {
			this.conta.saca(valorDigitado);
		}else if (this.conta.getTipo().equals("Conta Poupan�a")) {
			this.conta.saca(valorDigitado);
		}
	}
	
	public void transfere(Evento evento){
		Conta destinatario = (Conta)evento.getSelecionadoNoCombo("destino");
		conta.transfere(evento.getDouble("valorOperacao"), destinatario);
	}

}
