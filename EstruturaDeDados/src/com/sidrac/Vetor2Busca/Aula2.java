package com.sidrac.Vetor2Busca;



public class Aula2 {

	public static void main(String[] args) {
		Vetor vvv = new Vetor(5);
		vvv.adcionar("aaa");
		vvv.adcionar("eee");
		vvv.adcionar("iii");
		
		System.out.println(vvv.tamanho());
		System.out.println(vvv.toString());
		
		System.out.println(vvv.busca(1));
     
	}

}
