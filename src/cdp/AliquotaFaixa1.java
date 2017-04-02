
package cdp;
/*
*
 *
 * @author Lampier
 */
public class AliquotaFaixa1 implements CalculoImposto {
    
    @Override
    public double calculaDescontoImposto(double rendimento) {
        System.out.println("Isento!");
        return 0;
    }
   
}