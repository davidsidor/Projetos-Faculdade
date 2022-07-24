package lista3;

import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Criando as vari�veis 
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		int media = 0;
		// Informando a primeira nota 
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua primeira nota"));
		while (nota1 < 0 || nota1 > 10) {
			mostrarErroNota();
			nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua primeira nota"));
		}
		// Informando a segunda nota 
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua segunda nota"));
		while (nota2 < 0 || nota2 > 10) {
			mostrarErroNota();
			nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua segunda nota"));
		}
		// Informando a segunda nota 
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua terceira nota"));
		while (nota3 < 0 || nota3 > 10) {
			mostrarErroNota();
			nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua terceira nota"));
		}
		// Informando as op��es para o usuario 
		media = Integer.parseInt(JOptionPane.showInputDialog("Escolha" 
		                    + "\n 1 - Calcular m�dia aritm�tica." 
		                    + "\n 2 - Carcular m�dia ponderada."));
		while (media < 1 || media > 2) {
			mostrarErroMedia();
			media = Integer.parseInt(JOptionPane.showInputDialog("Escolha" 
			                + "\n 1 - Calcular m�dia aritm�tica." 
							+ "\n 2 - Carcular m�dia ponderada."));
		}
		// Informando a media aritmetica
		if (media == 1) {
			double mediaNota = calcularMediaAritmetica(nota1, nota2, nota3);
			verificaMedia(mediaNota);
			// Informando a media ponderada
		} else if (media == 2) {
			double mediaNota = calcularMediaPonderada(nota1, nota2, nota3);
			verificaMedia(mediaNota);
		}
	}
	// M�todo para calcular a m�dia artmetica
	public static double calcularMediaAritmetica(double nota1, double nota2, double nota3) {
		// Fazendo a conta 
		double somaNotaAritmetica = nota1 + nota2 + nota3;
		double mediaNota = somaNotaAritmetica / 3;
		return mediaNota;
	}
	// M�todo para calcular a m�dia ponderada 
	public static double calcularMediaPonderada(double nota1, double nota2, double nota3) {
		// Informando os pesos da m�dia ponderada
		int peso1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro peso."));
		int peso2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo peso."));
		int peso3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o terceiro peso."));
		// Fazendo a conta 
		double somaPeso = peso1 + peso2 + peso3;
		double somaNotaPonderada = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);
		double mediaNota = somaNotaPonderada / somaPeso;
		return mediaNota;
	}
	// M�todo para verificar se o usuario foi aprovado ou reprovado
	public static void verificaMedia(double mediaNota) {
		if (mediaNota >= 7) {
			JOptionPane.showMessageDialog(null, "Voc� est� aprovado: " + mediaNota);
		} else {
			JOptionPane.showMessageDialog(null, "Voc� n�o est� aprovado: " + mediaNota);
		}
	}
	// M�todo para informar uma mensagem de erro na nota
	public static void mostrarErroNota() {
		JOptionPane.showMessageDialog(null, "Informe uma nota de 1 a 10");
	}
	// M�todo para informar uma mensagem de erro na m�dia
	public static void mostrarErroMedia() {
		JOptionPane.showMessageDialog(null, "Selecione a op��o 1 ou 2");
	}
}
