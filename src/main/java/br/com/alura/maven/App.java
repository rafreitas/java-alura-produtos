/**
 * @author Raphael F.
 * OBJETIVO: USAR AS DEPENDENCIAS, USAR O MAVEN E USAR O JUNIT
 * @version 1.0
 */

package br.com.alura.maven;

public class App {

	public static void main(String[] args) {
		
		Produto produto = new Produto("Bala juquinha", 0.1);
		System.out.println("A bala que eu gosto é a " + produto.getNome() + "e custa: R$" + produto.getPreco());
	}

}
