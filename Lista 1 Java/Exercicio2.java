package lista1;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maiorIdade;
		int idade;
		// Maioridade civil do pais
		maiorIdade = Integer.parseInt(JOptionPane.showInputDialog("Qual � a maioridade civil do seu pa�s?"));
        // Idade do Usuario
		idade = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos voc� tem?"));
		// Analisando se o usuario n�o digitou numeros negativos
		if (idade < 0 || maiorIdade < 0) {
			JOptionPane.showMessageDialog(null, "Voc� s� pode informar n�mers positivos");
			// Analisando se o usuario � maior ou menor de idade
		}else if (idade >= maiorIdade)
			JOptionPane.showMessageDialog(null, "Voc� � maior de idade");
		else
			JOptionPane.showMessageDialog(null, "Voc� � menor de idade");
	}
}
