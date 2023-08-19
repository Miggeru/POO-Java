package teste;
import javax.swing.JOptionPane;
public class ex003 {
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog(null, "Qual o seu nome: ", "Nome", JOptionPane.INFORMATION_MESSAGE);
		
		String idade = JOptionPane.showInputDialog(null, "Qual a sua idade: ", "Idade", JOptionPane.INFORMATION_MESSAGE);
	
		String dataNascimento = JOptionPane.showInputDialog(null, "Qual a sua data de nascimento: ", "Data de Nascimento", JOptionPane.INFORMATION_MESSAGE);
	
		String resposta = "Nome do usuário: " + nome + " \nidade do usuário: " + idade + " \ndata de nascimento do usuário: " + dataNascimento;
		JOptionPane.showMessageDialog(null, resposta, "Importante", JOptionPane.INFORMATION_MESSAGE);
	}
}
