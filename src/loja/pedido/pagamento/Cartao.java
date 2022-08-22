package loja.pedido.pagamento;

public class Cartao implements Pagamento {
	private Double totalPago;

	public Cartao(Double totalPago) {
		this.totalPago = totalPago + (totalPago * (3/100));
	}

	@Override
	public Double getTotalPagamento() {
		return totalPago;
	}
}
