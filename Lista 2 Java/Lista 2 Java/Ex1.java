package lista2;

import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Criando as vari�veis
		int tamanho = 0;
		int valorNegativo = 0;
		// Pedindo ao usuario informar o tamanho do vetor
		tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor"));
		// Verificando se n�o tem n�meros negativos
		while (tamanho < 0) {
			JOptionPane.showMessageDialog(null,"Voc� s� pode informar n�meros positivos");
			tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor"));
		}
		// Criando o vetor
		double[] valores = new double[tamanho];
		// Informando os valores
		for (int i = 0; i < tamanho; i++) {
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("informe o " + (i + 1) + "� valor: "));
			// Verificando se o valor � menor que 0
			if (valores[i] < 0) {
				valorNegativo++;
			}
		}
		// Informando a quantidade de valores negativos
		JOptionPane.showMessageDialog(null, valorNegativo, "A Quantidade de valores negativos � de: ", JOptionPane.INFORMATION_MESSAGE);
	}
}
