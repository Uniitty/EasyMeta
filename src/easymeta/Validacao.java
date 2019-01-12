/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easymeta;

/**
 *
 * @author Alan
 */
public class Validacao 

{
    private double spreed, spreed2, spreed3, spreed4, dinheiro, dinheiro2, dinheiro3 , dinheiro4; // variáveis de instância

    
    public void setSpreed (double x, double y) // metodo para calcular o spreed
    {
        spreed = ((x*y)*0.20);
        spreed2 = (spreed/100)*125;
        spreed3 = (spreed/100)*150;
        spreed4 = (spreed/100)*175;
                
        
    }
    public double getSpreed () 
    {
                return spreed;
    }
       public double getSpreed2 () 
    {
                return spreed2;
    }
          public double getSpreed3 () 
    {
                return spreed3;
    }
             public double getSpreed4 () 
    {
                return spreed4;
    }
    
    public void setDinheiro (double x, double y) //metodo para entregar resultado em pontos
            {
             dinheiro = ((y/0.20)/x);
             dinheiro2 = (dinheiro/100)*125;
             dinheiro3 = (dinheiro/100)*150; 
             dinheiro4 = (dinheiro/100)*175; 
            }
            
    public double getDinheiro ()
        {
            return dinheiro;
        }
     public double getDinheiro2 ()
        {
            return dinheiro2;
        }
      public double getDinheiro3 ()
        {
            return dinheiro3;
        }
       public double getDinheiro4 ()
        {
            return dinheiro4;
        }
    
    
}
