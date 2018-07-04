/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.Database.Frame;

import Swing.Database.Connection.DbConnection;
import java.sql.SQLException;

/**
 *
 * @author sanji
 */
public class FrameMain {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        DbConnection con = new DbConnection();
        Frame frame = new Frame();
    }
}
