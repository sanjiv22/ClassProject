/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.ColorChooser;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author sanji
 */
public class ColorChooser extends JFrame{
     private JLabel sampleText = new JLabel("Label");
  private JButton chooseButton = new JButton("Choose Color");

  public static void main(String[] args) {
    new ColorChooser();
  }

  public ColorChooser() {
    this.setSize(300, 100);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panel1 = new JPanel();
    sampleText.setBackground(null);
    panel1.add(sampleText);

    chooseButton.addActionListener(new ButtonListener());
    panel1.add(chooseButton);

    this.add(panel1);
    this.setVisible(true);
  }

  private class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      Color c = JColorChooser.showDialog(null, "Choose a Color", sampleText.getForeground());
      if (c != null)
        sampleText.setForeground(c);
    }
  }
    
}
