/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.MethodsExample;

import java.util.Scanner;

/**
 *
 * @author krzysiek
 */
public class Methods{
    
    static String put;
    
    public String Read(String put){
        Scanner read = new Scanner(System.in);
        System.out.print("Podaj nazwe psa: ");
        this.put = read.next();
        read.close();
        return this.put;
    }
    
    public String Answer(String put){
        System.out.print("Twoj pies to: " + put + System.lineSeparator());
        return put;
    }
    
    public static void main( String[] args ){ 
        new Methods().Read(put);
        new Methods().Answer(put);        
    }
}
