package br.fiap.contato;

public class Contaro {
	private String nome, email, endereco, nasc;

	public Contaro(String nome, String email, String endereco, String nasc) {
		super();
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.nasc = nasc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNasc() {
		return nasc;
	}

	public void setNasc(String nasc) {
		this.nasc = nasc;
	}
	
}
