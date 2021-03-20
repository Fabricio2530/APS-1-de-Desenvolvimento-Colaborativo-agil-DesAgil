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
		if (this.carrinho.contains(pedido)){
			
			pedido.incrementaQuantidade();
		
		} else {
			
			//como se não houver esse pedido, ele precisa criar, vamos criar com base no pedido de referencia
			Pedido novoPedido = new Pedido(pedido.getProduto());

			this.carrinho.add(novoPedido);
		}
		
	}

}
