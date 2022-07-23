package lista1;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int horas = 0;
		int minutos = 0;
		int segundos = 0;
		int totalSegundos = 0;
		// Recebendo a quantidade em horas
		horas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de horas: "));
		// Recebendo a quantidade em minutos
		minutos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade em minutos: "));
		// Recebendo a quantidade em segundos
		segundos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade em segundos: "));
		// Verificando se não tem numeros negativos
		if (horas < 0 || minutos < 0 || (segundos < 0)){
			JOptionPane.showMessageDialog(null, "Você só pode informar números positivos");	
		}else {
		// Criando a variavel que vai armazena o total de segundos
		totalSegundos = horas * 3600 + minutos * 60 + segundos;
		// Mostrando a quantidade total de segundos
		JOptionPane.showMessageDialog(null, totalSegundos, "Segundos", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
