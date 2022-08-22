package loja.pessoa;

public class Pessoa {
	protected String contato;
	private String nome;
	private String cpf;

	public Pessoa(String n, String id, String c) {
		this.setNome(n);
		this.setCpf(id);
		this.setContato(c);
	}

	public String getContato() {
		return this.contato;
	}
		
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setContato(String c) {
		this.contato = c;
	}

	public void setNome(String n) {
		this.nome = n;
	}
	
	public void setCpf(String id) {
		this.cpf = id;
	}

}
