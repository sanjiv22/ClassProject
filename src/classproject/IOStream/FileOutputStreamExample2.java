/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject.IOStream;
import java.io.FileOutputStream;

/**
 *
 * @author sanji
 */
public class FileOutputStreamExample2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
            String s = "Welcome to java class";
            byte b[] = s.getBytes(); //converting String into byte
            fout.write(b);
            fout.close();
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println(e);
        }
   
    }
}
