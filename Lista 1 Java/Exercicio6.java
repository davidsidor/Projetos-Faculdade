package lista1;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Criando as variáveis 
		String res="";
		double resultadoFinal=0;
		double valor1=0;
		double valor2=0;
		int ope=0;
		// Lendo o primeiro valor 
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("informe o primeiro valor: "));
		// Estrutura de repetição 
		do {
			// Informando a operação desejada 
			ope = Integer.parseInt(JOptionPane.showInputDialog("Você devera escolher a operação desejada"
					+ "\n 1- Para adição "
					+ "\n 2- Para subtração "
					+ "\n 3- Para multiplicação "
					+ "\n 4- Divisão"));
			// Lendo o segundo valor
			valor2 = Integer.parseInt(JOptionPane.showInputDialog("informe o segundo valor: "));
			// Crinado um escolha 
			switch (ope) {
			// Adição
			case 1:
				resultadoFinal = valor1 + valor2;
				break;
				// Subtração
			case 2:
				resultadoFinal = valor1-valor2;
				break;
				// Multiplicação
			case 3:
				resultadoFinal = valor1*valor2;
				break;
				// Divisão
			case 4:
				resultadoFinal = valor1/valor2;
				break;
				// Outro caso 
				default:
					JOptionPane.showMessageDialog(null, "Operação esta incorreta");	
					break;
			}
			valor1 = resultadoFinal;
			// Verificando se o usuario ainda quer continuar calculando 
			res = JOptionPane.showInputDialog("Deseja continuar calculando? " 
			+ "\n Digite N para não ou outro caractere para continuar calculando:");
		}while(!res.equalsIgnoreCase("N"));
		// Mostrando na tela o resultado final da conta 
		JOptionPane.showMessageDialog(null, resultadoFinal, "O resultado final é: ", JOptionPane.INFORMATION_MESSAGE);
			}
	}
