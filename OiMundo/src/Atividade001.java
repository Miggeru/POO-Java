import java.util.Scanner;

public class Atividade001 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe seu nome: ");
		String nome = leitor.nextLine();
		
		System.out.println("Informe sua idade: ");
		String idade = leitor.next();
		
		System.out.println("Informe sua data de nascimento");
		String nascimento = leitor.next();
		
		System.out.println("Seu nome e: " + nome + ", voce tem " + idade + " anos e nasceu " + nascimento);
	}

}
