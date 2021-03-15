package br.edu.insper.desagil.vaimalte;

public class Produto {
	private int codigo;
	private String nome;
	private double preço;
	
	public Produto(int codigo, String nome, double preço) {
		this.codigo = codigo;
		this.nome = nome;
		this.preço = preço;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preço;
	}
	
}
