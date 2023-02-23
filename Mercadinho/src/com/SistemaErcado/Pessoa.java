package com.SistemaErcado;

public class Pessoa {
	private String nome;
	private String cpf;

	public Pessoa() {

	}

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String toString() {
		String s = "\n";
		s += "\nNome " + nome;
		s += "\nCPF " + cpf;
		s += "\n";
		return s;

	}

}
