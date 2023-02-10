package exercicios;

public class Casa {
	private String cor;
	private int totalDePortas;
	private Porta[] portas = new Porta[3];

	public void pinta(String cor) {
		this.cor = cor;
	}

	public int quantasPortasEstaoAbertas() {
		int portasAbertas = 0;

		for (int i = 0; i < portas.length; i++)
			if (portas[i].estaAberta() == true) {
				portasAbertas += 1;
			}

		return portasAbertas;
	}

	public void adicionaPorta(Porta porta) {
		for (int i = 0; i < this.portas.length; i++) {
			if (this.portas[i] == null) {
				this.portas[i] = porta;
				totalDePortas++;
				break;
			}
		}
	}

	public int getTotalDePortas() {
		return this.totalDePortas;
	}
}
