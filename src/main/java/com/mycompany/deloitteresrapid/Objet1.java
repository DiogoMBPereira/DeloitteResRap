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
public class Objet1 {
    private int var1;
    
    public Objet1( int var1)
    {
        this.var1 = var1;
    }
    
    public Objet1()
    {
        this.var1 = 0;
    }
    
    public int getVar()
    {
        return var1;
    }
    
    @Override
    public String toString()
    {
        String text= "";
        text += getVar();
        
        return text;
    }
    
}
