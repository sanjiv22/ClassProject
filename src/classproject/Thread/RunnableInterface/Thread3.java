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
public class Thread3 implements Runnable{
    
     Thread t;

    public Thread3() {
        //create a new second thread
        t= new Thread(this," Thread 3");
        System.out.println("Child Thread");
        t.start();
    }
     @Override
     public void run()
    {
       
            for (int k = 1; k <=5; k++) {
                System.out.println("From Thread 3 :k :"+ k);
              
            }
       
        System.out.println("Exit from Thread 3");
    }
}
