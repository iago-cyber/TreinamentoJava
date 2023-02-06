package exercicios;

import java.util.Scanner;

public class Exercicios {
// capitulo 2
	void exercicio1() {
		System.out.println("Alguma coisa");
	}

	void exercicio2() {
		System.out.println("Uma coisa");
		System.out.println("Outra coisa");
	}

	void exercicio3() {
		System.out.println("Mãe\nEstou no console");
	}

	void exercicio4() {
		double jan = 15000;
		double fev = 23000;
		double mar = 17000;
		double media = (jan + fev + mar) / 3;
		double total = jan + fev + mar;

		System.out.println("Media mensal: " + media + "\nTotal do trimestre: " + total);
	}

	void exercicio5() {
		for (int i = 150; i <= 300; i++) {
			System.out.println(i);
		}
	}

	void exercicio6() {
		int soma = 0;
		for (int i = 1; i <= 1000; i++) {
			soma += i;
		}
		System.out.print(soma);
	}

	void exercicio7(){
		for(int i=1;i<100;i++){
			if(i%3==0){
				System.out.println(i);
			}
		}
	}
	
	void exercicio8(){
		int fatorial = 1;
		for(int i=1; i<=10; i++){
			System.out.println("Fatorial de "+i+" é: "+(fatorial *= i));
		}
	}

	void exercicio9(){
		long fatorial = 1;
		for(long i=1;i<=40;i++){
			System.out.println("Fatorial de "+i+" é: "+(fatorial*=i));
		}
	}
	
	void exercicio10(){
		int f=0,a=1,n=0;
		while(f<=100){
			System.out.print(f+" ");
			f=a+n;
			a=n;
			n=f;
		}
	}
	
	void exercicio11(){
		Scanner X = new Scanner(System.in);
		int x = X.nextInt();
		while(x!=1){
			if(x%2==0){
				x=x/2;
			} else{
				x=3*x+1;
			}
			System.out.print(x+" ");
		}
		X.close();
	}
	
	void exercicio12(){
		int r=0,i=0,j=0;
		for(i=1;i<=5;i++){
			for(j=1;j<=i;j++){
				r = i*j;
				System.out.print(r+" ");
			}
			System.out.println("");
		}
	}
	
	void exercicio13(){
		int f=0,a=1;
		while(f<=100){
			System.out.print(f+" ");
			f=a+f;
			a=f-a;
			
		}
	}
// fim do capitulo 2
	
	
	
}
