package loja.pedido;

public class ItemPedido {
	private Produto produto;
	private Integer qnt;

	public ItemPedido(Produto produto, int qnt) throws Exception {
		if (!isValidQnt(qnt)) {
			throw new Exception("Valor inválido para qnt: " + qnt);
		}
		this.produto = produto;
		this.qnt = qnt;
	}

	public Produto getProduto() {
		return produto;
	}

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		if (!isValidQnt(qnt)) {
			System.out.println("É necessário um valor positivo para quantidade de produto");
		}
		this.qnt = qnt;
	}
	
	public double getTotal() {
		return produto.getPrecoUnitario() * this.qnt;
	}

	private boolean isValidQnt(int qtd) {
		if (qtd <= 0 || produto.getQuantidadeEstoque()<qtd) {
			System.out.println("A quantidade desejada não é valida, ou não está disponível. A quantidade máxima de " + this.produto.getNome() + " em estoque é " + this.produto.getQuantidadeEstoque());
			return false;
		}
		return true;
	}
}
