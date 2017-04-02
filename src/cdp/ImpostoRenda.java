
package cdp;


/*	
*
 *
 * @author Lampier
 */
public class ImpostoRenda {
    public CalculoImposto imposto;
    public double impostoCalculado;
   
    public void calculaImposto(double rendimento){
        if(rendimento <= 1903.98)
            this.imposto = new AliquotaFaixa1();
        else if(rendimento >= 1903.99 && rendimento <= 2826.65) 
            this.imposto = new AliquotaFaixa2();
        else if(rendimento >= 2826.66 && rendimento <= 3751.05)
            this.imposto = new AliquotaFaixa3();            
        else if(rendimento >=3751.06 && rendimento >= 4664.68)
            this.imposto = new AliquotaFaixa4();
        else if(rendimento >4664.68)
        	this.imposto = new AliquotaFaixa5();
        
        this.impostoCalculado = imposto.calculaDescontoImposto(rendimento);
        
    }

	public double getImpostoCalculado() {
		return impostoCalculado;
	}




    
}

