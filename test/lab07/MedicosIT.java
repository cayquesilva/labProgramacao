/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Cayque
 */
public class MedicosIT {
    
    private Medicos med;
    
    
    @Before
    public void testeCriarObjetos() throws Exception{
        med = new Medicos("Cayque",1235468);
    }
    
    @Test
    public void testaSetPacientes(){
        Assert.assertTrue(med.setQuantPacientes(0));
        Assert.assertTrue(med.setQuantPacientes(100));
        Assert.assertTrue(med.setQuantPacientes(1));
        Assert.assertFalse(med.setQuantPacientes(-1));
        Assert.assertFalse(med.setQuantPacientes(-134));
    }
    
    @Test
    public void testaSetDespesaCongressos(){
        Assert.assertTrue(med.setDespesaCongressos(0));
        Assert.assertTrue(med.setDespesaCongressos(100));
        Assert.assertTrue(med.setDespesaCongressos(1));
        Assert.assertFalse(med.setDespesaCongressos(-1));
        Assert.assertFalse(med.setDespesaCongressos(-134));
    }
    
    
}
