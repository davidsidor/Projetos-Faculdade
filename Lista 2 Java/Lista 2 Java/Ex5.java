package lista2;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Criando as variáveis
		int idade = 0;
		int fuma = 0;
		double salario = 0;
		int tempo = 0;
		String repetir = null;
		int somaIdade = 0;
		int mediaIdade = 0;
		double somaSalario = 0;
		double mediaSalario = 0;
		int fumantes = 0;
		int naofumantes = 0;
		int frequencia = 0;
		double resultado = 0;
		int i = 0;
		DecimalFormat d = new DecimalFormat("0.00");
		do {
			i=i+1;
			// Informando a idade do usuario
			idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
			while (idade < 0) {
				JOptionPane.showMessageDialog(null, "Informe um número positivo");
				idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
			}
			// Fazendo a media da idade
			somaIdade = somaIdade + idade;
			mediaIdade = somaIdade / i;
			// Perguntando se o usuario é fumando ou não
			fuma = Integer.parseInt(JOptionPane.showInputDialog("Você fuma? 1- SIM, 2- NÂO"));
			while (fuma < 1 || fuma > 2) {
				JOptionPane.showMessageDialog(null, "Você só pode informar o número 1 ou 2.");
			}
			// Verificando quantos usuarios são fumantes e quantos não são
			if (fuma == 1) {
				fumantes++;
			} else {
				naofumantes++;
			}
			// Informando o salario
			salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salario"));
			while (salario < 0) {
				JOptionPane.showMessageDialog(null, "Informe um número positivo");
				salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salario"));
			}
			// Fazendo a media do salario
			somaSalario = somaSalario + salario;
			mediaSalario = somaSalario / i;
			System.out.println(i);
			// Informando a quantidade de meses que o usuario frequenta o clube
			tempo = Integer.parseInt(JOptionPane.showInputDialog("Há quantos meses você frequanta o clube?"));
			while (tempo < 0) {
				JOptionPane.showMessageDialog(null, "Informe um número positivo");
				tempo = Integer.parseInt(JOptionPane.showInputDialog("Há quantos meses você frequanta o clube?"));
			}	
			if (tempo > 3) {
				// Fazendo a porcentagem de pessoas que frequentam o clube a há mais de 3 meses
				frequencia = frequencia+1;
				System.out.println(frequencia);
				resultado = frequencia * 100 / i;
				System.out.println(i);
			}
			// Verificando se tem mais algum usuario
			repetir = JOptionPane.showInputDialog("Caso não não tenha mais nenhum usuario digite encerrar, ou outro caractere para continuar");
		} while (!repetir.equals("encerrar"));
		// Informando a quantidade media de idade para o usuario
		JOptionPane.showMessageDialog(null, mediaIdade, "A Quantidade media de idade é de: ", JOptionPane.INFORMATION_MESSAGE);
		// Informando a quantidade media salarial para o usuario
		JOptionPane.showMessageDialog(null, d.format(mediaSalario), "A Quantidade media salarial é de: ", JOptionPane.INFORMATION_MESSAGE);
		// Informando a quantidade de fumantes
		JOptionPane.showMessageDialog(null, fumantes, "A Quantidade de fumantes é de: ", JOptionPane.INFORMATION_MESSAGE);
		// Informando a quantidade de não fumantes
		JOptionPane.showMessageDialog(null, naofumantes, "A Quantidade de  não fumantes é de: ", JOptionPane.INFORMATION_MESSAGE);
		// Informando a porcentagem pessoas frequantam o clube há mais de 3 meses
		JOptionPane.showMessageDialog(null, resultado, "A porcentagem de pessoas que frequentam o clube há mais de 03 meses é de: ", JOptionPane.INFORMATION_MESSAGE);
	}
}
