/**
 * Classe de teste de criação de comentários.
 *
 * @author   Cayque Rennã Ferreira Silva, cayque.ti@gmail.com
 * @version 1.0
 * <br>
 * Copyright (C) 1999 Universidade Estadual da Paraíba.
 */
package lab08;

import org.junit.Test;

public class ComentariosIT {
    
    private Comentarios comentario;
    /**
     * Testa a instância do Objeto.
     */
    @Test
    public void testeInstanciarComentario(){
        
        try{
            comentario = new Comentarios(11,"asdqwe");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
        try{
            comentario = new Comentarios(2,"");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        
        try{
            comentario = new Comentarios(0,"qweasdqweasdqweasdqweasdqweasdqweasdqweasdqweasdqweasdqweasd"
                    + "qweasdqweasdqweasdqweasdqweasdqweasdqweasdqweasdqweasdqweasd"
                    + "qweasdqweasdqweasdqweasdqweasdqweasdqweasdqweasdqweasdqweasd");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        
        try{
            comentario = new Comentarios(-3,"asdqweasd");
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
    }   
}
