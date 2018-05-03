/*Aluno 1: <Cayque Rennã Ferreira Silva*/
package lab04;

/**
 * Classe de sequencia de Fibonacci.
 *
 * @author   Cayque Rennã Ferreira Silva, cayque.ti@gmail.com
 * @version 1.0
 * <br>
 * Copyright (C) 1999 Universidade Estadual da Paraíba.
 */
public class SerieFibonnacci {
    
    private int tamanho;

    /**
     * Armazena o tamanho da série de Fibonacci de acordo com o parãmetro informado.
     * @param tamanho 
     *              Quantidade de termos existentes na sequencia de Fibonacci.
     */
    public SerieFibonnacci(int tamanho) {
        this.tamanho = tamanho;
    }
    
    /**
     * Recupera o tamanho da série de Fibonacci.
     * @return Quantidade de termos da Série de Fibonacci.
     */
    public int getTamanho() {
        return tamanho;
    }
        
    /**
     * Gera a sequencia de Fibonacci número por número.
     * @param num
     *              Tamanho da sequência de Fibonacci
     * @return Cada número da sequencia de fibonacci de acordo com o tamanho informado por 
     * parâmetro
     */
    public int seqFibonacci(int num){
        int atual=0;
        int anterior=0;
        for(int i =1;i<=num;i++){
            if(i==1){
                atual=1;
                anterior=0;
            }else{
                atual+=anterior;
                anterior=atual-anterior;
            }
        }
    return atual;
    }

    
    
}
