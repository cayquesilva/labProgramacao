/**
 * Classe de criação de CDs.
 *
 * @author   Cayque Rennã Ferreira Silva, cayque.ti@gmail.com
 * @version 1.0
 * <br>
 * Copyright (C) 1999 Universidade Estadual da Paraíba.
 */
package lab06;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Cayque
 */
public class CD {
    
    private String artista;
    private String titulo;
    private String trilhaPrincipal;
    private int maxFaixas = 0;
    private List<String> faixas;

    /**
     * 
     * @param artista
     *          O nome do artista
     * @param titulo
     *          O título do CD
     * @param maxFaixas 
     *          O número máximo de faixas do CD
     */
    public CD(String artista, String titulo, int maxFaixas) {
        this.artista = artista;
        this.titulo = titulo;
        this.maxFaixas = maxFaixas;
        this.faixas = new ArrayList<String>();
        
    }

    /**
     * 
     * @param artista
     * O nome do Artista
     * @param titulo 
     * O título do CD
     * 
     * As faixas são consideradas por padrão 10.
     */
    public CD(String artista, String titulo) {
        this.artista = artista;
        this.titulo = titulo;
        this.maxFaixas = 10;
        this.faixas = new ArrayList<String>();
    }

    /**
     * Recupera o nome do Artista
     * @return O nome do artista do CD.
     */
    public String getArtista() {
        return artista;
    }

    /**
     * Define o nome do artista
     * @param artista O nome do artista
     */
    public void setArtista(String artista) {
        this.artista = artista;
    }

    /**
     * Recupera o Título do CD
     * @return O título do cd
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define o Título do CD.
     * @param titulo o título do cd.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Recupera a Trilha principal do cd.
     * @return Trilha principal.
     */
    public String getTrilhaPrincipal() {
        return trilhaPrincipal;
    }

    /**
     * Define a trilha principal do cd caso ela exista no CD
     * @param trilhaPrincipal trilha principal.
     * @return valor booleano de acordo com o sucesso da ação.
     */
    public boolean setTrilhaPrincipal(String trilhaPrincipal) {
        if(faixas.contains(trilhaPrincipal)){
            this.trilhaPrincipal = trilhaPrincipal;
            return true;
        }else{
            System.out.println("Não existe essa música no CD!");
            return false;
        }
    }

    /**
     * Recupera as faixas do CD.
     * @return faixas do cd
     */
    public List<String> getFaixas() {
        return faixas;
    }

    /**
     * Define as faixas do CD, adicionando-as na lista do cd, uma por uma.
     * @param faixas faixas do cd. 
     */
    public void setFaixas(List<String> faixas) {
        this.faixas = faixas;
    }

    /**
     * Muda a musica/faixa principal do CD. Obrigatório a faixa existir no CD.
     * @param musica musica desejada a ser a faixa principal.
     * @return resultado booleano de acordo com o sucesso da alteração.
     */
    public boolean mudarPrincipal(String musica){
        if(faixas.contains(musica)){
            this.trilhaPrincipal = musica;
            return true;
        }else{
            System.out.println("Não existe essa música no CD!");
            return false;
        }
    }
    
    /**
     * Recupera a faixa de acordo com o indice desejado.
     * @param faixa faixa desejada (indice) (numero da musica).
     * @return Nome da musica.
     */
    public String getFaixa(int faixa){
        if(faixa>maxFaixas && faixa<0){
            return null;
        }else{
            return faixas.get(faixa);
        }
    }
       
    /**
     * Adiciona musica ao CD, caso existam espaços, de acordo com a definição no construtor
     * @param faixa Nome da musica a ser adicionada.
     * @return valor booleano de acordo com o sucesso da operação.
     */
    public Boolean adicionaFaixa(String faixa){ 
        if(faixas.size() < maxFaixas && !faixas.contains(faixa)){
            faixas.add(faixa);
            return true;
        }
        System.out.println("já existe uma musica com esse nome ou esgotou o limite de faixas do cd.");
        return false;
    }
            
    /**
     * Retorna as características do CD.
     * @return artista, titulo, trilha principal e faixas do CD.
     */
    @Override
    public String toString() {
        return "CD {" + "artista=" + artista + ", titulo=" + titulo + 
                ", trilhaPrincipal=" + trilhaPrincipal + ", faixas=" + faixas + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.artista);
        hash = 73 * hash + Objects.hashCode(this.titulo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CD other = (CD) obj;
        if (!Objects.equals(this.artista, other.artista)) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
    
}
