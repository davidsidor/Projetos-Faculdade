package lista2;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Criando as variáveis
		double[] mes = new double[12];
		double maiorVenda = 0;
		int maiorMes = 0;
		int menorMes = 0;
		double menorVenda = 0;
		double mediaVenda = 0;
		double somaVenda = 0;
		double somaPar = 0;
		double mediaPar = 0;
		double somaSemestre = 0;
		double mediaSemestre = 0;
		int i = 0;
		int cont = 0;
		DecimalFormat d = new DecimalFormat("0.00");
		// Perguntando as vendas dos meses ao usuario
		for (i = 0; i < 12; i++) {
			mes[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe a " + (i + 1) + "º venda: "));
			while (mes[i] < 0) {
				JOptionPane.showMessageDialog(null, "Informe um número positivo");
				mes[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe a " + (i + 1) + "º venda: "));
			}
			// Fazendo a media das vendas do ano todo
			somaVenda = somaVenda + mes[i];
		}
		mediaVenda = somaVenda / 12;
		// Fazendo a media de vendas dos meses pares
		for (i = 1; i < 12; i++) {
			if (mes[i] % 2 == 0) {
				somaPar = somaPar + mes[i];
			}
		}
		mediaPar = somaPar / 6;
		// Fazendo a media de vendas do segundo semestre
		somaSemestre = mes[5] + mes[6] + mes[7] + mes[8] + mes[9] + mes[10] + mes[11];
		mediaSemestre = somaSemestre / 6;
		//
		maiorVenda = mes[0];
		menorVenda = mes[0];
		// Verificando o maior vendas e em qual mês foi
		for (i = 0; i < 12; i++) {
			if (mes[i] > maiorVenda) {
				maiorVenda = mes[i];
				maiorMes = i;
			}
		}
		// Verificando a menor venda e em qual mês foi
		for (cont = 0; cont < 12; cont++) {
			if (mes[cont] < menorVenda) {
				menorVenda = mes[cont];
				menorMes = cont;
			}
		}
		// Informando a media das vendas 
		JOptionPane.showMessageDialog(null, d.format(mediaVenda), "A Quantidade media das vendas do ano é de: ", JOptionPane.INFORMATION_MESSAGE);
		// Informando a media de vendas do segundo semestre
	    JOptionPane.showMessageDialog(null, d.format(mediaSemestre), "A Quantidade media das vendas do segundo semestre é de: ", JOptionPane.INFORMATION_MESSAGE);
		// Informando a media de vendas dos meses pares
		JOptionPane.showMessageDialog(null, d.format(mediaPar), "A Quantidade media das vendas dos meses pares é de: ", JOptionPane.INFORMATION_MESSAGE);
		// Informando a mairo venda junto com o mês
		JOptionPane.showMessageDialog(null, "A maior venda é no mes: " + (maiorMes+1) + "\n Esse mes teve um total de: " + d.format(maiorVenda) + JOptionPane.INFORMATION_MESSAGE);
		// Informando a menor venda junto com o mês
		JOptionPane.showMessageDialog(null, "A menor venda é no mes: " + (menorMes+1) + "\n Esse mes teve um total de: " + d.format(menorVenda) + JOptionPane.INFORMATION_MESSAGE);
	}
}
