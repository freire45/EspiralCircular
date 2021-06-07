package br.com.erickfreire.espiralcircular;

import javax.swing.JFrame;

public class Teste {
	public static void main(String[] args) {
		EspiralCircular painel = new EspiralCircular();
		JFrame aplicacao = new JFrame();
		
		aplicacao.add(painel);
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacao.setSize(400,400);
		aplicacao.setVisible(true);
	}

}
