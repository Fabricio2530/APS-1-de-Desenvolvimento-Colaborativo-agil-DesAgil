package br.edu.insper.desagil.vaimalte;

public class Pedido {
	private Produto produto;
	private int quantidade;
	
	
	public Pedido(Produto produto) {
		super();
		this.produto = produto;
		//a quantidade deve ser inicializada já com 1
		this.quantidade = 1;
	}


	public Produto getProduto() {
		return this.produto;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	public void incrementaQuantidade() {
		this.quantidade += 1;
		
	}
	
	public double totalPedido() {
		double total = this.produto.getPreco() * this.quantidade;
		return total;
	}
}
