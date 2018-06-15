/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author Lab-NTM-01
 */
public class Sala {

    
    static EnumPosicao OCUPADO,LIVRE;
    
    private int numeroDeLinhas;
    private int numeroDeColunas;
    private final char obstaculo='O';
    private final char robo='R';
    private static char posicoes[][] = new char[10][10];
    private boolean salaVazia=true;
    
    private EnumPosicao tipoPosicao;
    
    
    public Sala(int numeroDeLinhas, int numeroDeColunas) {
        this.numeroDeLinhas = numeroDeLinhas;
        this.numeroDeColunas = numeroDeColunas;
        for(int i=0;i<numeroDeLinhas;i++){
            for(int j=0;j<numeroDeColunas;j++){
                System.out.print("|");
                posicoes[i][j]=' ';
            }
            System.out.println("");
        }
    }

    public static char[][] getPosicoes() {
        return posicoes;
    }

    public int getNumPosicoesHorizontais() {
        return numeroDeLinhas;
    }

    public int getNumPosicoesVerticais() {
        return numeroDeColunas;
    }
    
    public boolean isVazia(){
        for(int i=0;i<getNumPosicoesHorizontais();i++){
            for(int j=0;j<getNumPosicoesVerticais();j++){
                if(getPosicoes()[i][j]!=' '){
                    salaVazia=false;
                }
            }
        }
        return salaVazia;
    }
    
    public boolean inserirObstaculo(int posicaoHorizontal, int posicaoVertical){
        if(isPosicaoLivre(posicaoHorizontal, posicaoVertical)){
            posicoes[posicaoHorizontal][posicaoVertical]='O';
            return true;
        }else{
            System.out.println("A posição já está ocupada!");
            return false;
        }
    }
    
    public boolean posicaoValida(int posicaoHorizontal, int posicaoVertical){
        if(isPosicaoLivre(posicaoHorizontal, posicaoVertical) && 
            posicaoHorizontal<posicoes.length && posicaoVertical<posicoes[1].length &&
            posicaoHorizontal>=0 && posicaoVertical>=0){
            return true;
        }else{
            return false;
        }
        
    }
    
    public boolean isPosicaoLivre(int posicaoHorizontal, int posicaoVertical){
        if(posicaoHorizontal<posicoes.length && posicaoVertical<posicoes[0].length &&
                posicaoHorizontal>=0 && posicaoVertical>=0){
            return posicoes[posicaoHorizontal][posicaoVertical]==' ';
        }else{
            return false;
        }
    }
    
    public boolean setPosicao(int posicaoHorizontal, int posicaoVertical,EnumPosicao tipoPosicao){
        if(isPosicaoLivre(posicaoHorizontal, posicaoVertical) && tipoPosicao==LIVRE && 
                posicaoValida(posicaoHorizontal, posicaoVertical)){
            this.tipoPosicao = Sala.LIVRE;
            posicoes[posicaoHorizontal][posicaoVertical]=' ';
            return true; //falta verificar
        }else if(isPosicaoLivre(posicaoHorizontal, posicaoVertical) && tipoPosicao==OCUPADO && 
                posicaoValida(posicaoHorizontal, posicaoVertical)){
            posicoes[posicaoHorizontal][posicaoVertical]='O';
            this.tipoPosicao = Sala.OCUPADO;
            return true; // falta verificar
        }else{
            return false;
        }
    }
    
    
}
