package exercicios;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public String getDataFormatada(){
		return dia+"/"+mes+"/"+ano;
	}
	public void setData(int dia, int mes,int ano){
		if(mes == 2){
			if(dia>=30){
				System.out.println("Data invalida!");
			}
		}
		if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
			if(dia>=31){
				System.out.println("Data invalida!");
			}
		} else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
			if(dia>=32){
				System.out.println("Data invalida!");
			}
		}
		if(mes>=13 || mes<=0){
			System.out.println("Mes invalido!");
		}else if(dia>=32 || dia <=0){
			System.out.println("Dia invalido!");
		}else{
			this.dia=dia;
			this.mes=mes;
			this.ano=ano;
		}
	}
}
