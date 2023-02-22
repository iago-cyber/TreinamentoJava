package exerciciosFJ11;

public class PessoaFisica {
	private String CPF;

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		if (CPF.length() != 11) {
			System.out.println("CPF com numeros insuficientes!");
		} else {
			if (valida(CPF) == true) {
				System.out.println("CPF Valido!");
			} else {
				System.out.println("CPF invalido!");
			}
		}
	}

	public boolean valida(String CPF) {
		int digito1, digito2;
		int resto1 = 1, resto2 = 1;
		int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11;
		char[] cpf = CPF.toCharArray();
		num1 = Integer.parseInt(String.valueOf(cpf[0]));
		num2 = Integer.parseInt(String.valueOf(cpf[1]));
		num3 = Integer.parseInt(String.valueOf(cpf[2]));
		num4 = Integer.parseInt(String.valueOf(cpf[3]));
		num5 = Integer.parseInt(String.valueOf(cpf[4]));
		num6 = Integer.parseInt(String.valueOf(cpf[5]));
		num7 = Integer.parseInt(String.valueOf(cpf[6]));
		num8 = Integer.parseInt(String.valueOf(cpf[7]));
		num9 = Integer.parseInt(String.valueOf(cpf[8]));
		num10 = Integer.parseInt(String.valueOf(cpf[9]));
		num11 = Integer.parseInt(String.valueOf(cpf[10]));

		if (num1 == num2 || num2 == num3 || num3 == num4 || num4 == num5 || num5 == num6 || num6 == num7 || num7 == num8
				|| num8 == num9 || num9 == num10 || num10 == num11) {
			return false;
		} else {
			digito1 = num1 * 10 + num2 * 9 + num3 * 8 + num4 * 7 + num5 * 6 + num6 * 5 + num7 * 4 + num8 * 3 + num9 * 2;
			resto1 = (digito1 * 10) % 11;
			if (resto1 == 10) {
				digito1 = 0;
			}
			digito2 = num1 * 11 + num2 * 10 + num3 * 9 + num4 * 8 + num5 * 7 + num6 * 6 + num7 * 5 + num8 * 4 + num9 * 3
					+ num10 * 2;
			resto2 = (digito2 * 10) % 11;

			if (resto1 == num10 && resto2 == num11) {
				return true;
			} else {
				return false;
			}

		}

	}
}
