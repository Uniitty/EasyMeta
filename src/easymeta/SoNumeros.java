/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easymeta;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

// <<<NÃO MEXER>>>
/*Esse método pode ser utilizado por qualquer JTextField para impedir 
o usuário de digitar qualquer coisa que não seja o especificado na 
linha "super.insertString(offs, str.replaceAll("[^0-9]", ""), a);.
Pode ser utilizado em qualquer método ou programa*/
/**
 *
 * @author Alan
 */
public class SoNumeros extends PlainDocument
{
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        // fields don't want to have multiple lines.  We may provide a field-specific
        // model in the future in which case the filtering logic here will no longer
        // be needed.
        Object filterNewlines = getProperty("filterNewlines");
        if ((filterNewlines instanceof Boolean) && filterNewlines.equals(Boolean.TRUE)) {
            if ((str != null) && (str.indexOf('\n') >= 0)) {
                StringBuilder filtered = new StringBuilder(str);
                int n = filtered.length();
                for (int i = 0; i < n; i++) {
                    if (filtered.charAt(i) == '\n') {
                        filtered.setCharAt(i, ' ');
                    }
                }
                str = filtered.toString();
            }
        }
        super.insertString(offs, str.replaceAll("[^0-9]", ""), a);
    }    
    
    
}
