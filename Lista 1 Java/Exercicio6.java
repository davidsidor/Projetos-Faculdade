package lista1;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Criando as vari�veis 
		String res="";
		double resultadoFinal=0;
		double valor1=0;
		double valor2=0;
		int ope=0;
		// Lendo o primeiro valor 
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("informe o primeiro valor: "));
		// Estrutura de repeti��o 
		do {
			// Informando a opera��o desejada 
			ope = Integer.parseInt(JOptionPane.showInputDialog("Voc� devera escolher a opera��o desejada"
					+ "\n 1- Para adi��o "
					+ "\n 2- Para subtra��o "
					+ "\n 3- Para multiplica��o "
					+ "\n 4- Divis�o"));
			// Lendo o segundo valor
			valor2 = Integer.parseInt(JOptionPane.showInputDialog("informe o segundo valor: "));
			// Crinado um escolha 
			switch (ope) {
			// Adi��o
			case 1:
				resultadoFinal = valor1 + valor2;
				break;
				// Subtra��o
			case 2:
				resultadoFinal = valor1-valor2;
				break;
				// Multiplica��o
			case 3:
				resultadoFinal = valor1*valor2;
				break;
				// Divis�o
			case 4:
				resultadoFinal = valor1/valor2;
				break;
				// Outro caso 
				default:
					JOptionPane.showMessageDialog(null, "Opera��o esta incorreta");	
					break;
			}
			valor1 = resultadoFinal;
			// Verificando se o usuario ainda quer continuar calculando 
			res = JOptionPane.showInputDialog("Deseja continuar calculando? " 
			+ "\n Digite N para n�o ou outro caractere para continuar calculando:");
		}while(!res.equalsIgnoreCase("N"));
		// Mostrando na tela o resultado final da conta 
		JOptionPane.showMessageDialog(null, resultadoFinal, "O resultado final �: ", JOptionPane.INFORMATION_MESSAGE);
			}
	}
