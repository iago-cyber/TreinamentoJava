package exercicios;

public class Pessoa {
	String nome;
	int idade;
	
	void fazAniversario(){
		idade+=1;
	}
	String identidade(){
		String dados = "\nNome: "+nome+"\nIdade: "+idade;
		return dados;
	}
}
