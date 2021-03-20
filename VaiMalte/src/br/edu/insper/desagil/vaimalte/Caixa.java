package br.edu.insper.desagil.vaimalte;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Caixa {
	private Map<Integer, Integer> caixa;

	public Caixa() {
		super();
		this.caixa = new HashMap<>();
	}
	
	public void adicionaNoCaixa(Produto produto, int inteiro) {
		
		if (1 <= inteiro && inteiro <= 99) {
			this.caixa.put(produto.getCodigo(), inteiro);
		}
	}
	
	public double totalComDescontos(List<Pedido> carrinho) {
		double total = 0.0;
		
		//vamos percorrer a lista e verificar cada pedido
		for(int i = 0; i < carrinho.size(); i++) {
			//pegando o pedido presente na lista
			Pedido pedidoNaLista = carrinho.get(i);
			
			//pegando a quantidade do pedido e o produto
			int quantidade = pedidoNaLista.getQuantidade();
			Produto produtoNaLista = pedidoNaLista.getProduto();
			
			double precoProdutoNaLista = produtoNaLista.getPreco();
			int codigoProdutoNaLista = produtoNaLista.getCodigo();
			
			//verifica se o produto tem algum tipo de desconto
			if (this.caixa.containsKey(codigoProdutoNaLista)) {
				
				double desconto = (this.caixa.get(codigoProdutoNaLista))*(0.01);
				total += (precoProdutoNaLista*(1-desconto))*quantidade;
				
			} else {
				
				total += precoProdutoNaLista*quantidade;
				
			}
			
		}
		
		return total;
	}

}
