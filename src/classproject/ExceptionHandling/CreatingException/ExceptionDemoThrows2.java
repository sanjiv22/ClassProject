/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package classproject.ExceptionHandling.CreatingException;

/**
 *
 * @author sanji
 */ class myexception extends Exception{
    myexception(String s)
    {
        super(s);
    }
}
public class ExceptionDemoThrows2  {
 
    static void validateage(int age) throws myexception{
        if (age<18)
        {
            throw new myexception("not valid to cast to vote");
        }
        else
        {
            System.out.println("Valid to vote");
        }
    }
    public static void main(String[] args) throws myexception {
       
            validateage(Integer.parseInt(args[0]));
       
        System.out.println("Execution of throw completed");
    }
}
