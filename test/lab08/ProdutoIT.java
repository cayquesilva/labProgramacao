/**
 * Classe de criação de Discotecas.
 *
 * @author   Cayque Rennã Ferreira Silva, cayque.ti@gmail.com
 * @version 1.0
 * <br>
 * Copyright (C) 1999 Universidade Estadual da Paraíba.
 */
package lab08;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProdutoIT {
    
    private Produto produto, produto2, produto3;
    /**
     * Testa a criação do objeto.
     * @throws Exception 
     */
    @Before
    public void criaObjeto() throws Exception{
        produto = new Produto("feijão");
        
        produto2 = new Produto("Batata");
        produto2.setComentarios(2, "Muito bom esse produto!");
        
        produto3 = new Produto("Cerveja");
        produto3.setComentarios(-1, "Não gostei muito!");
        produto3.setComentarios(1, "Fantástica");
        produto3.setComentarios(2, "Deliciosa, muito boa de fato");
        produto3.setComentarios(2, "Sumpimpa, da vontade de beber mais");
    }
    /**
     * Testa mais criações de objeto.
     */
    @Test
    public void testaCriarObjeto(){
        
        try{
            produto = new Produto("");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
        try{
            produto = new Produto(null);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
        try{
            produto = new Produto("Batata");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    /**
     * Testa adição de comentários
     */
    @Test
    public void testaSetComentarios(){
        try{
            Assert.assertTrue(produto.setComentarios(0, "Muito boa essa marca"));
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        
        try{
            Assert.assertTrue(produto.setComentarios(2, "Sensacional"));
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        
        try{
            Assert.assertFalse(produto.setComentarios(1, ""));
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        
        try{
            Assert.assertFalse(produto.setComentarios(-3, "Muito bom o preço"));        
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

    }
    
    /**
     * Testa recuperação de comentários
     */
    @Test
    public void testaGetComentario(){
        try{
            Assert.assertFalse(produto.getComentarios());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        
        try{
            Assert.assertTrue(produto2.getComentarios());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        
    }
    
    /**
     * Testa calculo de médias
     */
    @Test
    public void testaEstrategiaSimplesNaMosca(){
        
        try{
            System.out.println(produto.estrategiaSimplesNotaNaMosca());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        
        try{
            System.out.println(produto2.estrategiaSimplesNotaNaMosca());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        
        try{
            System.out.println(produto3.estrategiaSimplesNotaNaMosca());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * Testa recuperação de comentários relevantes
     */
    @Test
    public void testaEstrategiaSimplesComentarioRelevante(){
    
        try{    
            Assert.assertTrue(produto3.estrategiaSimplesComentariosRelevantes());
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        
        try{
            Assert.assertTrue(produto2.estrategiaSimplesComentariosRelevantes());
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        
        try{
            Assert.assertFalse(produto.estrategiaSimplesComentariosRelevantes());
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * Testa calculo de médias de acordo com a data de avaliação
     */
    @Test
    public void testaEstrategiaSazonalNotaNaMosca(){
        
        try{
            System.out.println(produto3.estrategiaSazonal());
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        
        try{
            System.out.println(produto2.estrategiaSazonal());
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        
        try{
            System.out.println(produto.estrategiaSazonal());
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * Testa recuperação de comentários relevantes de acordo com a data de avaliação.
     */
    @Test
    public void testaEstrategiaSazonalComentarioRelevante(){
        
        try{
            Assert.assertTrue(produto3.estrategiaSazonalComentarioRelevante());
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
    
}
