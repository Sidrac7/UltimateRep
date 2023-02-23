package com.SistemaErcado;

public class Aparelho {
	private String marca;
	private String modelo;
	private String defeito;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getDefeito() {
		return defeito;
	}

	public void setDefeito(String defeito) {
		this.defeito = defeito;
	}

	public String toString() {
		String s = "\n\nAparelho";
		s += "\nMarca " + marca;
		s += "\nModelo " + modelo;
		s += "\nDefeito: " + defeito;
		return s;
	}

}

