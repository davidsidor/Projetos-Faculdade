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
			num = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "� valor: "));
			// Verificando os n�meros pares 
			if (num % 2 == 0) {
				quantidadePar++;
				somaPar = somaPar + num;
			// Verificando os numeros impars 
			} else {
				quantidadeImpar++;
				somaImpar = somaImpar + num;
			}
		}
		// Informando a quantidade total de n�meros pares 
		JOptionPane.showMessageDialog(null, quantidadePar, "A quantidade de n�meros pares � de: ", JOptionPane.INFORMATION_MESSAGE);
		// A soma total de n�meros pares 
		JOptionPane.showMessageDialog(null, somaPar, "A soma dos n�meros pares � de: ", JOptionPane.INFORMATION_MESSAGE);
		// Informando a quantidade total de n�meros impars
		JOptionPane.showMessageDialog(null, quantidadeImpar, "A quantidade de n�meros impars � de: ", JOptionPane.INFORMATION_MESSAGE);
		// A soma total de n�meros impars
		JOptionPane.showMessageDialog(null, somaImpar, "A soma dos n�meros impars � de: ", JOptionPane.INFORMATION_MESSAGE);
	}
}
