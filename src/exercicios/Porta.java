package exercicios;

public class Porta {
	private boolean aberta;
	private String cor;
	private double x, y, z;

	public void abre() {
		this.aberta = true;
	}

	public void fecha() {
		this.aberta = false;
	}

	public void pinta(String cor) {
		this.cor = cor;
	}
	public String getCor(){
		return this.cor;
	}

	public boolean estaAberta() {
		return aberta;
	}
	public void setDimencoes(double x, double y, double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public String getDimencoes(){
		return "\nx: "+this.x+" y: "+this.y+" z: "+this.z;
	}
}