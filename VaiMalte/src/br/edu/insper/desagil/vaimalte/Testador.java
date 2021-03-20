package br.edu.insper.desagil.vaimalte;

public class Testador {
	public boolean testeA() {
	    
		Carrinho carrinhoA = new Carrinho();
	    Caixa caixaA = new Caixa();
	    
	    double total = caixaA.totalComDescontos(carrinhoA.getCarrinho());
	    
	    if (total == 0.0) {
	    	return true;
	    }
		
		return false;
	}

	public boolean testeB() {
		Carrinho carrinhoB = new Carrinho();
		Produto cervejaHeineken = new Produto(1, "Cerveja Heineken Latinha", 4.09);
		Pedido pedido = new Pedido(cervejaHeineken);
		
		carrinhoB.verificaProduto(pedido);
		
		Caixa caixaB = new Caixa();
		
		double total = caixaB.totalComDescontos(carrinhoB.getCarrinho());
		
		if (total == 4.09) {
			return true;
		}
		
	    return false;
	}

	public boolean testeC() {
		
		Produto packCerveja = new Produto(2, "Pack de Cerveja", 59.90);
		Pedido pedido = new Pedido(packCerveja);
		Carrinho carrinhoC = new Carrinho();
		Caixa caixaC = new Caixa();
		carrinhoC.verificaProduto(pedido);
		caixaC.adicionaNoCaixa(packCerveja, 10);
		
		double total = caixaC.totalComDescontos(carrinhoC.getCarrinho());
		
		if (total == 53.91) {
			return true;
		}
		
	    return false;
	}

	public boolean testeD() {
		Produto cervejaEinsenbanh = new Produto(3, "Lata de cerveja Einsenbanh", 3.19);
		Produto packCerveja = new Produto(4, "Pack de Cerveja sem marca", 15.99);
		
		Pedido pedidoEinsenbanh = new Pedido(cervejaEinsenbanh);
		Pedido pedidoPackCerveja = new Pedido(packCerveja);
		
		Carrinho carrinhoD = new Carrinho();
		Caixa caixaD = new Caixa();
		
		carrinhoD.verificaProduto(pedidoPackCerveja);
		carrinhoD.verificaProduto(pedidoEinsenbanh);
		carrinhoD.verificaProduto(pedidoEinsenbanh);
		
		//A cerveja é muito ruim, por isso está com queima de estoque.
		caixaD.adicionaNoCaixa(packCerveja, 50);
		
		double total = caixaD.totalComDescontos(carrinhoD.getCarrinho());
		
		if (total == 14.375) {
			return true;
		}
		
	    return false;
	}

	public boolean testeE() {
		Produto cooler = new Produto(6, "Cooler para bebidas", 189.90);
		Produto packHeineken = new Produto(7, "Pack de longneck Heineken", 35.90);
		
		Pedido pedidoCooler = new Pedido(cooler);
		Pedido pedidoPackHeineken = new Pedido(packHeineken);
		
		Carrinho carrinhoE = new Carrinho();
		
		carrinhoE.verificaProduto(pedidoPackHeineken);
		carrinhoE.verificaProduto(pedidoPackHeineken);
		carrinhoE.verificaProduto(pedidoCooler);
		
		Caixa caixaE = new Caixa();
		
		caixaE.adicionaNoCaixa(packHeineken,15);
		
		double total = caixaE.totalComDescontos(carrinhoE.getCarrinho());
		
		if (total == 250.93) {
			return true;
		}
		
	    return false;
	}

}
