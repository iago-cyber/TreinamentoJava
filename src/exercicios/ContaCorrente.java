package exercicios;

public class ContaCorrente extends Conta{
	
	@Override
	public void sacar(double valor) {
		super.sacar(valor - 0.10);
	}

}
