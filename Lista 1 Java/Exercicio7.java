package lista1;

import java.util.Random;

import javax.swing.JOptionPane;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Criando o vetor e a contadora
		int[] vet = new int[10];
		int i = 0;
		boolean verificador = false;
		int valor = 0;
		// Fazendo com que o vetor receba n�meros aleat�rios
		for (i = 0; i < 10; i++) {
			Random aleatorio = new Random();
			int numero = aleatorio.nextInt(10);
			vet[i] = numero;
		}
		// Informando o valor
		valor = Integer.parseInt(JOptionPane.showInputDialog("informe um valor: "));
		// Verificando em qual posi��o o n�mero informado pelo usuario est�
		for (i = 0; i < 10; i++) {
			if (valor == vet[i]) {
				verificador = true;
				JOptionPane.showMessageDialog(null, i, "O valor est� na posi��o de n�mero: ", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		// Caso n�meor n�o seja encontrado 
		if (verificador == false) {
			JOptionPane.showMessageDialog(null, "O n�mero digitado n�o foi encontrado");
		}
	}
}
