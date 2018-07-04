/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.ScrollPane;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author sanji
 */
public class ScrollPaneExample {
    
    public ScrollPaneExample(){
        JFrame f = new JFrame();
        JTextArea area = new JTextArea(); 
        area.setText("nhs\nnhs\nnhs\nnhs\nnhs\nnhs\nnhs\nnhs\nnhs\nnhs\nnhs\nnhs\nnhs\nnhs\nnhs\nnhs\nnhs\nnhs\n");
        JScrollPane scrollPane = new JScrollPane(area);
        area.setBounds(10,10,200,200);
        f.getContentPane().add(scrollPane,BorderLayout.CENTER);
        f.setSize(new Dimension(240,180));
        f.setLocationRelativeTo(null);
        f.add(scrollPane);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       }
    public static void main(String[] args) {
        new ScrollPaneExample();
    }
    
}
