package lista1;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Armazenando os valores
		int num1 = 0;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
		int num2 = 0;
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor: "));
		int num3 = 0;
		num3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro valor: "));
		// Verificando se n�o tem n�meros repetidos
		if ((num1 == num2 || num1 == num2 || num2 == num3)) {
			JOptionPane.showMessageDialog(null, "Existem n�meros reptidos, tente novamente");
		// Verificando qual � o menor n�mero	
		} else if ((num1 < num2 && num1 < num3)) {
			JOptionPane.showMessageDialog(null, num1, "O n�mero menor �: ", JOptionPane.INFORMATION_MESSAGE);
		} else if ((num2 < num1 && num2 < num3)) {
			JOptionPane.showMessageDialog(null, num2, "O n�mero menor �: ", JOptionPane.INFORMATION_MESSAGE);
		} else if ((num3 < num1 && num3 < num2)) {
			JOptionPane.showMessageDialog(null, num3, "O n�mero menor �: ", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}


