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
public class CaminhoneirosIT {
    
    private Caminhoneiros c1;
    
    @Before
    public void criaObjetos() throws Exception{
        c1 = new Caminhoneiros("Cayque",123456);
        c1.setKmAnual(120000);
        c1.setToneladas(12);
        c1.setTributação(0);
    }
  
    @Test
    public void testaSetKmAnual(){
        Assert.assertFalse(c1.setKmAnual(-20));
        Assert.assertFalse(c1.setKmAnual(-5));
        Assert.assertTrue(c1.setKmAnual(0));
        Assert.assertTrue(c1.setKmAnual(125));
    }
    
    @Test
    public void testaSetToneladas(){
        Assert.assertFalse(c1.setToneladas(-1));
        Assert.assertTrue(c1.setToneladas(0));
        Assert.assertTrue(c1.setToneladas(1));
        Assert.assertTrue(c1.setToneladas(100));
        Assert.assertFalse(c1.setToneladas(-55));
    }
}
