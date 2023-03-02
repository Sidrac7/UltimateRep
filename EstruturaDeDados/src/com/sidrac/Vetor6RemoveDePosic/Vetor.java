package com.sidrac.Vetor6RemoveDePosic;

import java.util.Arrays;

/*
 * REMOVER UM ELEMENTO DE QUALQUER
 *  POSIÇÃO DO VETOR
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
	public boolean adcionar(int posicao,String elemento) {
		if(!(posicao >= 0 && posicao < this.tamReal)) {
			throw new IllegalArgumentException("posição inválida");	
			}
		for (int i = this.tamReal-1; i>=posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
			
			
		}
		this.elementos[posicao] = elemento;
		tamReal++;
			
		return false;
	}
	
	
	public int tamanho() {
		return this.tamReal;
	}
	public String busca(int posicao) {
		if(!(posicao >= 0 && posicao < this.tamReal)) {
		throw new IllegalArgumentException("posição inválida");	
		}	
		return this.elementos[posicao];
	}
	//BUSCA SEQUENCIAL
	public int buscaSequencial(String elemen) {
		for(int i = 0; i<this.tamReal; i++) {
			if(this.elementos[i].equals(elemen)) {
				return i;
			}
			
		}
		return -1;
	}
	
	public void remover(int posicao) {
		if(!(posicao >= 0 && posicao < this.tamReal)) {
			throw new IllegalArgumentException("posição inválida");	
			}
		for(int i = posicao; i<this.tamReal-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamReal--;
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
