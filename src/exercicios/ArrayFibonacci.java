package exercicios;

public class ArrayFibonacci {
	int[] fibonacci = new int[8];

	public int calculaFibonacci(int idx){
		if(idx==1){
			fibonacci[idx] = 1;
			return 1;
		}else{
			if(idx==2){
				fibonacci[idx] = 1;
				return 1;
			}else{
				fibonacci[idx]= fibonacci[idx-1] + fibonacci[idx-2];
				return fibonacci[idx];
			}
		}
	}
}
