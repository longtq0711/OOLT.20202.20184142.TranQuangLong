package hust.soict.hedspi.garbage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GarbageCreator {
    public static void main(String[] args) {
        String myStr = "";
        try {
            File myText = new File("C:\\Users\\Tran Quang Long\\eclipse-workspace\\OtherProjects\\src\\hust\\soict\\hedspi\\garbage\\testfile.txt");
            long start = System.currentTimeMillis();
            Scanner myScanner = new Scanner(myText);
            while(myScanner.hasNext()) 
                myStr += myScanner.next();
            System.out.println(System.currentTimeMillis() - start);
            myScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found or can't read");
            e.printStackTrace();
        }
    }
}