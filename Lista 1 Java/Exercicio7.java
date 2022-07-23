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
		// Fazendo com que o vetor receba números aleatórios
		for (i = 0; i < 10; i++) {
			Random aleatorio = new Random();
			int numero = aleatorio.nextInt(10);
			vet[i] = numero;
		}
		// Informando o valor
		valor = Integer.parseInt(JOptionPane.showInputDialog("informe um valor: "));
		// Verificando em qual posição o número informado pelo usuario está
		for (i = 0; i < 10; i++) {
			if (valor == vet[i]) {
				verificador = true;
				JOptionPane.showMessageDialog(null, i, "O valor está na posição de número: ", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		// Caso númeor não seja encontrado 
		if (verificador == false) {
			JOptionPane.showMessageDialog(null, "O número digitado não foi encontrado");
		}
	}
}
