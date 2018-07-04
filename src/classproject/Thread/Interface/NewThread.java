/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject.Thread.Interface;

/**
 *
 * @author sanji
 */
public class NewThread implements Runnable{
    Thread t;

    public NewThread() {
        //create a new second thread
        t= new Thread(this,"Demo Thread");
        System.out.println("Child Thread");
        t.start();
    }
    
    public void run(){
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("child Thread: "+ i);
           //     Thread.sleep(500);
                
            }
        } catch (Exception e) {
            System.out.println("Child Interrupted");
        }
        System.out.println("Exiting child thread");
        
    }
    
}


class ThreadDemo{
    public static void main(String[] args) {
        new NewThread();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread: "+ i);
              //  Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Exiting Main Thread");
    }
}

