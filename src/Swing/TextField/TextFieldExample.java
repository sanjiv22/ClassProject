/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.TextField;

/**
 *
 * @author Manish Shrestha
 */
import javax.swing.*;

public class TextFieldExample {
    public static void main(String args[])
    {
        JFrame f=new JFrame("Texfield Example");
        
        JTextField t1,t2;
        t1=new JTextField("TextField");
        t1.setBounds(50,100,200,30);
        t2=new JPasswordField("Password");
        t2.setBounds(50,150,200,30);
        f.add(t1);
        f.add(t2);
        f.setSize(400, 400);
        f.setLayout(null);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
     f.setVisible(true);
        
    }

   
}
