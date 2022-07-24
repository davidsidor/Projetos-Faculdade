package lista2;

import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Criando as variáveis
		int tamanho = 0;
		int valorNegativo = 0;
		// Pedindo ao usuario informar o tamanho do vetor
		tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor"));
		// Verificando se não tem números negativos
		while (tamanho < 0) {
			JOptionPane.showMessageDialog(null,"Você só pode informar números positivos");
			tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor"));
		}
		// Criando o vetor
		double[] valores = new double[tamanho];
		// Informando os valores
		for (int i = 0; i < tamanho; i++) {
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("informe o " + (i + 1) + "º valor: "));
			// Verificando se o valor é menor que 0
			if (valores[i] < 0) {
				valorNegativo++;
			}
		}
		// Informando a quantidade de valores negativos
		JOptionPane.showMessageDialog(null, valorNegativo, "A Quantidade de valores negativos é de: ", JOptionPane.INFORMATION_MESSAGE);
	}
}
