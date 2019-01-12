
package easymeta;
import java.text.DecimalFormat;

/**
 *METODO PARA CONVERTER O NUMERO PARA STRING E DEVOLVER AS DECIMAIS FORMATADAS, NESSE CASO SEM NENHUM NÚMERO APÓS A VIRGULA.
 * @author Alan
 */
public class doubleDuasCasas 
{
    
    private String numeroConvertido = "null";
    
    
    
    public String getConverterDouble (double d) //recebe o parâmetro da classe principal que foi digitado pelo usuário e tratado nos métodos get ou set da classe VALIDACAO
    {
    numeroConvertido = Double.toString(d);
    DecimalFormat f = new DecimalFormat("0"); /*essa linha define que não havera numero apos a virgula. Caso precise de casas decimais basta inserir "0,000.00 etc*/
    numeroConvertido = f.format(d);
    return numeroConvertido;
   }

}

    
