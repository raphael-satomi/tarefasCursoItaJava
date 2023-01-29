import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testeProdutoComTamanho {

	@Test
	void tamanhoDiferente() {
		ProdutoComTamanho p1 = new ProdutoComTamanho("Chinelo", 55431, 15, 39);
		ProdutoComTamanho p2 = new ProdutoComTamanho("Chinelo Vermelho", 55431, 20, 40);
		
		assertEquals( p1.equals(p2), false);
		
	}
	
	@Test
	void tamanhoIgualCodigoDiferente() {
		ProdutoComTamanho p1 = new ProdutoComTamanho("Chinelo", 55431, 15, 39);
		ProdutoComTamanho p2 = new ProdutoComTamanho("Chinelo Vermelho", 55439, 20, 39);
		
		assertEquals( p1.equals(p2), false);
		
	}
	
	@Test
	void tamanhoIgualCodigoIgual() {
		ProdutoComTamanho p1 = new ProdutoComTamanho("Chinelo", 55431, 15, 39);
		ProdutoComTamanho p2 = new ProdutoComTamanho("Chinelo Vermelho", 55431, 20, 39);
		
		assertEquals( p1.equals(p2), true);
		
	}

}
