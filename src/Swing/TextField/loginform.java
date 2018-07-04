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
public class loginform {
    public static void main(String args[])
   {
       
       
       JFrame f = new JFrame("Textfield Example");
       
       JLabel lu=new JLabel("User");
       lu.setBounds(20, 100, 200,30);
       
       JLabel lp= new JLabel("Password");
       lp.setBounds(20, 150, 150, 30);
       
       JTextField t1,t2;
       t1=new JTextField("");
       t1.setBounds(80, 100, 200, 30);
       
       t2=new JPasswordField("");
       t2.setBounds(80, 150, 200, 30);
       
       JButton jb = new JButton("Submit");
       jb.setBounds(80, 200, 80, 30);
       
       JButton jbr = new JButton("Reset");
       jbr.setBounds(170,200,80,30);
       f.add(lu);       
       f.add(t1);
       f.add(lp);
       f.add(t2);
       f.add(jb);
       f.add(jbr);
       f.setSize(400,400);      
       f.setLayout(null);
       f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
   }


}
