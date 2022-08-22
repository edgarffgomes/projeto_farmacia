package loja.pedido;

public class Produto {
	private String nome;
	private String descricao;
	private String marca;
	private double precoUnitario;
	private int quantidadeEstoque;

	public Produto(String n, String d, String m, double pU, int qE) {
		this.setNome(n);
		this.setDescricao(d);
		this.setMarca(m);
		this.setPrecoUnitario(pU);
		this.setQuantidadeEstoque(qE);
	}

	public Produto() {
		super();
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String n) {
		this.nome = n;
	}
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String d) {
		this.descricao = d;
	}

	public String getMarca() {
		return this.marca;
	}

	public double getPrecoUnitario() {
		return this.precoUnitario;
	}

	public void setPrecoUnitario(double pU) {
		this.precoUnitario = pU;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getQuantidadeEstoque() {
		return this.quantidadeEstoque;
	}
	public void setQuantidadeEstoque(int qE) {
		this.quantidadeEstoque =  qE;
	}
	
	
}
