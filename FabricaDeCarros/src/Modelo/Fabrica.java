package Modelo;

import java.util.ArrayList;

public class Fabrica {

	private ArrayList<Carro> carrosFabricados = new ArrayList<Carro>();

	public ArrayList<Carro> getCarrosFabricados() {
		return carrosFabricados;
	}

	public void setCarrosFabricados(ArrayList<Carro> carrosFabricados) {
		this.carrosFabricados = carrosFabricados;
	}

	public void fabricaCarros(Carro carro) {
		this.carrosFabricados.add(carro);
	}

	public void venderCarro(Carro removeCarro) {
		this.carrosFabricados.remove(removeCarro);
	}

	public String geraInfoCarro() {
		String informacoes = "Carros: \n";

		for (Carro carro : this.carrosFabricados) {
			informacoes += "Modelo do carro: " + carro.getModelo() + " \n";
			informacoes += "Cor do modelo: " + carro.getCor() + " \n";
		}
		return informacoes;
	}

}
