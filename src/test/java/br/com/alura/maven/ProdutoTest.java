package br.com.alura.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProdutoTest {
	
	@Test
	public void verficaPrecoComImposto() {
		Produto bala = new Produto("Juquinha", 0.10);
		assertEquals(0.11, bala.getPrecoComImposto(), 0.00001);
	}

}
