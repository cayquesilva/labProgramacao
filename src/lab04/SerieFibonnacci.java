/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

/**
 *
 * @author Cayque
 */
public class SerieFibonnacci {
    
    private int tamanho;

    public SerieFibonnacci(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public int getTamanho() {
        return tamanho;
    }
        
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
