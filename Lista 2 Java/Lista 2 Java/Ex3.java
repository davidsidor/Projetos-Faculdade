package lista2;

import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Criando as vari�veis
		int num1 = 0;
		int num2 = 0;
		int ope = 0;
		// Informando p n�mero inteiro
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero inteiro"));
		// Verificando se n�o tem n�meros negativos
		while (num1 < 0) {
			JOptionPane.showMessageDialog(null,"Voc� s� pode informar n�meros positivos");
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero inteiro"));
		}
		// Menu de escolha 
		ope = Integer.parseInt(JOptionPane.showInputDialog("Escolha"
				+ "\n 1 - Verificar se o n�mero � m�ltiplo de algum outro n�mero" 
				+ "\n 2 - Verificar se o n�mero � par" 
				+ "\n 3 - Verificar se o n�mero est� entre 0 e 1000"
				+ "\n 4 - Sair"));
		switch (ope) {
		// Verificando se o n�mero � multiplo de outro n�mero 
		case 1:
		    num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro n�mero inteiro"));
		    while (num2 < 0) {
				JOptionPane.showMessageDialog(null,"Voc� s� pode informar n�meros positivos");
				num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro n�mero inteiro"));
		    }if (num1 % num2 == 0) {
		    	JOptionPane.showMessageDialog(null,"Sim, o n�mero" +num1+" � multiplo de"+num2);
		    }else {
		    	JOptionPane.showMessageDialog(null,"N�o, o n�mero" +num1+" n�o � multiplo de"+num2);
		    }
		break;
		// Verificando se o n�mero � par
		case 2:
			if (num1 % 2 == 0) {
				JOptionPane.showMessageDialog(null,"O valor � par");
			}else {
				JOptionPane.showMessageDialog(null,"O valor n�o � par");
			}
			break;
			// Verificando se o n�mero est� engre 0 e 1000
		case 3:
			if (num1 >= 0 && num1 <= 1000) {
				JOptionPane.showMessageDialog(null,"O valor esta sim entre 0 e 1000");
			}else {
				JOptionPane.showMessageDialog(null,"O valor n�o esta entre 0 e 1000");
			}
			// Encerrando o programa
		case 4:
			System.exit(0);
			break;
		}
	}
}
