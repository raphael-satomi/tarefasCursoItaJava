import java.util.HashMap;
import java.util.Map.Entry;

public class CarrinhoDeCompras {
	//"Produtos de tamanhos diferentes devem ser considerados como produtos diferentes no carrinho" = ProdutoComTamanho 
	HashMap<ProdutoComTamanho, Integer> produtos = new HashMap<ProdutoComTamanho, Integer>();
	
	public void adicionaProduto(ProdutoComTamanho produto, int quantidade) {
		if( produtos.containsKey(produto) ) {
			produtos.put(produto, produtos.get(produto) + quantidade);
			
		}else {
			produtos.put(produto, quantidade);
			
		}
	}
	
	public void removeProduto(ProdutoComTamanho produto, int quantidade) {
		if( produtos.containsKey(produto) ) {
			int quantidadeAtualizada = produtos.get(produto) - quantidade;
			if( quantidadeAtualizada > 0 ) {				
				produtos.put(produto, quantidadeAtualizada);
				
			}else {
				// Quantidade menor ou igual a zero remove produto
				produtos.remove(produto);
				
			}
			
		}
	}
	
	public double valorTotal() {
		double valorTotalCompra = 0; 
		for ( Entry<ProdutoComTamanho, Integer> entry : produtos.entrySet()) {
			ProdutoComTamanho produto = entry.getKey();
			valorTotalCompra += (produto.getPreco() * entry.getValue());
			
		}
		return valorTotalCompra;
		
	}
	
}
