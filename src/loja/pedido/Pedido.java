package loja.pedido;

import java.util.ArrayList;
import java.util.List;

import loja.pedido.pagamento.Pagamento;
import loja.pessoa.Funcionario;

public class Pedido {
	private List<ItemPedido> itens;
	private Pagamento pagamento;
	private Funcionario vendedor;
	private double valorTotal;

	public Pedido(Pagamento p,Funcionario v) {
		this.itens = new ArrayList<>();
		this.setPagamento(p);
		this.setVendedor(v);
	}
	public void setPagamento(Pagamento p) {
		this.pagamento = p;
	}
	public void setVendedor(Funcionario v) {
		this.vendedor = v;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}
	public Funcionario getVendedor() {
		return vendedor;
	}
	public void adicionarItem(ItemPedido item) {
		this.itens.add(item);
	}
	public void removerItem(ItemPedido item) {
		this.itens.remove(item);
	}
	public double getValorTotal() {
		return this.valorTotal;
	}

	public void setValorTotal(List<ItemPedido> itens) {
		this.valorTotal = itens.stream().mapToDouble(i -> i.getTotal()).sum();
	}
	
	

	public void finalizarPedido(Pagamento pagamento) {
		Double totalPedido = this.getValorTotal();
		if(!this.vendedor.getAbriuCaixa()) {
			throw new RuntimeException("O caixa ainda não está aberto");
		}
		if (this.pagamento.getTotalPagamento().equals(totalPedido)) {
			this.pagamento = pagamento;
			System.out.println("Pagamento dos itens:");
			itens.forEach(i -> System.out.println(i.getQnt()+" - "+i.getProduto().getDescricao() + " - Preço Unitário: R$ " + i.getProduto().getPrecoUnitario() + " - Preço total R$ " + i.getTotal()));
			System.out.println("Total: R$ "+ this.pagamento.getTotalPagamento());
		} else {
			System.out.println("O valor do pagamento(R$ "+ this.pagamento.getTotalPagamento() +") diverge do total do pedido (R$ "+ totalPedido +").");
			System.out.println("Pagamento não realizado.");
		}
	}
}
