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
public enum EnumPosicao {
        LIVRE(1,"Livre"),OCUPADO(2,"Ocupado");

        private final int tipo;
        private final String nome;

        private EnumPosicao(int tipo,String nome){
            this.tipo=tipo;
            this.nome=nome;
        }

        public int getTipo() {
            return tipo;
        }
        
        public String getNome(){
            return nome;
        }
    }
