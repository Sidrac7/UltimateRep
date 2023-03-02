package com.sidrac.Vetor;
/*
 * ADCIONAR ELEMENTO NO FINAL DO VETOR
 * TRÊS MANEIRAS DIFERENTES
 * A ÚLTIMA É A MAIS EFICAZ
 */
public class Vetor {
	String[] elementos;
	int tamReal;
	
	public Vetor(int capacidade) {
		this.elementos=new String[capacidade];
		this.tamReal=0;
	}
	
	/*Atribuir um valor no final do vetor
	 * Faz o trabalho, mas não é muito eficiente
	public void adciona(String elemento) {
		for (int i=0; i<this.elementos.length; i++) {
			if(this.elementos[i] == null) {
				this.elementos[i]=elemento;
				break;
			}
		}
	}
	public void adcionar(String elemento) {
		if(this.tamReal < this.elementos.length) {
			this.elementos[tamReal] = elemento;
			tamReal++;
		}
	}*/
	public boolean adcionar(String elemento) {
		if(this.tamReal < this.elementos.length) {
			this.elementos[tamReal] = elemento;
			tamReal++;
			return true;
		}
		return false;
	}
}
