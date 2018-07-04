/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.Layout.BoxLayout;

import java.awt.Insets;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author sanji
 */
public class BoxLayoutExample {

    public static void main(String[] args) {
          JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame f = new JFrame("BoxLayout Example X_AXIS");
    
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.X_AXIS);
        panel.setLayout(boxLayout);
        panel.setBorder(new EmptyBorder(new Insets(50, 80, 50, 80)));
        JButton jb1 = new JButton("Button 1");
        JButton jb2 = new JButton("Button 2");
        JButton jb3 = new JButton("Button 3");
        panel.add(jb1);
        panel.add(jb2);
        panel.add(jb3);
        f.add(panel);
        f.pack();
        f.setVisible(true);
    }

}
