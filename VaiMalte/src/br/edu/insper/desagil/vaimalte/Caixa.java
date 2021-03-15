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
	
	public void adicionaNoCaixa(Produto produto, Integer inteiro) {
		
		if (1 <= inteiro && inteiro <= 99) {
			this.caixa.put(produto.getCodigo(), inteiro);
		}
	}
	
	public double totalComDescontos(List<Pedido> carrinho) {
		double total = 0.0;
		
		//vamos percorrer a lista e verificar cada pedido
		for(int i = 0; i < carrinho.size(); i++) {
			//pegando o pedido presente na lista
			Pedido pedido_na_lista = carrinho.get(i);
			
			//pegando a quantidade do pedido e o produto
			int quantidade = pedido_na_lista.getQuantidade();
			Produto produto_na_lista = pedido_na_lista.getProduto();
			
			//agora temos que descobrir o codigo do produto e o preço
			
			double preco_produto_na_lista = produto_na_lista.getPreco();
			int codigo_produto_na_lista = produto_na_lista.getCodigo();
			
			//verifica se o produto tem algum tipo de desconto
			if (caixa.containsKey(codigo_produto_na_lista)) {
				
				double desconto = (caixa.get(codigo_produto_na_lista))/100;
				
				total += (preco_produto_na_lista*(1-desconto))*quantidade;
				
			} else {
				
				total += preco_produto_na_lista*quantidade;
				
			}
			
		}
		
		return total;
	}

}
