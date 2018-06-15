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
public class ProfessoresIT {
   
    private Professores prof;
    
    @Before
    public void testeCriarObjetos() throws Exception{
        prof = new Professores("Cayque",3216574);
    }
   
    @Test
    public void testeSetSalario(){
        Assert.assertFalse(prof.setSalario(0));
        Assert.assertFalse(prof.setSalario(-800));
        Assert.assertFalse(prof.setSalario(-150));
        Assert.assertTrue(prof.setSalario(800));
        Assert.assertTrue(prof.setSalario(1235));
        Assert.assertTrue(prof.setSalario(1));
    }
    
    @Test
    public void testeSetMaterial(){
        Assert.assertTrue(prof.setMaterialDidatico(0));
        Assert.assertFalse(prof.setMaterialDidatico(-800));
        Assert.assertFalse(prof.setMaterialDidatico(-150));
        Assert.assertTrue(prof.setMaterialDidatico(800));
        Assert.assertTrue(prof.setMaterialDidatico(1235));
        Assert.assertTrue(prof.setMaterialDidatico(1));
    }
   
}
