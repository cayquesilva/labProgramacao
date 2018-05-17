/**
 * Classe de testes da classe MinhaCDTeca.
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
public class MinhaCDtecaIT {
    
    private MinhaCDteca minhateca,minhateca2,minhateca3;
    private CD cd, cd2;
    
    /**
     * Testa a criação de Objetos.
     * @throws Exception Caso haja erro
     */
    @Before
    public void criaObjetos() throws Exception{
        minhateca = new MinhaCDteca();
        minhateca2 = new MinhaCDteca();
        minhateca3 = new MinhaCDteca();
        cd = new CD("Cayque","É Show",10);
        cd.adicionaFaixa("musica"); 
        cd.setTitulo("perfeito");
        minhateca.adicionaCD(cd);  
    }
    
    /**
     *Testa a adição de CDs.
     */
    @Test
    public void testaAdicionaCd(){
        
        Assert.assertFalse(minhateca.adicionaCD(null));
        Assert.assertTrue(minhateca.adicionaCD(cd));
        Assert.assertFalse(minhateca2.adicionaCD(cd2));
    }
    
    /**
     *Testa a remoção de Cds.
     */
    @Test
    public void testaRemoverCd(){
        Assert.assertFalse(minhateca.removeCD("flews"));
        Assert.assertTrue(minhateca.removeCD("perfeito"));
        Assert.assertFalse(minhateca.removeCD("manolo"));
    }
    
    /**
     *Testa a apresentação das informações dos Cds.
     */
    @Test
    public void testaToString(){
        
        Assert.assertTrue(minhateca.toString(),true);
    }
}
