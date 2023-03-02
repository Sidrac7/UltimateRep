package com.sidrac.jhs;

import java.util.Arrays;

public class VetorGenerics<T> {
	//GENERALIZAR TIPO DO VETOR
    //GeENERALIZANDO CLASSES
    T[] vetor;
    int tamanho;
    public VetorGenerics(int capacidade){

        this.vetor =(T[]) new Object[capacidade];
    }
    public void adcionarElemento(T elemento){
        this.aumentarCapacidade();
        for(int i = 0; i< vetor.length; i++){
            if(vetor[i] == null){
                this.vetor[i] = elemento;
                this.tamanho++;
                break;
            }

        }
    }
    public void adcionarElemento(T elemento, int posicao){
        this.aumentarCapacidade();

        for(int i = this.tamanho+1; i>= posicao; i--){

            this.vetor[i] = this.vetor[i-1];
            if(i == posicao){
                vetor[i] = elemento;
                this.tamanho++;
            }
        }

    }
    public void apagarElemento( int posicao){
        if(posicao < this.tamanho){
            for(int i = posicao; i< this.tamanho; i++){

                this.vetor[i] = this.vetor[i+1];
                this.vetor[tamanho-1]= null;


            }
            this.tamanho--;
        }else{
            System.out.println("Pposição vazia");
        }

    }



    public int tamanho(){
        return this.tamanho;
    }
    public T buscar(int posicao){

            for(int i = 0; i< vetor.length; i++){
                if(  i == posicao ){
                    return vetor[i];
                }
            }
       return null;
    }
    public void aumentarCapacidade(){
        if(this.tamanho == this.vetor.length){
            T[] aumentaCapacidade = (T[])new Object[this.vetor.length*2];
            for(int i = 0; i<this.vetor.length; i++){
                aumentaCapacidade[i] = this.vetor[i];
            }
            this.vetor = aumentaCapacidade;
        }


    }
    @Override
    public String toString() {
        return "VetorG{" +
                "vetor=" + Arrays.toString(vetor) +
                '}';
    }
}
