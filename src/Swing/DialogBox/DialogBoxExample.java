/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.DialogBox;

import com.sun.org.apache.bcel.internal.generic.InstructionConstants;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author sanji
 */
public class DialogBoxExample{  //JOPtionPane
    
    public static void main(String[] args) {
         //Obtain user input from JOptionPane input dialog
    String FirstNumber = JOptionPane.showInputDialog("Enter First Integer");
    String SecondNumber = JOptionPane.showInputDialog("Enter Second Integer");
    
    //convert string input into int
    int num1 = Integer.parseInt(FirstNumber);
    int num2 = Integer.parseInt(SecondNumber);
    
    int sum = num1 + num2;
    
    //display result in  JOtionPane message dialog
    //JOptionPane.showMessageDialog(null, "The Sum is:" + sum , "sum of two integer", JOptionPane.PLAIN_MESSAGE);
    
    //custom title and icon
  //  JOptionPane.showMessageDialog (null,"Sum="+sum ,"Sum of Integer",JOptionPane.WARNING_MESSAGE);
    
    //custom title error icon
    // JOptionPane.showMessageDialog (null,"Sum="+sum ,"Sum of Integer",JOptionPane.ERROR_MESSAGE);
   
    
    //icon
        ImageIcon icon = new ImageIcon("C:\\Users\\sanji\\OneDrive\\Documents\\NetBeansProjects\\ClassProject\\src\\Swing\\DialogBox\\icon.png");
         JOptionPane.showMessageDialog (null,"Sum="+sum ,"Sum of Integer",JOptionPane.INFORMATION_MESSAGE,icon);
   
      

    }
       
}
