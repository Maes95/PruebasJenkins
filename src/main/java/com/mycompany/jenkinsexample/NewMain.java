/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jenkinsexample;

/**
 *
 * @author michel
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewMain m = new NewMain();
        int c = m.suma(2,4);
        System.out.println(c);
    }
    
    public int suma(int a, int b){
        return a + b;
    }
    
}
