package visualizacao;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {

	public static int encerrarCalculadora() {
		String[] encerrar = { "Sair do programa", "Continuar calculando" };
		JComboBox<String> menu = new JComboBox<String>(encerrar);
		JOptionPane.showConfirmDialog(menu, menu, "Selecione a opção desejada", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}

	public static int solicitaOperacao() {
		String[] operacao = { "Soma", "Subtração", "Divisão", "Multiplicação" };
		JComboBox<String> menu = new JComboBox<String>(operacao);
		JOptionPane.showConfirmDialog(menu, menu, "Selecione a operação", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}

	public static double solicitaNumero(String ordem) {
		double num = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + ordem + " número"));
		return num;
	}

	public static void mostrarResultado(double resultado, int operacao) {
		String op = "";
		if (operacao == 0) {
			op = "soma";
		} else if (operacao == 1) {
			op = "subtração";
		} else if (operacao == 2) {
			op = "divisão";
		} else if (operacao == 3) {
			op = "multiplicação";
		}
		JOptionPane.showMessageDialog(null, "O resultado da " + op + " é de: " + resultado);
	}

}
