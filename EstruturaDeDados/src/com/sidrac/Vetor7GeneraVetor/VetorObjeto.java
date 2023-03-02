package com.sidrac.Vetor7GeneraVetor;

import java.util.Arrays;

/*
 * REMOVER UM ELEMENTO DE QUALQUER
 *  POSIÇÃO DO VETOR
 */
public class VetorObjeto {
	Object[] elementos;
	int tamReal;

	public VetorObjeto(int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamReal = 0;
	}

	/*
	 * Atribuir um valor no final do vetor Faz o trabalho, mas não é muito eficiente
	 * public void adciona(Object elemento) { for (int i=0; i<this.elementos.length;
	 * i++) { if(this.elementos[i] == null) { this.elementos[i]=elemento; break; } }
	 * } public void adcionar(Object elemento) { if(this.tamReal <
	 * this.elementos.length) { this.elementos[tamReal] = elemento; tamReal++; } }
	 */
	public boolean adcionar(Object elemento) {
		if (this.tamReal < this.elementos.length) {
			this.elementos[tamReal] = elemento;
			tamReal++;
			return true;
		}
		return false;
	}

	public boolean adcionar(int posicao, Object elemento) {
		if (!(posicao >= 0 && posicao < this.tamReal)) {
			throw new IllegalArgumentException("posição inválida");
		}
		for (int i = this.tamReal - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];

		}
		this.elementos[posicao] = elemento;
		tamReal++;

		return false;
	}

	public int tamanho() {
		return this.tamReal;
	}

	public Object busca(int posicao) {
		if (!(posicao >= 0 && posicao < this.tamReal)) {
			throw new IllegalArgumentException("posição inválida");
		}
		return this.elementos[posicao];
	}

	// BUSCA SEQUENCIAL
	public int buscaSequencial(Object elemen) {
		for (int i = 0; i < this.tamReal; i++) {
			if (this.elementos[i].equals(elemen)) {
				return i;
			}

		}
		return -1;
	}

	public void remover(int posicao) {
		if (!(posicao >= 0 && posicao < this.tamReal)) {
			throw new IllegalArgumentException("posição inválida");
		}
		for (int i = posicao; i < this.tamReal - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		this.tamReal--;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for (int i = 0; i < this.tamReal - 1; i++) {
			s.append(this.elementos[i]);
			s.append(" , ");
		}
		if (this.tamReal > 0) {
			s.append(this.elementos[tamReal - 1]);
		}
		s.append("]");
		return s.toString();
	}

}
