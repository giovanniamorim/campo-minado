package br.dev.codein.cm;

import br.dev.codein.cm.modelo.Tabuleiro;
import br.dev.codein.cm.visao.TabuleiroConsole;

public class Aplicacao {
	
	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
		
		new TabuleiroConsole(tabuleiro);

		
	}

}
