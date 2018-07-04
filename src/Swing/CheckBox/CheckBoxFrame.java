/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.CheckBox;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author sanji
 */
public class CheckBoxFrame extends JFrame{
    private final JTextField textField;
    private final JCheckBox boldJCheckBox;
    private final JCheckBox italicJCheckBox;
    
//  CheckBoxFrame Constructor adds JCheckBoxes to JFrame
    public CheckBoxFrame(){
        super("JCheckBox Test");
        setLayout(new FlowLayout() );
        
        //set up JTextField and set its font
        textField = new JTextField("Watch the font style");
        textField.setFont(new Font("Serif", Font.PLAIN, 14) );
        add(textField);
        boldJCheckBox = new JCheckBox("Bold");
        italicJCheckBox = new JCheckBox("Italic");
        add(boldJCheckBox);
        add(italicJCheckBox);
        
        //register listeners for JCheckBox
        CheckBoxHandler handler = new CheckBoxHandler();
        boldJCheckBox.addItemListener(handler); 
        italicJCheckBox.addItemListener(handler);
    } //end Constructor
    
    //private inner class for item listner event handling
    private class CheckBoxHandler implements ItemListener{
        //respond to checkbox event
        @Override
        public void itemStateChanged(ItemEvent event){
         
            Font font = null; // stores the new Font
            // determine which CheckBoxes are checked and create Font
            if (boldJCheckBox.isSelected() && italicJCheckBox.isSelected() )
            font = new Font( "Serif", Font.BOLD + Font.ITALIC, 14 );
            else if( boldJCheckBox.isSelected())
            font = new Font( "Serif", Font.BOLD, 14 );
            else if( italicJCheckBox.isSelected())
            font = new Font( "Serif", Font.ITALIC, 14 );
            else
            font = new Font( "Serif", Font.PLAIN, 14 );
            textField.setFont( font ); // set textField's font
        } // end method itemStateChanged

        
    }
}
