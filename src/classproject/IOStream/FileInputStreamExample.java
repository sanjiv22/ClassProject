/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject.IOStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author sanji
 */
public class FileInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("D:\\testout.txt");
            int i = fin.read();
            System.out.println((char)i);
            fin.close();
        } catch (IOException e){
            System.out.println(e);
          
        }
    }
}
