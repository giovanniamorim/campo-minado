package br.dev.codein.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.dev.codein.cm.excecao.ExplosaoException;


public class CampoTeste {
	

	private Campo campo;
	
	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3, 3);
	}
	
	@Test
	void testaVizinhoDaEsquerda() {
		Campo vizinho = new Campo (3,2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	
	@Test
	void testaVizinhoDaDireita() {
		Campo vizinho = new Campo(3,4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	
	@Test
	void testaVizinhoDeCima() {
		Campo vizinho = new Campo(2,3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	
	@Test
	void testaVizinhoDeBaixo() {
		Campo vizinho = new Campo(4,3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	
	@Test
	void testaVizinhoDiagonalSuperiorEsquerda() {
		Campo vizinho = new Campo(2, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	
	@Test
	void testaVizinhoDiagonalSuperiorDireita() {
		Campo vizinho = new Campo(2, 4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	
	@Test
	void testaVizinhoDiagonalInferiorEsquerda() {
		Campo vizinho = new Campo(4, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	
	@Test
	void testaVizinhoDiagonalInferiorDireita() {
		Campo vizinho = new Campo(4, 4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	
	@Test
	void testaNaoVizinho() {
		Campo vizinho = new Campo(1, 1);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertFalse(resultado);
				
	}
	
	@Test
	void testeValorPadraoAtributoMarcado() {
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAlternarmarcacao() {
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());
	}
	
	@Test
	void testeAbrirCampoNaoMinadoNaoMarcado() {
		assertTrue(campo.abrir());
	}
	
	@Test
	void testeAbrirCampoNaoMinadoMarcado() {
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}
	
//	@Test
//	void testeAbrirCampoMinadoMarcado() {
//		campo.isMarcado();
//		campo.minar();
//		assertTrue(campo.abrir());
//	}
//	
//	@Test
//	// Campo que foi aberto e explodiu
//	void testeAbrirMinadoNaoMarcado() {
//		campo.minar();
//		assertThrows(ExplosaoException.class, () -> {
//			campo.abrir();
//		});
//		
//	}
	
	@Test
	void testeAbrirComVizinhos() {
		Campo campo11 = new Campo(1, 1);
		Campo campo22 = new Campo(2, 2);
		campo22.adicionarVizinho(campo11);
		
		campo.adicionarVizinho(campo22);
		campo.abrir();
		
		assertTrue(campo22.isAberto() && campo11.isAberto());
	}

	
	@Test
	void vizinhancaSegura() {
		Campo vizinho = new Campo(3,2);
		boolean isSeguro = !vizinho.isMarcado() && vizinho.vizinhancaSegura();
		assertTrue(isSeguro);
	}
	
//	@Test
//	void testeObjetivoAlcancado() {
//		Campo vizinho = new Campo(3,2);
//		boolean desvendado = !vizinho.minar() && vizinho.isAberto();
//		boolean protegido = vizinho.minar() && vizinho.isMarcado();
//		
//		assertTrue(desvendado || protegido);
//	}
}
