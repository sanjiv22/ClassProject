/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.Layout.GridLayout;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author sanji
 */
public class GridLayoutExample extends JFrame {

    public GridLayoutExample() {
        setTitle("GridLayout Example");
        setLayout(new GridLayout(7, 3, 5, 5)); //(row,column,horizontal spacing, vertical spacing)
        setGridLayout();
        setSize(700, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setGridLayout() {
        for (int i = 0; i < 20; i++) {
            add(new JButton("Button" + i));
        }
    }

    public static void main(String[] args) {
        new GridLayoutExample();
    }

}
