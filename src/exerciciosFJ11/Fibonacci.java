package exerciciosFJ11;

public class Fibonacci {

	public int calculaFibonacci(int idx){
		if(idx==1){
			return 1;
		}else{
			if(idx==2){
				return 1;
			}else{
				return calculaFibonacci(idx-1) + calculaFibonacci(idx-2);
			}
		}
	}
	
}
