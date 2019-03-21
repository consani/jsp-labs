package br.com.impacta;

public class UsuarioBean {
	
	//Atributos privados 
	private String nome;
	private String login;
	private String senha;
	
	//deve possuir um construtor publico padrão 
	public UsuarioBean(){
		this.nome = "[Nao tenho nome]";
		this.login = "anonymous";
		this.senha = "secret";
	}
	
	//pode conter outros construtores
	public UsuarioBean(String nome, String login, String senha){
		this.setNome(nome);
		this.setLogin(login);
		this.setSenha(senha);
	}
	
	//deve possuir metodos set/get publicos

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	 
	
	

}
