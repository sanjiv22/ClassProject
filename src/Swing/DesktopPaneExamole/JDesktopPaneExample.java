/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.DesktopPaneExamole;

import javax.swing.*;

/**
 *
 * @author sanji
 */
public class JDesktopPaneExample {
     JFrame frame;
  JPanel panel;
  JInternalFrame iframe;
  JButton button1, button2;
  JDesktopPane desk;
  public static void main(String[] args) {
  JDesktopPaneExample d = new JDesktopPaneExample();
  }
  public JDesktopPaneExample(){
  frame = new JFrame("Creating a JDesktopPane Container");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  iframe = new JInternalFrame("Internal frame", true,true,true,true);
  iframe.setToolTipText("This is internal frame");
  panel = new JPanel();
  button1 = new JButton("Ok");
  button1.setToolTipText("This is Ok button of internal frame");
  panel.add(button1);
  button2 = new JButton("Cancel");
  button2.setToolTipText("This is cancel button of internal frame");
  panel.add(button2);
  iframe.add(panel);
  iframe.setSize(250,300);
  iframe.setVisible(true);
  desk = new JDesktopPane();
  desk.add(iframe);
  frame.add(desk);
  frame.setSize(400,400);
  frame.setVisible(true);
  }

}
