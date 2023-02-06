package exercicios;

public class Porta {
	boolean aberta;
	String cor;
	double x, y, z;

	void abre() {
		aberta = true;
	}

	void fecha() {
		aberta = false;
	}

	void pinta(String cor) {
		this.cor = cor;
	}

	boolean estaAberta() {
		return aberta;
	}
}