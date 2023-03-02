package com.sidrac.Vetor1;

import java.util.Arrays;

/*
 * IMPRIMIR APENAS ELEMENTOS
 * DO VETOR ,
 * sem os null COM
 * STRINGBUILDER
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
	public int tamanho() {
		return this.tamReal;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for(int i = 0; i<this.tamReal-1; i++) {
			s.append(this.elementos[i]);
			s.append(" , ");
		}
		if(this.tamReal>0) {
			s.append(this.elementos[tamReal-1]);
		}
		s.append("]");
		return s.toString();
	}
	
}
