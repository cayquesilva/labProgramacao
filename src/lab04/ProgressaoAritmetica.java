/*Aluno 1: <Cayque Rennã Ferreira Silva*/
package lab04;

/**
 * Classe de Progressão Aritmética.
 *
 * @author   Cayque Rennã Ferreira Silva, cayque.ti@gmail.com
 * @version 1.0
 * <br>
 * Copyright (C) 1999 Universidade Estadual da Paraíba.
 */
public class ProgressaoAritmetica {
    
    private int primeiroTermo;
    private int proximoTermo;
    private int razao;

    /**
     * Cria a progressão aritmética recebendo o primeiro termo e a razão.
     * @param primeiroTermo
     *                      Recebe o primeiro termo da PA
     * @param razao 
     *                      Recebe a razão da PA
     */
    public ProgressaoAritmetica(int primeiroTermo, int razao) {
        this.primeiroTermo = primeiroTermo;
        this.razao = razao;
    }

    /**
     * Retorna o primeiro termo da PA
     * O próximo termo recebe o primeiro termo da PA.
     * @return O primeiro termo da pa
     */
    public int getPrimeiroTermo() {
        proximoTermo=primeiroTermo;
        return primeiroTermo;
    }

    /**
     * Recupera a razão da PA
     * @return A razão da PA
     */
    public int getRazao() {
        return razao;
    }
    
    /**
     * Incrementa o proximo termo com a razão da pA
     * Retorna o proximo termo da pA.
     * @return O proximo termo da PA.
     */
    public int getProximoTermo(){
        proximoTermo+=getRazao();
        return proximoTermo;
    }
    
    /**
     * Retorna o termo indicado ao chamar a função.
     * @param num
     *          Termo desejado para ser recuperado da PA.
     * @return O termo Desejado da PA
     */
    public int getTermo(int num){
        int termo = (getPrimeiroTermo()+(num-1)*getRazao());
        proximoTermo=termo;
        return termo;
    }
    
    /**
     * Gera uma String com todos os termos da PA.
     * @param num
     *              A quantidade de termos que a String irá mostrar.
     * @return String com a quantidade de termos desejados.
     */
    public String geraTermos(int num){
        String termos;
        termos=("["+getPrimeiroTermo());
        for(int i = 1;i < num-1; i ++){
            termos+=(","+getProximoTermo());
        }termos+=(","+getProximoTermo()+"]");
        return termos;
    }
    
}
