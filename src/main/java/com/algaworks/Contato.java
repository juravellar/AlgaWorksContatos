package com.algaworks;

public class Contato {

	private String id;
	
	private String nome;
	
	private String telefone;
	
	public Contato() {}
	
	public Contato(String id, String nome, String telefone) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
	}

	public boolean isNovo() {
		return id == null;
	} /* cadastro novo ou editado? id sem valor? sim = true, não = false */
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	}