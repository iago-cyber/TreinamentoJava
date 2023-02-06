package exercicios;

public class Casa {
	String cor;
	Porta porta1 = new Porta();
	Porta porta2 = new Porta();
	Porta porta3 = new Porta();
	
	void pinta(String cor){
		this.cor=cor;
	}
	int quantasPortasEstaoAbertas(){
		int quantidade=0;
		if(porta1.aberta==true){
			quantidade+=1;
		}
		if(porta2.aberta==true){
			quantidade+=1;
		}
		if(porta3.aberta==true){
			quantidade+=1;
		}
		return quantidade;
	}
}
