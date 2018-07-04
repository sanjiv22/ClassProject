/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject.Interface;

/**
 *
 * @author sanji
 */
public class SimpleInterface {
   
    public static void main(String[] args) {
       //ptogramming for interface not implementation
        Shape shape= new Circle(10);
        shape.draw();
        System.out.println("Area="+shape.getArea());
        Circle cir = new Circle(10);
        System.out.println("Radius="+cir.getRadius());
        System.out.println("Area="+cir.getArea());
       
        //switching from one implementation to another class
        shape = new Rectangle(10, 10);
        shape.draw();
        System.out.println("Area="+shape.getArea());
        
    }
}
