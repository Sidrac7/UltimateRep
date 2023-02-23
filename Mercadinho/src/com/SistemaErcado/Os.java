package com.SistemaErcado;

public class Os {
	private Cliente cliente;
	private Atendente atendente;
	private Aparelho aparelho;
	private boolean status;
	private Servico servicos;
	private FormaDePagamento formaDePagamento;
	static int id;

	public Os() {

		id++;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Atendente getAtendente() {
		return atendente;
	}

	public void setAtendente(Atendente atendente) {
		this.atendente = atendente;
	}

	public Aparelho getAparelho() {
		return aparelho;
	}

	public void setAparelho(Aparelho aparelho) {
		this.aparelho = aparelho;
	}

	public Servico getServicos() {
		return servicos;
	}

	public void setServicos(Servico servicos) {
		this.servicos = servicos;
	}

	public FormaDePagamento getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public String toString() {
		String s = "\nOS" + id;

		if ( getCliente() != null) {
			//s += "\nAtendente " + getAtendente().toString();
			s += "\nCliente " + getCliente().toString();
		}
		if (getAparelho() != null) {
			s += getAparelho();
		} else {
			s += "\nCliente não tem aparelho cadastrado";
		}
		if (getServicos() != null) {
			s += "\n===SERVIÇO===";
			s += getServicos().toString();
		}
		if (getFormaDePagamento() != null) {
			s += getFormaDePagamento().toStrting();
		}
		return s;
	}

}

