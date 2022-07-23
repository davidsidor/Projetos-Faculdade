package lista1;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maiorIdade;
		int idade;
		// Maioridade civil do pais
		maiorIdade = Integer.parseInt(JOptionPane.showInputDialog("Qual é a maioridade civil do seu país?"));
        // Idade do Usuario
		idade = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem?"));
		// Analisando se o usuario não digitou numeros negativos
		if (idade < 0 || maiorIdade < 0) {
			JOptionPane.showMessageDialog(null, "Você só pode informar númers positivos");
			// Analisando se o usuario é maior ou menor de idade
		}else if (idade >= maiorIdade)
			JOptionPane.showMessageDialog(null, "Você é maior de idade");
		else
			JOptionPane.showMessageDialog(null, "Você é menor de idade");
	}
}
