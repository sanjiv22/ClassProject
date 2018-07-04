/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject.Thread.UsingThread;

/**
 *
 * @author sanji
 */
public class Thread3  extends Thread{
    @Override
    public  void run(){

            for (int k = 1; k <=5; k++) {
                System.out.println("\tFrom thread 3 : k : " + k); 
            }
        System.out.println("Exit From Thread 3");
    }
    
}
