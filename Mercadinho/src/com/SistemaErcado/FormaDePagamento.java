package com.SistemaErcado;

import java.util.Scanner;

public class FormaDePagamento {
	private int totParcelas;
	private double valorParcelas;
	private double valorDesconto;
	private double valorTotalComDesc;
	private double valorTotal;

	public FormaDePagamento() {
		this.totParcelas = 0;
		this.valorParcelas = 0;
		this.valorDesconto = 0;
		this.valorTotalComDesc = 0;
		this.valorTotal = 0;
	}

	public double pagamentoAvista(double valor) {
		this.valorTotal = valor;
		this.valorDesconto = (valor * 10 / 100);
		valorTotalComDesc = valorTotal - valorDesconto;
		return valorTotalComDesc;
	}

	public double pagamentoDebito(double valor) {
		this.valorTotal = valor;
		this.valorDesconto = (valor * 5 / 100);
		valorTotalComDesc = valorTotal - valorDesconto;
		return valorTotalComDesc;
	}

	public double pagamentoCartaoDeCredito(double valor) {
		this.valorTotal = valor;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o total de parcelas");
		this.totParcelas = scan.nextInt();
		this.valorParcelas = valor / totParcelas;
		System.out.println("\nVocê pagará " + valor + " em " + totParcelas + " X de " + valorParcelas);
		for (int i = 0; i < totParcelas; i++) {
			System.out.println((i + 1) + "º Parcela " + valorParcelas);
		}
	valorTotalComDesc = valorTotal;
		return valorTotalComDesc;
	}

	public String toStrting() {
		String s = "";
		s += "\nValor Total: " + this.valorTotal;
		s += "\nValor do deconto: " + this.valorDesconto;
		s += "\nTotal a pagar: " + this.valorTotalComDesc;
		return s;
	}

}
