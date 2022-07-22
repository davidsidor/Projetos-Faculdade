package Controle;

import javax.swing.JOptionPane;

import Modelo.Operadores;
import Modelo.*;
import visualizacao.EntradaSaida;

public class Controladora {

	public void exibeMenu() {
		int encerrar = 0;
		double resultado = 0;
		Operadores oper = null;

		do {

			double num1 = EntradaSaida.solicitaNumero("1�");

			while (num1 < 0) {
				JOptionPane.showMessageDialog(null, "Informe um n�mero positivo");
				num1 = EntradaSaida.solicitaNumero("1�");
			}

			double num2 = EntradaSaida.solicitaNumero("2�");

			while (num2 < 0) {
				JOptionPane.showMessageDialog(null, "Informe um n�mero positivo");
				num2 = EntradaSaida.solicitaNumero("2�");
			}

			int operacao = EntradaSaida.solicitaOperacao();

			switch (operacao) {
			case 0:
				oper = new Soma();
				break;
			case 1:
				oper = new Subtracao();
				break;
			case 2:
				while (num2 == 0) {
					num2 = EntradaSaida.solicitaNumero("2�");
				}
				oper = new Divisao();
				break;
			case 3:
				oper = new Multiplicacao();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opera��o inv�lida! A calculadora est� encerrada");
				System.exit(0);
			}
			oper.setNum1(num1);
			oper.setNum2(num2);
			resultado = oper.calcula();
			EntradaSaida.mostrarResultado(resultado, operacao);
			encerrar = EntradaSaida.encerrarCalculadora();

		} while (encerrar == 1);
	}
}
