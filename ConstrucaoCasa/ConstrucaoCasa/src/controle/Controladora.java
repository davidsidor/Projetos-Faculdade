package controle;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Aberturas;
import modelo.Casa;
import modelo.Janela;
import modelo.Porta;
import vizualizacao.EntradaSaida;

public class Controladora {
	private Casa casa = null;

	public void ExibeMenu() {
		int opcao;
		int opcaoConstruir = 0;

		do {
			opcaoConstruir = EntradaSaida.construirCasa();

			switch (opcaoConstruir) {
			case 0:
				this.casa = new Casa();
				String descricao = EntradaSaida.solicitaDescricao("Casa", 0);
				String cor = EntradaSaida.solicitaCor();

				int qtdePortas = EntradaSaida.solicitaQtdeAberturas("Portas");

				while (qtdePortas <= 0) {
					EntradaSaida.verificaErro();
					qtdePortas = EntradaSaida.solicitaQtdeAberturas("Portas");
				}

				int qtdeJanelas = EntradaSaida.solicitaQtdeAberturas("Janelas");

				while (qtdeJanelas <= 0) {
					EntradaSaida.verificaErro();
					qtdeJanelas = EntradaSaida.solicitaQtdeAberturas("Janelas");
				}

				ArrayList<Aberturas> listaDePortas = new ArrayList<Aberturas>();

				for (int i = 0; i < qtdePortas; i++) {
					Porta porta = new Porta();
					porta.setDescricao(EntradaSaida.solicitaDescricao("Porta", (i + 1)));
					porta.setEstado(EntradaSaida.solicitaEstado("Porta"));
					listaDePortas.add(porta);
				}

				ArrayList<Aberturas> listaDeJanelas = new ArrayList<Aberturas>();

				for (int i = 0; i < qtdeJanelas; i++) {
					Janela janela = new Janela();
					janela.setDescricao(EntradaSaida.solicitaDescricao("Janela", (i + 1)));
					janela.setEstado(EntradaSaida.solicitaEstado("Janela"));
					listaDeJanelas.add(janela);
				}

				this.casa.constroiCasa(descricao, cor, listaDePortas, listaDeJanelas);

				System.out.println("Descrição da casa: " + casa.getDescricao() + "\n");
				System.out.println("Cor da casa: " + casa.getCor() + "\n");

				for (Aberturas porta : casa.getListaDePortas()) {
					System.out.println("Descrição da porta: " + porta.getDescricao() + "\n");
					System.out.println("Estado da porta: " + porta.getEstado() + "\n");
				}
				for (Aberturas janela : casa.getListaDeJanelas()) {
					System.out.println("Descição da janela: " + janela.getDescricao() + "\n");
					System.out.println("Estado da janela: " + janela.getEstado() + "\n");
				}

				break;
			case 1:
				EntradaSaida.exibeMsgEncerraPrograma();
				System.exit(0);
				break;
			}
			break;
		} while (opcaoConstruir != 2);

		do {

			opcao = EntradaSaida.solicitaOpcao();

			switch (opcao) {
			case 0:
				String tipoAbertura = EntradaSaida.solicitaTipoAbertura();
				ArrayList<Aberturas> listaDeAberturas = new ArrayList<Aberturas>();

				if (tipoAbertura.equals("Porta")) {
					listaDeAberturas = this.casa.getListaDePortas();
				} else {
					listaDeAberturas = this.casa.getListaDeJanelas();
				}

				int posicao = EntradaSaida.solicitaAberturaMover(listaDeAberturas);
				int novoEstado = 0;

				if (posicao != -1) {
					novoEstado = EntradaSaida.solicitaEstado(tipoAbertura);
					Aberturas abertura = this.casa.retornaAbertura(posicao, tipoAbertura);
					this.casa.moverAbertura(abertura, novoEstado);
					System.out.println("Novo estado da " + tipoAbertura + " : " + abertura.getEstado());
				} else {
					EntradaSaida.exibeMsgAbertura();
				}
				break;
			case 1:
				String informacoes = this.casa.geraInfoCasa();
				EntradaSaida.exibeGeraInfoCasa(informacoes);
				break;
			}
		} while (opcao != 2);

		EntradaSaida.exibeMsgEncerraPrograma();

		System.exit(0);

	}
}
