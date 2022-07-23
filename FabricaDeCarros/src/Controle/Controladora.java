package Controle;

import javax.swing.JOptionPane;

import Modelo.Carro;
import Modelo.Fabrica;
import Visualizacao.EntradaSaida;

public class Controladora {

	private Fabrica fabrica = new Fabrica();
	private Carro carro = null;
	int opcao;
	int qtCarros;

	public void exibeMenu() {

		do {

			opcao = EntradaSaida.solicitaOpcao();

			switch (opcao) {
			case 0:
				qtCarros = EntradaSaida.solicitaQtDeCarros();
				while (qtCarros <= 0) {
					EntradaSaida.exibeMsgErro();
					qtCarros = EntradaSaida.solicitaQtDeCarros();
				}

				for (int i = 0; i < qtCarros; i++) {
					this.carro = new Carro();
					carro.setModelo(EntradaSaida.solicitaModelo("modelo", i + 1));
					carro.setCor(EntradaSaida.solicitaCor());
					fabrica.fabricaCarros(carro);
				}

				for (Carro carro : fabrica.getCarrosFabricados()) {
					System.out.println("Modelo do carro: " + carro.getModelo());
					System.out.println("Cor do modelo: " + carro.getCor() + "\n");
				}

				break;

			case 1:
				if (fabrica.getCarrosFabricados().isEmpty() == true) {
					EntradaSaida.exibeErroFabrica();
				} else {
					String removerModelo = EntradaSaida.solicitaVendaModelo();
					String removerCor = EntradaSaida.solicitaVendaCor();

					Carro removeCarro = null;

					for (Carro carro : fabrica.getCarrosFabricados()) {

						if ((carro.getModelo().equals(removerModelo)) && (carro.getCor().equals(removerCor))) {
							removeCarro = carro;
						}
					}
					fabrica.venderCarro(removeCarro);
				}
				break;

			case 2:
				if (fabrica.getCarrosFabricados().isEmpty() == true) {
					EntradaSaida.exibeErroFabrica();
				} else {
					String informacoes = this.fabrica.geraInfoCarro();
					EntradaSaida.exibeGeraInfoCarro(informacoes);
				}
				break;

			case 3:
				JOptionPane.showMessageDialog(null, "Encerrando o programa!");
				break;
			}

		} while (opcao != 3);
	}

}
