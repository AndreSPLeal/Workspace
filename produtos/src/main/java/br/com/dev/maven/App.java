package br.com.dev.maven;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		
		Produto produto = new Produto("Bala de tangerina", 0.15);
		
		System.out.println("A bala q eu gosto é: " + produto.getNome() + " e custa, " + produto.getPreco());
	}
}
