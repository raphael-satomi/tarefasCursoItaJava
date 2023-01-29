import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testeCarrinhoDeCompras {

	@Test
	void verificaAdicaoDeProduto() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		ProdutoComTamanho p1 = new ProdutoComTamanho("Chinelo", 55431, 15, 39);
		ProdutoComTamanho p2 = new ProdutoComTamanho("Chinelo Vermelho", 55431, 20, 40);
		carrinho.adicionaProduto(p1, 3);
		carrinho.adicionaProduto(p2, 5);
		
		assertEquals(carrinho.produtos.size(), 2);
		
	}
	
	@Test
	void verificaQuantidadeProduto() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		ProdutoComTamanho p1 = new ProdutoComTamanho("Chinelo", 55431, 15, 39);
		
		carrinho.adicionaProduto(p1, 3);
		carrinho.adicionaProduto(p1, 5);
		
		assertEquals(carrinho.produtos.get(p1), 8);
		
	}
	
	@Test
	void verificaRemocaoDeQuantidade() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		ProdutoComTamanho p1 = new ProdutoComTamanho("Chinelo", 55431, 15, 39);
		
		carrinho.adicionaProduto(p1, 3);
		carrinho.adicionaProduto(p1, 5);
		carrinho.removeProduto(p1, 7);
		
		assertEquals(carrinho.produtos.get(p1), 1);
		
	}
	
	@Test
	void valorTotalCarrinho() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		ProdutoComTamanho p1 = new ProdutoComTamanho("Chinelo", 55431, 15, 39);
		ProdutoComTamanho p2 = new ProdutoComTamanho("Chinelo Vermelho", 55431, 20, 40);
		carrinho.adicionaProduto(p1, 3);
		carrinho.adicionaProduto(p2, 5);
		
		assertEquals(carrinho.valorTotal(), 145);
		
	}

}
