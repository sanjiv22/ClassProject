/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject.ExceptionHandling;

/**
 *
 * @author sanji
 */
public class Method2 {
    
    public void fun2() throws Exception{
        int a=5;
        int b=0;
        int c=a/b;
        throw new ArithmeticException();
    }
    
}
