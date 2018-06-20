package lab08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Classe de criação de Produtos e Adição de Comentários.
 *
 * @author   Cayque Rennã Ferreira Silva, cayque.ti@gmail.com
 * @version 1.0
 * <br>
 * Copyright (C) 1999 Universidade Estadual da Paraíba.
 */
public class Produto {
    
    private String nome;
    private List<Comentarios> comentarios;
    private int qntComentarios=0,maiorNota,menorNota,contadorSazonal=0;
    private double notaNaMosca=0;
    private String[] comentariosRelevantes = new String[2];
    
    /**
     * Construtor do produto.
     * @param nome 
     * obrigatório o preenchimento do nome.
     */
    public Produto(String nome) {
        if(nome == null || "".equals(nome)){
            throw new IllegalArgumentException("É obrigatório o nome do produto!");
        }else{
            comentarios = new ArrayList();
            this.nome = nome;
        }
    }

    /**
     * Retorna o nome do produto.
     * @return 
     * Nome do produto
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna os comentários sobre o produto.
     * @return 
     * comentários do produto
     */
    public boolean getComentarios() {
        if((comentarios == null || comentarios.isEmpty()) || qntComentarios == 0){
            throw new NullPointerException("Não existe comentário sobre esse produto!");
        }else{
            for (Comentarios comentario : comentarios) {
                if(comentario.getComentario() != null && !"".equals(comentario.getComentario())){
                    System.out.println(comentario.getComentario());
                }
            }
            return true;
        }  
    }

    /**
     * Adiciona comentários para o produto em questão.
     * @param nota
     * nota dada ao produto. entre -2 e 2
     * @param comentario
     * comentário dado ao produto. até 140 caracteres.
     * @return 
     * true caso seja possível realizar a ação.
     */
    public boolean setComentarios(int nota, String comentario) {
        if(comentario.length()>0 && comentario.length() < 140){
            if(nota >=-2 && nota <=2){
                comentarios.add(new Comentarios(nota, comentario));
            this.qntComentarios++; 
            return true;
            }else{
                throw new NullPointerException("Nota inválida, utilize notas entre -2 e 2 !");
            }
        }else{
            throw new NullPointerException("comentário vazio ou acima do limite de caracteres.");
        }
    }
    
    /**
     * Calcula a média aritmética de todas as notas.
     * @return 
     * média das notas dadas ao produto.
     */
    public double estrategiaSimplesNotaNaMosca(){
        System.out.println("Estratégia simples - Nota Na Mosca");
        System.out.println("--- "+getNome()+" ---");
        if(!comentarios.isEmpty()){
            comentarios.forEach((comentario) -> {
                notaNaMosca+= comentario.getNota();
            });
            return notaNaMosca/comentarios.size();
        }else{
            return notaNaMosca;
        } 
    }
    
    /**
     * Retorna os comentários mais relevantes dados aos produtos, sendo eles 
     * o melhor e o pior comentário.
     * @return 
     * comentários mais relevantes.
     */
    public boolean estrategiaSimplesComentariosRelevantes(){
        System.out.println("Estratégia Simples Comentários Relevantes");
        System.out.println("--- "+getNome()+" ---");
        if(comentarios.isEmpty()){
            throw new IndexOutOfBoundsException("Não existem comentários.");
        }else{
            maiorNota=comentarios.get(0).getNota();
            menorNota=maiorNota;
            if(comentarios.size() == 1){
                comentariosRelevantes[0]=comentarios.get(0).getComentario();
                System.out.println("Único comentário - "+comentariosRelevantes[0]);
                return true;
            }
            if(!comentarios.isEmpty() && comentarios.size() >1){
               comentarios.forEach((comentario) -> {
                    if(comentario.getNota() > maiorNota){
                        maiorNota=comentario.getNota();
                        comentariosRelevantes[0]=comentario.getComentario();
                    }
                    if(comentario.getNota() <= menorNota){
                        menorNota=comentario.getNota();
                        comentariosRelevantes[1]=comentario.getComentario();
                    }
                });
                System.out.println("Melhor - "+comentariosRelevantes[0]);
                System.out.println("Pior - "+comentariosRelevantes[1]);
                return true;   
            }
            return true;
        }
    }
    
    /**
     * Calcula a média aritmética dos 3 ultimos comentários dados aos produtos.
     * caso não existam 3, ele retorna a média das avaliações existentes, sendo no máximo 3 delas.
     * @return 
     * média dos ultimos comentários dados ao produto, sendo no máximo 3 notas.
     */
    public double estrategiaSazonal(){
        System.out.println("Estratégia sazonal - Nota Na Mosca");
        System.out.println("--- "+getNome()+" ---");
        if(comentarios.isEmpty()){
            throw new IndexOutOfBoundsException("Não existem notas para serem calculadas!");
        }else{
            Collections.sort(comentarios, (Comentarios o1, Comentarios o2) -> o1.getData().compareTo(o2.getData()));
            Collections.reverse(comentarios);
            if(comentarios.size() <= 3){
                for(int i=0;i<comentarios.size();i++){
                    notaNaMosca += comentarios.get(i).getNota();
                    contadorSazonal++;
                }
            }else{
                for(int i=0;i<3;i++){
                    notaNaMosca += comentarios.get(i).getNota();
                    contadorSazonal++;
                }
            }
        }
        return notaNaMosca/contadorSazonal++;
    }
    
    /**
     * retorna os Comentários mais relevantes, selecionando-os pelas datas de avaliação.
     * @return 
     * comentários mais relevantes por data. Ultimos 2 comentários.
     */
    public boolean estrategiaSazonalComentarioRelevante(){
        System.out.println("Estratégia sazonal - Comentários mais Relevantes");
        System.out.println("--- "+getNome()+" ---");
        if(!comentarios.isEmpty()){
            if (comentarios.size() > 1) {
                Collections.sort(comentarios, (Comentarios o1, Comentarios o2) -> o1.getData().compareTo(o2.getData()));
                Collections.reverse(comentarios);
                System.out.println(comentarios.get(0).getComentario());
                System.out.println(comentarios.get(1).getComentario());  
                return true;
            }else{
                System.out.println(comentarios.get(0).getComentario());
                return true;
            }
        }else{
            throw new IndexOutOfBoundsException("Não existem comentários a serem mostrados!");
        }
    }
}
