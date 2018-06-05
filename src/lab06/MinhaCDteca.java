/**
 * Classe de criação de Discotecas.
 *
 * @author   Cayque Rennã Ferreira Silva, cayque.ti@gmail.com
 * @version 1.0
 * <br>
 * Copyright (C) 1999 Universidade Estadual da Paraíba.
 */
package lab06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Cayque
 */
public class MinhaCDteca {
    
    private List<CD> cds;

    /**
     * Construtor da CDteca.
     */
    public MinhaCDteca() {
        cds = new ArrayList<CD>();
    }
    
    /**
     * Recupera os CDs da CDteca.
     * @return Cds cadastrados na lista.
     */
    public List<CD> getCds() {
        return cds;
    }
    
    /**
     * Adiciona um CD na lista.
     * @param cd CD a ser adicionado.
     * @return Valor booleano de acordo com o sucesso da operação.
     */
    public boolean adicionaCD(CD cd){
        if(cd!=null){
            cds.add(cd);
            return true;
        }else{
            return false;
        }  
    }
    
    /**
     * Adiciona uma coleção de cds a lista.
     * @param cds coleção de cds a serem adicionados.
     * @return valor boleano de acordo com o sucesso da ação.
     */
    public boolean adicionaCDs(Collection<CD> cds){
        return this.cds.addAll(cds);
    }
    
    /**
     * Remove um CD da lista de acordo com seu título.
     * @param titulo titulo do cd a ser removido.
     * @return valor booleano de acordo com o sucesso da operação.
     */
    public boolean removeCD(String titulo){
        int sentinela=1;
        for (Iterator<CD> i = cds.iterator(); i.hasNext();) {
            CD cd = i.next();
            if(cd.getTitulo().equals(titulo)){
                i.remove();
                sentinela=0;
            }
        }
        return sentinela==0; 
    }
    
    /**
     * Remove uma coleção de CDs da lista.
     * @param cds coleção a ser removida.
     */
    public void removeCDs(Collection<CD> cds){
        this.cds.removeAll(cds);
    }
    
    /**
     * Pesquisa um CD na lista por seu título.
     * @param titulo titulo do cd a ser procurado.
     * @return referência da lista, caso o cd seja encontrado.
     */
    public int pesquisaCD(String titulo){
        int referencia=0;
        for(CD a : cds){
            if(a.getTitulo().equals(titulo)){
                referencia = cds.indexOf(a);
            }
        }return referencia;
    }
    
    /**
     * Recupera a quantidaded e CDS que existem na lista.
     * @return quantidade de cds da lista.
     */
    public int numeroDeCDs(){
        return cds.size();
    }

    /**
     * Mostra as caracteristicas da lista da CDteca.
     * @return Título e artista de cada CD presente na CDteca.
     */
    @Override
    public String toString() {
        String retorno="";
        for(CD a : cds){
            retorno+="Título: "+a.getTitulo()+" - Artista: "+a.getArtista()+"\n";
        }
        return "MinhaCDteca \n" + retorno;
    }
}
