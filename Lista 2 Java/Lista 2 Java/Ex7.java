package lista2;

import javax.swing.JOptionPane;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Criando as variáveis 
		double[][] matriz = new double[4][3];
		double maiorNota = 0;
		int l, c = 0;
		int opcao = 0;
		int resp = 0;
		double resultado = 0;
		double somaMedia = 0;
		int bimestre = 0;
		int disciplina = 0;
		double notasBimestre = 0;
		//Menu
		JOptionPane.showMessageDialog(null, " Materias" 
                + "\n Matematica = 1" 
				+ "\n Fisica = 2"
				+ "\n Quimica = 3");
		// Recebendo as notas do usuario
		for (l = 0; l < 4; l++) {
			for (c = 0; c < 3; c++) {
				matriz[l][c] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua nota " + (l + 1), "materia " + (c + 1), JOptionPane.INFORMATION_MESSAGE));
				while (matriz[l][c] < 0 || matriz[l][c] > 10) {
					JOptionPane.showMessageDialog(null, "Informe uma nota de 0 a 10");
					matriz[l][c] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua nota " + (l + 1), "materia " + (c + 1), JOptionPane.INFORMATION_MESSAGE));
				}
			}
		}
		// Fazendo o menu
		opcao = Integer.parseInt(JOptionPane.showInputDialog("O que você deseja ver?"
				+ "\n 1 - Todas as notas de todas as disciplinas" 
				+ "\n 2 - Qual a maior nota e em qual disciplina foi"
				+ "\n 3 - A média das notas de alguma disciplina (solicitar qual)"
				+ "\n 4 - As notas de um dos bimestres (solicitar qual)" 
				+ "\n 5 - Encerrar o programa"));
		// Escolha
		switch (opcao) {
		// Informando todas as notas para o usuario
		case 1:
			String materias=" mat fis quim \n ";
			for (l = 0; l < 4; l++) {
				for (c = 0; c < 3; c++) {
					materias += " ";
					materias += matriz[l][c] + " ";
				}
				materias += "\n ";
			}
			JOptionPane.showMessageDialog(null, materias, "Suas notas", JOptionPane.INFORMATION_MESSAGE);
			break;
			// Informando qual foi a maior nota e a materia
		case 2:
			maiorNota = matriz[0][0];
			for (l = 0; l < 4; l++) {
				for (c = 0; c < 3; c++) {
					if (matriz[l][c] > maiorNota) {
						maiorNota = matriz[l][c];
						disciplina = c;
					}
				}
			}
				if (disciplina== 0) {
					JOptionPane.showMessageDialog(null, maiorNota, "Matematica", JOptionPane.INFORMATION_MESSAGE);
				}else if (disciplina== 1) {
					JOptionPane.showMessageDialog(null, maiorNota, "fisica: ", JOptionPane.INFORMATION_MESSAGE);
				}else if (disciplina == 2) {
					JOptionPane.showMessageDialog(null, maiorNota, "quimica: ", JOptionPane.INFORMATION_MESSAGE);
				}
			break;
			// Mostrando a media das notas
		case 3:
			resp = Integer.parseInt(JOptionPane.showInputDialog("Qual media você deseja ver?" 
		            + "\n 1 - Para ver a media de matematica"
				    + "\n 2 - Para ver a media de fisica" 
					+ "\n 3 - Para ver a media de quimica"));
			// Informando a media de matematica
			resp = resp-1;
			for (l=0; l<4; l++) {
				somaMedia = matriz[l][resp] + somaMedia;
				resultado = somaMedia / 4;
			}
			if (resp == 1) {
				JOptionPane.showMessageDialog(null, resultado, "A media de matematica é de: ", JOptionPane.INFORMATION_MESSAGE);
				// Informando a media de fisica 
			} else if (resp == 2) {
				JOptionPane.showMessageDialog(null, resultado, "A media de fisica é de: ", JOptionPane.INFORMATION_MESSAGE);
				// Informando a media de quimica
			} else if (resp == 3) {
				JOptionPane.showMessageDialog(null, resultado, "A media de quimica é de: ", JOptionPane.INFORMATION_MESSAGE);
			}
			break;
			// Informando as notas de um dos bimestres 
		case 4:
			bimestre = Integer.parseInt(JOptionPane.showInputDialog("Informe o bimestre"));
			while (bimestre < 1 || bimestre > 4) {
				JOptionPane.showMessageDialog(null, "Informe um número de 1 a 4");
				bimestre = Integer.parseInt(JOptionPane.showInputDialog("Informe o bimestre"));
			}
			// Informando as notas do bimestre 1
			//bimestre=bimestre-1;
			for (l = 0; l < 4; l++) {
				for (c = 0; c < 3; c++) {
					notasBimestre = matriz[l][c];
					bimestre = l;
				}if (bimestre == 1) {
					JOptionPane.showMessageDialog(null, notasBimestre, "As notas do bimestre 1 são: ", JOptionPane.INFORMATION_MESSAGE);
				} else if (bimestre == 2) {
					JOptionPane.showMessageDialog(null, notasBimestre, "As notas do bimestre 2 são: ", JOptionPane.INFORMATION_MESSAGE);	
				} else if (bimestre == 3) {
					JOptionPane.showMessageDialog(null, notasBimestre, "As notas do bimestre 3 são: ", JOptionPane.INFORMATION_MESSAGE);
				}else if (bimestre == 4) {
					JOptionPane.showMessageDialog(null, notasBimestre, "As notas do bimestre 4 são: ", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			break;
			// Encerrando o programa
		case 5:
			System.exit(0);
			break;
		}
	}

}
