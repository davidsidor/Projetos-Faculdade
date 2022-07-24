package lista2;

import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Criando as variáveis
		double[] nota = new double[4];
		double resultado = 0;
		double resultadoFinal = 0;
		// Recebendo as 4 notas do usuario
		for (int i = 0; i < 4; i++) {
			nota[i] = Double.parseDouble(JOptionPane.showInputDialog("informe a " + (i + 1) + "º nota: "));
			// Verificando se não tem numeros menores que 0 ou maiores que 10 
			while ((nota[i] < 0 || nota[i] > 10)) {
				JOptionPane.showMessageDialog(null,"Informe uma nota de 0 até 10");
				nota[i] = Double.parseDouble(JOptionPane.showInputDialog("informe a " + (i + 1) + "º nota: "));
			}
			// Fazendo a media da nota
			resultado = resultado + nota[i];
			resultadoFinal = resultado / 4;
		}
		// Informando os conceitos na tela do usuario
		JOptionPane.showMessageDialog(null, "Instruções" 
		                + "\n 9.0 ou maior = Conceito A" 
						+ "\n Entre 8.0 e 8.9 = Conceito B"
						+ "\n Entre 7.0 e 7.9 = Conceito C" 
						+ "\n menor que 7.0 = Conceito D");
		// Verificando se o usuario recebeu o conceito A
		if (resultadoFinal >= 9) {
			JOptionPane.showMessageDialog(null, " Você recebeu: Conceito A");
			// Verificando se o usuario recebeu o conceito B
		} else if (resultadoFinal >= 8 && resultadoFinal < 9) {
			JOptionPane.showMessageDialog(null, " Você recebeu: Conceito B");
			// Verificando se o usuario recebeu o conceito C
		} else if (resultadoFinal >= 7 && resultadoFinal < 8) {
			JOptionPane.showMessageDialog(null, " Você recebeu: Conceito C");
			// Verificando se o usuario recebeu o conceito D
		} else if (resultadoFinal < 7) {
			JOptionPane.showMessageDialog(null, " Você recebeu: Conceito D");
		}
	}
}
