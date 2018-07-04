/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject.Thread;

/**
 *
 * @author sanji
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("current thread"+ t);
        
        //getName function use
        System.out.println("getName" + t.getName());
        
        //getPriority function use
        System.out.println("getPriority" + t.getPriority());
        
        //isAlive function use
        System.out.println("isAlive" + t.isAlive());
        
        //change the name of the thread
        t.setName("My thread");
        
        System.out.println("After name change"+ t);
        try {
            for(int n=5; n>0; n--){
            System.out.println(n);
            Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Main Thread Interrupted");
            
        }
        
        
    }
    
}
