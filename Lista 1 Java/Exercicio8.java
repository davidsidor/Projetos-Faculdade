package lista1;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Criando as variáveis
		double[][] matriz = new double[6][4];
		double somaSemestre = 0;
		double[] somaMes = new double[6];
		DecimalFormat d=new DecimalFormat("0.00"); 
		int linha, coluna = 0;
		// Informando o valor de vendas da semana 
		for (linha = 0; linha < 6; linha++) {
			for (coluna = 0; coluna < 4; coluna++) {
				matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da semana " + (coluna + 1), "Mes " + (linha + 1), JOptionPane.INFORMATION_MESSAGE));
				while (matriz[linha][coluna] < 0) {
					JOptionPane.showMessageDialog(null, "Voce só pode informar numeros de positivos");
				matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da semana " + (coluna + 1), "Mes " + (linha + 1), JOptionPane.INFORMATION_MESSAGE));
				}
				// Fazendo a soma do semestre 
				somaSemestre = somaSemestre + matriz[linha][coluna];
			}
		}
		// Fazendo o total de vendas de cada mês 
		for (linha = 0; linha < 6; linha++) {
			for (coluna = 0; coluna < 4; coluna++) {
				somaMes[linha] = somaMes[linha] + matriz[linha][coluna];
			}
		}
		// Informando o total de vendas do semestre 
		JOptionPane.showMessageDialog(null, d.format(somaSemestre), "Total de vendas do semestre é de: ", JOptionPane.INFORMATION_MESSAGE);
		// Informando o total de vendas de cada mês
		for (int i = 0; i < 6; i++) {
		JOptionPane.showMessageDialog(null, d.format(somaMes[i]), "Total de vendas é: " + (i + 1), JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
