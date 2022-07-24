package lista3;

import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Retorno 
		int anoNascimento = solicitarNascimento ();
		calculaIdade(anoNascimento);
	}
	// Método para solicitar o nascimento do usuario 
	public static int solicitarNascimento () {
		int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual ano você nasceu?"));
		// Verificando se o ano é valido 
		while (anoNascimento <= 0 || anoNascimento >= 2021) {
			mostrarErroAno();
			anoNascimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual ano você nasceu?"));
		}
		return anoNascimento;
	}
	// Método para calcular a idade do usuario 
	public static void calculaIdade (int anoNascimento) {
		int idadeAtual = 2021 - anoNascimento;
		JOptionPane.showMessageDialog(null, "Sua idade em 2021 é de: " +idadeAtual+ " anos");
	}
	// Método para informar caso usuario digite um ano incorreto 
	public static void mostrarErroAno() {	
    	JOptionPane.showMessageDialog(null, "O ano digitado não é valido");
	}
}
