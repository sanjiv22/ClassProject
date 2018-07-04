/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject.Inheritance;

/**
 *
 * @author sanji
 */
public class ClassB extends ClassA{
    int k;
   
    void showk(){
        System.out.println("k:"+k);
    }
    
    void sum()
    {
        int sum= i+j+k;
        System.out.println("sum of i+j+k:"+ sum);
    }
    
}
