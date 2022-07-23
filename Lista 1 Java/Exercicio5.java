package lista1;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Criando as variaveis 
		int num = 0;
		int quantidadePar = 0;
		int somaPar = 0;
		int quantidadeImpar = 0;
		int somaImpar = 0;
		// Informando os valores 
		for (int i = 0; i < 10; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "º valor: "));
			// Verificando os números pares 
			if (num % 2 == 0) {
				quantidadePar++;
				somaPar = somaPar + num;
			// Verificando os numeros impars 
			} else {
				quantidadeImpar++;
				somaImpar = somaImpar + num;
			}
		}
		// Informando a quantidade total de números pares 
		JOptionPane.showMessageDialog(null, quantidadePar, "A quantidade de números pares é de: ", JOptionPane.INFORMATION_MESSAGE);
		// A soma total de números pares 
		JOptionPane.showMessageDialog(null, somaPar, "A soma dos números pares é de: ", JOptionPane.INFORMATION_MESSAGE);
		// Informando a quantidade total de números impars
		JOptionPane.showMessageDialog(null, quantidadeImpar, "A quantidade de números impars é de: ", JOptionPane.INFORMATION_MESSAGE);
		// A soma total de números impars
		JOptionPane.showMessageDialog(null, somaImpar, "A soma dos números impars é de: ", JOptionPane.INFORMATION_MESSAGE);
	}
}
