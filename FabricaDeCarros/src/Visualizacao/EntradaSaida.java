package Visualizacao;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {

	public static int solicitaOpcao() {
		String[] opcao = { "Fabricar carros", "Vender um carro", "Ver informações do carro", "Sair do programa" };
		JComboBox<String> menu = new JComboBox<String>(opcao);
		JOptionPane.showConfirmDialog(null, menu, "Selecione uma opção", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}

	public static String solicitaModelo(String modelo, int ordem) {
		if (ordem == 0) {
			return JOptionPane.showInputDialog("Informe o modelo do carro");
		} else {
			return JOptionPane.showInputDialog("Informe o " + ordem + " modelo do carro");
		}
	}

	public static String solicitaCor() {
		return JOptionPane.showInputDialog(null, "Informe a cor do modelo");
	}

	public static String solicitaVendaModelo() {
		return JOptionPane.showInputDialog("Informe o modelo do carro que você deseja vender");
	}

	public static String solicitaVendaCor() {
		return JOptionPane.showInputDialog("Informe a cor do modelo que você deseja vender");
	}

	public static int solicitaQtDeCarros() {
		return Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de carros que você deseja fabricar"));
	}

	public static void exibeGeraInfoCarro(String informacoes) {
		JOptionPane.showMessageDialog(null, informacoes, "Informações do carro", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void exibeMsgErro() {
		JOptionPane.showMessageDialog(null, "Informe números positivos");
	}

	public static void exibeErroFabrica() {
		JOptionPane.showMessageDialog(null, "Fabrique o carro primeiro antes de acessar esta opção.");
	}

}
