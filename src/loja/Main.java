package loja;

import loja.pedido.ItemPedido;
import loja.pedido.Pedido;
import loja.pedido.Produto;
import loja.pedido.pagamento.Dinheiro;
import loja.pessoa.Administrador;
import loja.pessoa.Cliente;
import loja.pessoa.Funcionario;

public class Main {

	public static void main(String[] args) throws Exception {

		System.out.println("\n-----Dados das pessoas-----\n");
		// pessoas
		Administrador adm = new Administrador("Administreusa", "14927483927", "022993841726");
		Funcionario vendedor = new Funcionario("Trabalhaildo", "85938272482", "022994712039");
		adm.imprimirDados();
		vendedor.imprimirDados();


		// produtos
		Produto sabonete = new Produto("Nutri SPA", "Johnson's", 2.50);
		Produto fioDental = new Produto("Fio Dental Clássico", "Safinill", 5);


		// Compra
		Cliente cliente = new Cliente("Clientivaldo","18492837105");
		cliente.imprimirDados();


		System.out.println("\n-----Dados do pedido-----\n");
		Pedido pedido = new Pedido(vendedor, cliente);
		ItemPedido item1 = new ItemPedido(sabonete, 2);
		ItemPedido item2 = new ItemPedido(fioDental, 1);
		pedido.adicionarItem(item1);
		pedido.adicionarItem(item2);

		Double total = pedido.getTotal();
		System.out.println("Total do pedido: " + total);

		Double valorPago = total; // Pagamento do cliente
		pedido.finalizarPedido(new Dinheiro(valorPago));
	}

}
