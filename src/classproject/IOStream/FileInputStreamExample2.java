/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject.IOStream;
import java.io.FileInputStream;

/**
 *
 * @author sanji
 */
public class FileInputStreamExample2 {
    
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("D:\\testout.txt");
            int i = 0;
            while((i=fin.read())!= -1)
            {
             System.out.print((char) i);   
            }
                    
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
