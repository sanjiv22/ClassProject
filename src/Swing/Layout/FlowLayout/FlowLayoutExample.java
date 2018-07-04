/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.Layout.FlowLayout;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author sanji
 */
public class FlowLayoutExample extends JFrame{

    public FlowLayoutExample() {
        setTitle("FlowLayout Example");
        setLayout(new FlowLayout());
        setFlowLayout();
        setSize(200,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
    
    private void setFlowLayout(){
        for (int i = 0; i < 20; i++) {
            add(new JButton("Button"+i));
                    }
    }
            
    
    public static void main(String[] args) {
      FlowLayoutExample fl = new FlowLayoutExample();
       
        
    }
    
}
