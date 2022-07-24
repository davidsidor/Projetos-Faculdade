package lista3;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Retorno
		double valor = solicitarValorTotal();
		calcularDescontoCompra(valor);
	}
	// Método para solicitar o valor da compra
     public static double solicitarValorTotal () {
    	 double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total da compra"));
    	 // Verificando se não tem número menor que 0
    	 while (valor <= 0) {
    		 mostrarErroValor();
    		 valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total da compra"));
    	 }
    	 return valor;
     }
     // Método para calcular o desconto da compra
     public static void calcularDescontoCompra (double valor) {
    	 DecimalFormat d=new DecimalFormat("0.00");
    	 // Desconto de 20%
    	 if (valor > 100 & valor <= 200) {
    		double descont = valor * 20 / 100;
    		 valor = valor - descont;
    		 JOptionPane.showMessageDialog(null, "O valor final da compra é de: " +d.format(valor)+ " reais");
    		 // Desconto de 30%
    	 }else if (valor > 200) {
    		 double descont = valor * 30 / 100;
    		 valor = valor - descont;
    		 JOptionPane.showMessageDialog(null, "O valor final da compra é de: " +d.format(valor)+ " reais");
    		 // Sem desconto 
    	 }else {
    		 JOptionPane.showMessageDialog(null, "O valor final da compra é de: " +d.format(valor)+ " reais");
    	 }
     }
     // Método para informar uma mensagem de erro no valor digitado
     public static void mostrarErroValor() {
    	 JOptionPane.showMessageDialog(null, "Valor digitado inválido");
     }
}
