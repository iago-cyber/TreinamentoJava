package exerciciosFJ11;

public class Data {
	private int dia;
	private int mes;
	private int ano;

	public String getDataFormatada() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}

	public void setData(int dia, int mes, int ano) {
		try {
			if (mes >= 13 || mes <= 0) {
				throw new DataInvalidaException();
			} else if (mes == 2) {
				if (dia >= 30) {
					throw new DataInvalidaException();
				}else {
					this.dia = dia;
					this.mes = mes;
					this.ano = ano;
				}
			}else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				if (dia >= 31 || dia <= 0) {
					throw new DataInvalidaException();
				}else {
					this.dia = dia;
					this.mes = mes;
					this.ano = ano;
				}
			} else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				if (dia >= 32 || dia <= 0) {
					throw new DataInvalidaException();
				}else {
					this.dia = dia;
					this.mes = mes;
					this.ano = ano;
				}
			} 
		} catch (DataInvalidaException e) {
			System.out.println(e);
		}
	}
}
