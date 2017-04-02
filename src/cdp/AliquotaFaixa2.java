
package cdp;
 /*
*
 *
 * @author Lampier
 */
public class AliquotaFaixa2 implements CalculoImposto {
  
    @Override
    public double calculaDescontoImposto(double rendimento) {
        double calculado = rendimento * 0.075;
        System.out.println("Golpers a serem pagos: R$ " + calculado);
        return calculado;
    }
    
}
