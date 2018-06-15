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
public class TaxistaIT {

    private Taxista tax;

    @Before
    public void testaCriarObjeto() throws Exception{
        tax = new Taxista("Cayque",6549543);
    }
    
    @Test
    public void testaSetKmAnual(){
        Assert.assertFalse(tax.setKmAnual(-20));
        Assert.assertFalse(tax.setKmAnual(-5));
        Assert.assertTrue(tax.setKmAnual(0));
        Assert.assertTrue(tax.setKmAnual(125));
    }
    
    @Test
    public void testaSetPassageirosAnual(){
        Assert.assertFalse(tax.setPassageirosAnual(-20));
        Assert.assertFalse(tax.setPassageirosAnual(-5));
        Assert.assertTrue(tax.setPassageirosAnual(0));
        Assert.assertTrue(tax.setPassageirosAnual(125));
    }
    
}
