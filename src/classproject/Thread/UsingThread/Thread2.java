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
public class Thread2 extends Thread{
    
    @Override
    public  void run(){
        
        try {
            for (int j = 1; j<=5; j++) {
                System.out.println("\tFrom thread2 : j : " + j);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Child Interrupted");
        }
        System.out.println("Exit From Thread 2");
    }
}
