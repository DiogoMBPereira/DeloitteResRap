/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.deloitteresrapid;

/**
 *
 * @author Utilizador
 */
public class Objet2 {
    private int var2;
    private String randString;
    
    public Objet2( int var2, String randString)
    {
        this.var2 = var2;
        this.randString = randString;
    }
    public Objet2()
    {
        this.var2 = 0;
        this.randString = "";
    }
    
     public int getVar()
    {
        return var2;
    }
       public String getString()
    {
        return randString;
    }
     
     @Override
    public String toString()
    {
        String text= "";
        text += getVar() + " ";
        text += getString();
        
        return text;
    }
}
