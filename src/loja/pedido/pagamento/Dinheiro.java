package loja.pedido.pagamento;

public class Dinheiro implements Pagamento {
	private Double totalPago;
	
	public Dinheiro(Double totalPago) {
		this.totalPago = totalPago;
	}

	@Override
	public Double getTotalPagamento() {
		return totalPago;
	}
}
