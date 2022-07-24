package lista2;

import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Criando as variáveis
		int num1 = 0;
		int num2 = 0;
		int ope = 0;
		// Informando p número inteiro
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro"));
		// Verificando se não tem números negativos
		while (num1 < 0) {
			JOptionPane.showMessageDialog(null,"Você só pode informar números positivos");
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro"));
		}
		// Menu de escolha 
		ope = Integer.parseInt(JOptionPane.showInputDialog("Escolha"
				+ "\n 1 - Verificar se o número é múltiplo de algum outro número" 
				+ "\n 2 - Verificar se o número é par" 
				+ "\n 3 - Verificar se o número está entre 0 e 1000"
				+ "\n 4 - Sair"));
		switch (ope) {
		// Verificando se o número é multiplo de outro número 
		case 1:
		    num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro número inteiro"));
		    while (num2 < 0) {
				JOptionPane.showMessageDialog(null,"Você só pode informar números positivos");
				num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro número inteiro"));
		    }if (num1 % num2 == 0) {
		    	JOptionPane.showMessageDialog(null,"Sim, o número" +num1+" é multiplo de"+num2);
		    }else {
		    	JOptionPane.showMessageDialog(null,"Não, o número" +num1+" não é multiplo de"+num2);
		    }
		break;
		// Verificando se o número é par
		case 2:
			if (num1 % 2 == 0) {
				JOptionPane.showMessageDialog(null,"O valor é par");
			}else {
				JOptionPane.showMessageDialog(null,"O valor não é par");
			}
			break;
			// Verificando se o número está engre 0 e 1000
		case 3:
			if (num1 >= 0 && num1 <= 1000) {
				JOptionPane.showMessageDialog(null,"O valor esta sim entre 0 e 1000");
			}else {
				JOptionPane.showMessageDialog(null,"O valor não esta entre 0 e 1000");
			}
			// Encerrando o programa
		case 4:
			System.exit(0);
			break;
		}
	}
}
