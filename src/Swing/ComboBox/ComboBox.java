/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.ComboBox;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

/**
 *
 * @author sanji
 */
class Frame2 extends JFrame implements ItemListener{
   
    private JComboBox jb;
    private JLabel jl;
    private String[] item = {"C","C++","Java","Php"};
    
    Frame2()
    {
        setTitle("JComboBox with ItemListener");
        setLayout(new FlowLayout());
        setJComboBox();
        setAction();
        setSize(700, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
    private void setJComboBox()
    {
        jb = new JComboBox(item);
        add(jb);
        jl = new JLabel("Select any language");
        add(jl);
    }
    
    private void setAction()
    {
        jb.addItemListener(this);
    }
    
    public void itemStateChanged(ItemEvent ie)
    {
        String getItem = (String)jb.getSelectedItem();
        
        if(getItem.equals(item[0]))
            jl.setText("C selected");
        else if(getItem.equals(item[1]))
            jl.setText("C++ selected");
        else if(getItem.equals(item[2]))
            jl.setText("Java selected");
        else if(getItem.equals(item[3]))
            jl.setText("Php selected");
    }
}

public class ComboBox {
   
    public static void main(String[] args) {
        
       Frame2 frame = new Frame2();
    }
}