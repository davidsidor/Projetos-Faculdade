package lista2;

import javax.swing.JOptionPane;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Criando as váriaveis
		double latao = 0;
		double cobre = 0;
		double zinco = 0;
		// Informando a quantidade de latão em KG
		latao = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de latão em KG"));
		while (latao < 0) {
			JOptionPane.showMessageDialog(null, "Informe um número positivo");
			latao = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de latão em KG"));
		}
		cobre = latao * 70 / 100;
		zinco = latao * 30 / 100;
		// Informando a quantidade de cobre e de zinco necessária
		JOptionPane.showMessageDialog(null, cobre, "Quantidade de cobre necessária em KG: ", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, zinco, "Quantidade de zinco necessária em KG: ", JOptionPane.INFORMATION_MESSAGE);
	}
}
