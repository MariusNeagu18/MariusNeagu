/*
 * Create and open a file for write in it
 */
package exceptions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mario
 */
public class CreateAndOpenFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create the file
        File newFile = new File("C:\\Users\\mario\\Desktop\\NewFile.txt");
        if (newFile.exists()) {
            System.out.println("This file already exists");
        } else {
            try {
                newFile.createNewFile();
            } catch (IOException e) {
                System.out.println("Error 1: " + e.getMessage());
            }
            try {
                //create the writer
                FileWriter fileW = new FileWriter(newFile);
                //create the buffer
                BufferedWriter buffW = new BufferedWriter(fileW);
                buffW.write("Hello. I am the file that you have created.");
                buffW.close();
            } catch (IOException e) {
                System.out.println("Error 2: " + e.getMessage());
            }
        }
    }
}
