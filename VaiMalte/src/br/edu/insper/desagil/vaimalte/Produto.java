package br.edu.insper.desagil.vaimalte;

public class Produto {
	private int codigo;
	private String nome;
	private double pre�o;
	
	public Produto(int codigo, String nome, double pre�o) {
		this.codigo = codigo;
		this.nome = nome;
		this.pre�o = pre�o;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return pre�o;
	}
	
}
