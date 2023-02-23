package com.SistemaErcado;

public class Servico {

	private String situacao;
	private String[] peca;
	private String[] maoDeObra;
	private double[] valorPeca;
	private double[] valorMaoDeObra;

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String[] getPeca() {
		return peca;
	}

	public void setPeca(String[] peca) {
		this.peca = peca;
	}

	public String[] getMaoDeObra() {
		return maoDeObra;
	}

	public void setMaoDeObra(String[] maoDeObra) {
		this.maoDeObra = maoDeObra;
	}

	public double[] getValorPeca() {
		return valorPeca;
	}

	public void setValorPeca(double[] valorPeca) {
		this.valorPeca = valorPeca;
	}

	public double[] getValorMaoDeObra() {
		return valorMaoDeObra;
	}

	public void setValorMaoDeObra(double[] valorMaoDeObra) {
		this.valorMaoDeObra = valorMaoDeObra;
	}

	public int valorTotalSerco() {
		int vts = 0;
		for (int i = 0; i < getValorMaoDeObra().length; i++) {
			vts += getValorPeca()[i] + getValorMaoDeObra()[i];
		}
		return vts;
	}

	public String toString() {
		String s = "";
		s += "\nSituacao " + this.situacao;
		if (getPeca() != null) {
			for (int i = 0; i < getPeca().length; i++) {
				if (getPeca()[i] != null && getValorPeca()[i] != 0) {
					s += "\nPeça " + getPeca()[i] + " Valor " + getValorPeca()[i];
				}
			}
		}
		if (getMaoDeObra() != null) {
			for (int i = 0; i < getMaoDeObra().length; i++) {
				if (getMaoDeObra()[i] != null && getValorMaoDeObra()[i] != 0) {
					s += "\n Mão de obra " + getMaoDeObra()[i] + " Valor " + getValorMaoDeObra()[i];

				}
			}
		}
		s += "\nValor total do serviço " + valorTotalSerco();
		return s;
	}

}
