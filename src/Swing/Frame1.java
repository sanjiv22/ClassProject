/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author sanji
 */
public class Frame1 extends JFrame implements ActionListener{
    private JButton jb1, jb2, jb3;
    
    Frame1()
    {
        setTitle("setActionCommand and getActionCommand");
        setLayout(new FlowLayout());
        setButtons();
        setAction();
        setSize(700,200);
        setVisible(true);   
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void setButtons(){
        jb1 = new JButton("JButton 01");
        jb2 = new JButton("JButton 02");
        jb3 = new JButton("JButton 03");
        add(jb1);
        add(jb2);
        add(jb3);
    }
    private void setAction()
    {
        jb1.addActionListener(this); //registration of the source with the listner
        jb1.setActionCommand("jb1");
        jb2.addActionListener(this);
        jb2.setActionCommand("jb2");
        jb3.addActionListener(this);
        jb3.setActionCommand("jb3");
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand() == "jb1")
            JOptionPane.showMessageDialog(rootPane,"JButton 01 pressed");
        else if(e.getActionCommand() == "jb2")
            JOptionPane.showMessageDialog(rootPane, "JButton 02 Predded");
        else if(e.getActionCommand() == "jb3")
            JOptionPane.showMessageDialog(rootPane, "JButton 03 Predded");
    }

    private void setFilter(String setActionCommand_and_getActionCommand) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
