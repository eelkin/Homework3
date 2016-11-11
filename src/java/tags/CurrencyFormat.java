/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tags;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.*;

import model.*;

/**
 *
 * @author eelkin
 */
public class CurrencyFormat extends TagSupport{
    
    private double value;
    
    public void setValue (double value) {
        this.value = value;
    }
    
    @Override
    public int doStartTag() throws JspException {
        try{
          NumberFormat formatter = NumberFormat.getCurrencyInstance();  
          JspWriter out = pageContext.getOut();
          out.print(formatter.format(value));
          
        } catch (IOException ioe) {
          System.out.println(ioe);
        }
        return SKIP_BODY;
    }
    
}
