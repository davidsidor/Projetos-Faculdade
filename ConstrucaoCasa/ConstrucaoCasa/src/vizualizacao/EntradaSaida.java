package vizualizacao;

import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import modelo.Aberturas;

public class EntradaSaida {

	public static void verificaErro() {
		JOptionPane.showMessageDialog(null, "Informe números positivos");
	}

	public static int construirCasa() {
		String[] construir = { "Construir casa", "Sair do programa" };
		JComboBox<String> menu = new JComboBox<String>(construir);
		JOptionPane.showConfirmDialog(menu, menu, "Selecione a opção desejada", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}

	public static int solicitaOpcao() {
		String[] opcoes = { "Movimentar portas ou janelas", "Ver informações da casa", "Sair do programa" };
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}

	public static void exibeMsgEncerraPrograma() {
		JOptionPane.showMessageDialog(null, "O programa será encerrado!");
	}

	public static String solicitaDescricao(String descricao, int ordem) {
		if (ordem == 0) {
			return JOptionPane.showInputDialog("Informe a descrição da " + descricao.toLowerCase());
		} else {
			return JOptionPane.showInputDialog("Informe a descrição da " + ordem + " " + descricao.toLowerCase());
		}
	}

	public static String solicitaCor() {
		return JOptionPane.showInputDialog("Informe a cor da casa");
	}

	public static int solicitaQtdeAberturas(String abertura) {
		return Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de " + abertura.toLowerCase()));
	}

	public static int solicitaEstado(String tipoAbertura) {
		String[] opcoes = { "Fechada", "Aberta" };
		return JOptionPane.showOptionDialog(null, "Informe o estado da " + tipoAbertura.toLowerCase(), "Estado ",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[1]);
	}

	public static String solicitaTipoAbertura() {
		String[] opcoes = { "Porta", "Janela" };

		int tipoAbertura = JOptionPane.showOptionDialog(null, "Informe qual o tipo de abertura deseja mover",
				"Mover abertura", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[1]);

		if (tipoAbertura == 0) {
			return "Porta";
		} else {
			return "Janela";
		}

	}

	public static int solicitaAberturaMover(ArrayList<Aberturas> listaDeAberturas) {
		String tipoAbertura = listaDeAberturas.get(0).getClass().getName();
		tipoAbertura = tipoAbertura.replaceAll("modelo.", "");
		int qtdeAbertura = listaDeAberturas.size();
		String[] descricoesAberturas = new String[qtdeAbertura];

		for (int i = 0; i < qtdeAbertura; i++) {
			descricoesAberturas[i] = listaDeAberturas.get(i).getDescricao();
		}

		String msg = "Escolha a " + tipoAbertura.toLowerCase() + " a ser movimentada";
		JComboBox exibicaoAberturas = new JComboBox(descricoesAberturas);
		int confirmacao = JOptionPane.showConfirmDialog(null, exibicaoAberturas, msg, JOptionPane.OK_CANCEL_OPTION);

		if (confirmacao == 0) {
			return exibicaoAberturas.getSelectedIndex();
		} else {
			return -1;
		}
	}

	public static void exibeMsgAbertura() {
		JOptionPane.showMessageDialog(null, "Nenhuma abertura sera movimentada");
	}

	public static void exibeGeraInfoCasa(String informacoes) {
		JOptionPane.showMessageDialog(null, informacoes, "Informações da casa", JOptionPane.INFORMATION_MESSAGE);
	}

}
