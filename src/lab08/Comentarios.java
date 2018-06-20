package lab08;

import java.time.DateTimeException;
import java.util.Calendar;

/**
 * Classe de criação de Comentários de produtos.
 *
 * @author   Cayque Rennã Ferreira Silva, cayque.ti@gmail.com
 * @version 1.0
 * <br>
 * Copyright (C) 1999 Universidade Estadual da Paraíba.
 */
public class Comentarios {
 
    private int nota;
    private String comentario;
    private final int tamanhoComentario = 140;
    private final Calendar data;

    /**
     * 
     * @param nota
     * Nota para avaliação de produto entre -2 e 2.
     * @param comentario 
     * Comentário sobre o produto avaliado, até 140 caracteres.
     * Recebe também a data da criação do comentário.
     */
    public Comentarios(int nota, String comentario) {
        if(nota <= 2 && nota >= -2){
            this.nota = nota;
        }else{
            throw new IllegalArgumentException("Nota inválida, utilize notas entre -2 e 2");
        }
        if(comentario == null || comentario.length() < 1){
            throw new ArrayIndexOutOfBoundsException("Comentário vazio");
        }else{
            if(comentario.length() > tamanhoComentario){
                throw new ArrayIndexOutOfBoundsException("comentário maior que 140 caracteres");
            }else{
                this.comentario = comentario;
            }
        }
        this.data = Calendar.getInstance();
    }

    /**
     * Retorna a data do comentário.
     * @return 
     * Data do comentário
     */
    public Calendar getData() {
        if(data == null){
            throw new DateTimeException("Data não existente");
        }else{
            return data; 
        }
    }
    
    /**
     * Retorna a nota dada ao produto
     * @return 
     * nota
     */
    public int getNota() {
        return nota;
    }

    /**
     * Retorna o comentário dado ao produto.
     * @return 
     * comentário
     */
    public String getComentario() {
        if(this.comentario == null || "".equals(this.comentario)){
            throw new NullPointerException("Não existem comentários");
        }else{
            return comentario;    
        }
    }
  
}
