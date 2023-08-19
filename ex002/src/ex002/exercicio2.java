package ex002;

import javax.swing.JOptionPane;

public class exercicio2 {
	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog(null, "Informe seu login", "Login", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Seu login é " + login, "Titulo", JOptionPane.INFORMATION_MESSAGE);
	}
}
