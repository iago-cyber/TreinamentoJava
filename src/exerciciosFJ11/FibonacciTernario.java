package exerciciosFJ11;

public class FibonacciTernario {
	public int calculaFibonacci(int idx){
		return(idx==1) ? 1 :(idx==2) ? 1 : calculaFibonacci(idx-1) + calculaFibonacci(idx-2);
	}
}
