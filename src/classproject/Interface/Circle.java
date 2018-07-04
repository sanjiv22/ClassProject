/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject.Interface;

/**
 *
 * @author sanjiv
 */
public  class Circle implements Shape {
 
   private final double radius;
   
   public Circle(double r)
   {
       this.radius=r;
   }
   
    @Override
    public void draw()
    {
        System.out.println("This is a Circle");
    }
 
    @Override
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    
    public double getRadius()
    {
        return this.radius;
    }
}
