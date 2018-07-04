/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.Layout.BorderLayout;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author sanji
 */
public class BorderLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(210,200);
        frame.setTitle("Run for the border");
        frame.setLayout(new BorderLayout());
        frame.add(new JButton("north"),BorderLayout.NORTH);
        frame.add(new JButton("south"),BorderLayout.SOUTH);
        frame.add(new JButton("east"),BorderLayout.EAST);
        frame.add(new JButton("west"),BorderLayout.WEST);
        frame.add(new JButton("center"),BorderLayout.CENTER);
        frame.setVisible(true);
    }
    
}
