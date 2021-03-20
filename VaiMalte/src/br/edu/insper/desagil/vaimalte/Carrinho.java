package br.edu.insper.desagil.vaimalte;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Pedido> carrinho;

	public Carrinho() {
		super();
		this.carrinho = new ArrayList<>();
	}
	
	public List<Pedido> getCarrinho() {
		return carrinho;
	}
	
	public void verificaProduto(Pedido pedido) {
		//� void porque n�o retorna nada
		if (this.carrinho.contains(pedido)){
			
			pedido.incrementaQuantidade();
		
		} else {
			
			//como se n�o houver esse pedido, ele precisa criar, vamos criar com base no pedido de referencia
			Pedido novoPedido = new Pedido(pedido.getProduto());

			this.carrinho.add(novoPedido);
		}
		
	}

}
