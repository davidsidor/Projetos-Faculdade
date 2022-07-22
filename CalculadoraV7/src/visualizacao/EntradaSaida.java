package visualizacao;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {

	public static int encerrarCalculadora() {
		String[] encerrar = { "Sair do programa", "Continuar calculando" };
		JComboBox<String> menu = new JComboBox<String>(encerrar);
		JOptionPane.showConfirmDialog(menu, menu, "Selecione a op��o desejada", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}

	public static int solicitaOperacao() {
		String[] operacao = { "Soma", "Subtra��o", "Divis�o", "Multiplica��o" };
		JComboBox<String> menu = new JComboBox<String>(operacao);
		JOptionPane.showConfirmDialog(menu, menu, "Selecione a opera��o", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}

	public static double solicitaNumero(String ordem) {
		double num = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + ordem + " n�mero"));
		return num;
	}

	public static void mostrarResultado(double resultado, int operacao) {
		String op = "";
		if (operacao == 0) {
			op = "soma";
		} else if (operacao == 1) {
			op = "subtra��o";
		} else if (operacao == 2) {
			op = "divis�o";
		} else if (operacao == 3) {
			op = "multiplica��o";
		}
		JOptionPane.showMessageDialog(null, "O resultado da " + op + " � de: " + resultado);
	}

}
