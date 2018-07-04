/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.TextArea;

import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author sanji
 */
public class TextAreaExample {

    public TextAreaExample() {
        JFrame f = new JFrame();
        JTextArea area = new JTextArea("his is the text area");
        area.setBounds(10,10,200,200);
        f.add(area);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        
    }
    public static void main(String[] args) {
        new TextAreaExample();
    }
    
}
