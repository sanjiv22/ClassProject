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
public class Thread1 implements Runnable{
     Thread t;

    public Thread1() {
        //create a new second thread
        t= new Thread(this," Thread 1");
        System.out.println("Child Thread");
        t.start();
    }
    
    @Override
    public void run()
    {
        try {
            for (int i = 1; i <=5; i++) {
                System.out.println("From Thread 1 :i :"+ i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("Child Interrupted");
        }
        System.out.println("Exit from Thread 1");
    }
    
}
