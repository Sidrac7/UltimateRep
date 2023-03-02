package com.sidrac.Vetor7GeneraVetor;



public class Aula2 {

	public static void main(String[] args) {
		
		Contato c1 = new Contato("joao", "8888", "joao@email.com");
		Contato c2 = new Contato("Maria", "1111", "Maria.com");
		Contato c3 = new Contato("Marcos", "3333", "Marcos.com");

		
		VetorObjeto vvv = new VetorObjeto(5);
		
		vvv.adcionar(c1);
		vvv.adcionar(c2);
		vvv.adcionar(c3);
		
		System.out.println(vvv.tamanho());
		
		System.out.println(vvv);
		
		
     
	}

}
