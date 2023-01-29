import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testeProduto {
	
	// Serem considerados iguais instancias de Produto que possuam o mesmo código
	
	@Test
	void codigoIgual() {
		Produto p1 = new Produto("Chinelo", 55431, 15);
		Produto p2 = new Produto("Chinelo Vermelho", 55431, 20);
		
		assertEquals( p1.equals(p2), true);
	}
	
	@Test
	void codigoDiferente() {
		Produto p1 = new Produto("Chinelo", 55431, 15);
		Produto p2 = new Produto("Chinelo Vermelho", 55430, 20);
		
		assertEquals( p1.equals(p2), false);
	}

}
