/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.Database.Frame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author sanji
 */
public class Frame extends JFrame implements ActionListener {

    private JButton insertbtn, deletebtn, updatebtn;
    public JLabel jLabel;

    Frame() {
        setTitle("Insert Update Delete");
        setLayout(new FlowLayout());
        setButtons();
        setAction();
        setSize(700, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setButtons() {
        insertbtn = new JButton("Insert_Button");
        deletebtn = new JButton("Delete_Button");
        updatebtn = new JButton("Update_Button");
        jLabel = new JLabel("Message");
        add(insertbtn);
        add(deletebtn);
        add(updatebtn);
        add(jLabel);
    }

    private void setAction() {
        insertbtn.addActionListener(this); //registration of the source with the listner
        insertbtn.setActionCommand("insert");
        deletebtn.addActionListener(this);
        deletebtn.setActionCommand("delete");
        updatebtn.addActionListener(this);
        updatebtn.setActionCommand("update");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("insert")) {

            InsertFunction insertFunction = new InsertFunction();
            try {
                insertFunction.insertRecord();
                jLabel.setText("Data Inserted");
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getActionCommand().equals("delete")) {
            {
                try {
                    DeleteFunction.deleteRecord();
                    jLabel.setText("Record Deleted");
                } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else if (e.getActionCommand().equals("update")) {
            {
                try {
                    UpdateFunction.updateRecord();
                    jLabel.setText("Record Updated");
                } catch (SQLException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            System.out.println("Nothing");
        }
    }

   
}
