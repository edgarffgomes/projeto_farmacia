package loja.pessoa;

public class Funcionario extends Pessoa{

	private boolean abriuCaixa;
	
	public Funcionario (String n, String id, String c, boolean a) {
		super(n, id, c);
		this.setAbriuCaixa(a);
	}
	
	public boolean getAbriuCaixa() {
		return this.abriuCaixa;
	}
	
	public void setAbriuCaixa(boolean abertura) {
		this.abriuCaixa = abertura;
	}
	
	public void imprimirDados() {
		System.out.println("funcionário: " + this.getNome() + " - CPF: " + this.getCpf() + " - Contato: " + this.getContato());
	}
	
	
}
