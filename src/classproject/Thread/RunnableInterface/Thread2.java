/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject.Thread.RunnableInterface;

/**
 *
 * @author sanji
 */
public class Thread2 implements Runnable{
    
     Thread t;

    public Thread2() {
        //create a new second thread
        t= new Thread(this," Thread 2");
        System.out.println("Child Thread");
        t.start();
    }
     @Override
     public void run()
    {
        try {
            for (int j = 1; j <=5; j++) {
                System.out.println("From Thread 2 :j :"+ j);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Child Interrupted");
        }
        System.out.println("Exit from Thread 2");
    }
}
