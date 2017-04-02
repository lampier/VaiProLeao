package test.java;



import cdp.*;
import org.junit.*;

/*
*
 *
 * @author Lampier
 */
public class Test {
    
    public Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testaImposto1() {
        ImpostoRenda imposto = new ImpostoRenda();
        imposto.calculaImposto(2000);
        Assert.assertEquals(imposto.getImpostoCalculado(), 150);        
    }
    @Test
    public void testaImposto2() {
        ImpostoRenda imposto = new ImpostoRenda();
       imposto.calculaImposto(4000);
        Assert.assertEquals(imposto.getImpostoCalculado(), 600);        
    }
    @Test
    public void testaImposto3() {
        ImpostoRenda imposto = new ImpostoRenda();
        imposto.calculaImposto(6000);
        Assert.assertEquals(imposto.getImpostoCalculado(), 1350);        
    }
    @Test
    public void testaImposto4() {
        ImpostoRenda imposto = new ImpostoRenda();
        imposto.calculaImposto(8000);
        Assert.assertEquals(imposto.getImpostoCalculado(), 1800);        
    }
    
}
