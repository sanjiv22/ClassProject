/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject.IOStream;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author sanji
 */
public class BRRead {
    public static void main(String[] args) {
        char c='a';
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter character, 'q' to quit");
        //read character
        do{
            try {
                c= (char) br.read();
                System.out.println(c);
            } catch (IOException ex) {
                System.out.println(ex);
            }
            
        }while(c!='q');
    }
    
}
