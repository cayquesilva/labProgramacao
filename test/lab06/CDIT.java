/**
 * Classe de teste da classe CD.
 *
 * @author   Cayque Rennã Ferreira Silva, cayque.ti@gmail.com
 * @version 1.0
 * <br>
 * Copyright (C) 1999 Universidade Estadual da Paraíba.
 */
package lab06;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Cayque
 */
public class CDIT {
    
    private CD cd,cd2,cd3;

    /**
     *Testa a criação de Objetos em geral.
     * @throws Exception Caso haja erros.
     */
    @Before
    public void criaObjetos() throws Exception{
        cd = new CD("Cayque","É Show",10);
        cd.adicionaFaixa("musica");
        
        cd2 = new CD("Marcos","Sucesso 2009",5);
        cd2.adicionaFaixa("melodia");
        
        cd3 = new CD("Cayque","É Show",10);
        cd3.adicionaFaixa("musica");
    }
    
    /**
     *Testa as criações do Objeto CD, de acordo com as especificações do Construtor.
     */
    @Test
    public void testaCriarCD(){
        
        try{
            new CD(null,null);
        }catch(Exception e){
            Assert.assertEquals("Erro", "Valores inválidos para Artista e Título",e.getMessage());
        }
        
        try{
            new CD("Artista","Trilha",0);
        }catch(Exception e){
            Assert.assertEquals("Erro", "Valor inválido para o numero de faixas",e.getMessage());
        }
        
        try{
            new CD("Artista","Trilha",-1);
        }catch(Exception e){
            Assert.assertEquals("Erro", "Valor inválido para o numero de faixas",e.getMessage());
        }
        
        try{
            new CD(null,null,-1);
        }catch(Exception e){
            Assert.assertEquals("Erro", "Valores inválidos para Artista, Título e numero de faixas",e.getMessage());
        }
        
        try{
            new CD(null,null,0);
        }catch(Exception e){
            Assert.assertEquals("Erro", "Valores inválidos para Artista, Título e numero de faixas",e.getMessage());
        }
        
        Assert.assertTrue(cd.getArtista()!=null);
        Assert.assertTrue(cd.getTitulo()!=null);
        Assert.assertTrue(cd.getFaixas().size()>0);
        
        try{
            new CD("Cayque","Desenrrolado",10);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    /**
     *Testa a adição de faixas no CD.
     */
    @Test
    public void testaAdicionaFaixa(){

        try{
            cd.adicionaFaixa(null);
        }catch (Exception e){
            Assert.assertEquals("Erro", "Nome de faixa vazio",e.getMessage());
        }
        Assert.assertTrue(cd.adicionaFaixa("musicalidade"));
        Assert.assertFalse(cd.adicionaFaixa("musica"));
    }
       
    /**
     *Testa a mudança da faixa principal do Cd.
     */
    @Test
    public void testaMudarPrincipal(){

        Assert.assertFalse(cd.mudarPrincipal("asdqwe"));
        Assert.assertFalse(cd.mudarPrincipal(null));
        Assert.assertTrue(cd.mudarPrincipal("musica"));
    }
    
    /**
     *Testa se existem objetos iguais.
     */
    @Test
    public void testaEquals(){
        Assert.assertTrue(cd.equals(cd3));
        Assert.assertFalse(cd.equals(cd2));
        Assert.assertFalse(cd2.equals(cd3));    
    }
    
}
