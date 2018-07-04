/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.DesktopPaneExamole;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author sanji
 */
public class JDesktopPaneExample2 extends JFrame{
    
  public JDesktopPaneExample2() 
  {
    CustomDesktopPane desktopPane = new CustomDesktopPane();
    Container contentPane = getContentPane();
    contentPane.add(desktopPane, BorderLayout.CENTER);
    desktopPane.display(desktopPane);

    setTitle("Learning MDI");
    setSize(300,500);
    setVisible(true);
  }
  public static void  main(String args[])
  {
    new JDesktopPaneExample2();
  }
}
class CustomDesktopPane extends JDesktopPane
{
  int numFrames = 5,  x = 30, y = 30;
  public void display(CustomDesktopPane dp) 
  {
    for(int  i = 0; i < numFrames ; ++i ) 
    {
      JInternalFrame jif = new JInternalFrame("Internal Frame " + i ,  true, true, true, true);

     jif.setBounds(x, y, 250, 85);
     Container c1 = jif.getContentPane( ) ;
     c1.add(new JLabel("S. Nageswra Rao, Corporate Trainer."));
     dp.add( jif );
     jif.setVisible(true);		
     y += 85;
    }
  }

}
