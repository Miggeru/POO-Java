package exercicios_aula02;

import java.util.Scanner;

public class ex_05 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		float n1 = 0, n2 = 0, n3 = 0, n4 = 0, media = 0;
		
		System.out.printf("Insira a sua nota 1 de matemática e irei lhe informar a média: \n");
		n1 = leitor.nextFloat();
		
		System.out.printf("Insira a sua nota 2 de matemática e irei lhe informar a média: \n");
		n2 = leitor.nextFloat();
		
		System.out.printf("Insira a sua nota 3 de matemática e irei lhe informar a média: \n");
		n3 = leitor.nextFloat();
		
		System.out.printf("Insira a sua nota 4 de matemática e irei lhe informar a média: \n");
		n4 = leitor.nextFloat();
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.println("a media e: "+ media);
	}
}
