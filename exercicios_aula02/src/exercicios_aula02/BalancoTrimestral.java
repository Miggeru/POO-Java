package exercicios_aula02;

public class BalancoTrimestral {

	public static void main(String[] args) {
		
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		System.out.println(gastosTrimestre);
		
		float mediaMensal = (float)(gastosJaneiro + gastosFevereiro + gastosMarco) / 3;
		
		System.out.print("Valor da media mensal =" + mediaMensal);
	}
}
