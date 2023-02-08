package exercicios;

public class TestaSplit {
	public String ordemInvertida(String frase) {
		String inversa = "";

		String[] palavras = frase.split(" ");

		for (int i = palavras.length-1; i >= 0; i--) {
			inversa += palavras[i] + " ";
		}
		return inversa;
	}
}
