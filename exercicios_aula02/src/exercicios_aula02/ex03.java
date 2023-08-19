package exercicios_aula02;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		int num = 0;
		
		System.out.print("Escreva um numero: ");
		
		num = leitor.nextInt();
		
		for(int i = 1; i < 11; i++) {
			
			System.out.printf("%d x %d = %d\n", num, i, num * i);
		}
	}
}
