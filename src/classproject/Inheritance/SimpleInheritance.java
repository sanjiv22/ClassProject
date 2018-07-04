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
public class SimpleInheritance {
    
    public static void main(String[] args) {
        ClassA superob = new ClassA();
        ClassB childob = new ClassB();
        //from super class
        superob.i=2;
        superob.j=3;
        System.out.println("Call from parent class ClassA");
        superob.showij();
        
        //from child class
        childob.i= 3;
        childob.j=4;
        childob.k = 7;
        System.out.println("Call from parent class ClassB");
        childob.showij();
        childob.showk();
        childob.sum();
        
    }
}
