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

			double num1 = EntradaSaida.solicitaNumero("1º");

			while (num1 < 0) {
				JOptionPane.showMessageDialog(null, "Informe um número positivo");
				num1 = EntradaSaida.solicitaNumero("1º");
			}

			double num2 = EntradaSaida.solicitaNumero("2º");

			while (num2 < 0) {
				JOptionPane.showMessageDialog(null, "Informe um número positivo");
				num2 = EntradaSaida.solicitaNumero("2º");
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
					num2 = EntradaSaida.solicitaNumero("2º");
				}
				oper = new Divisao();
				break;
			case 3:
				oper = new Multiplicacao();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Operação inválida! A calculadora está encerrada");
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
