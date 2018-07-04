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
public class Rectangle implements Shape{
    private final double length;
    private final double breadth;
    
    public Rectangle(double l, double b){
        this.length=l;
        this.breadth=b;
    }
    @Override
    public void draw()
    {
        System.out.println("this is a rectangle");
    }
    
    @Override
    public double getArea()
    {
        return this.length*this.breadth;
    }
    
    public double getLength()
    {
        return this.length;
    }
    public double getBreadth()
    {
        return this.breadth;
    }
}
