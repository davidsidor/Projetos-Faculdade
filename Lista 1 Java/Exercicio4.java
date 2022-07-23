package lista1;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Armazenando os valores
		int num1 = 0;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
		int num2 = 0;
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor: "));
		// Criando a variavel pra receber a soma dos números pares
		int somaPar = 0;
		// Fazendo a soma dos valores pares 
		if (num2 > num1) {
			for (int i = num1; i <= num2; i++) {
				if (i % 2 == 0) {
					//somaPar++;
					somaPar = somaPar + i;
				}
			}
		} else if (num1 > num2) {
			for (int i = num1; i <= num2; i++) {
				if (i % 2 == 0) {
					//somaPar++;
					somaPar = somaPar + i;
				}
			}
		}
		// Mostrando a soma dos valores pares 
		JOptionPane.showMessageDialog(null, somaPar, "O valor total da soma é de: ", JOptionPane.INFORMATION_MESSAGE);
	}
}