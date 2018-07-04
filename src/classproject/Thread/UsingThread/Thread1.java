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
public class Thread1 extends Thread{
    
    @Override
    public  void run(){
        
        try {
            for (int i = 1; i <=5; i++) {
                System.out.println("\tFrom thread 1 : i: " + i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("Child Interrupted");
        }
        System.out.println("Exit From 1");
    }
   
    
}
