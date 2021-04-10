package hust.soict.hedspi.garbage;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class NoGarbage {
    public static void main(String[] args) {
        File x = new File("C:\\\\Users\\\\Tran Quang Long\\\\eclipse-workspace\\\\OtherProjects\\\\src\\\\hust\\\\soict\\\\hedspi\\\\garbage\\\\testfile.txt");
        long start = System.currentTimeMillis();
        Scanner myScanner = null;
        try {
        	myScanner = new Scanner(x);
            StringBuffer content = new StringBuffer();
            while(myScanner.hasNext()) {
                content.append(myScanner.next() + "\n");
            }
            System.out.println(System.currentTimeMillis() - start);
            myScanner.close();
        } catch (FileNotFoundException e) {
        	 System.out.println("File not found or can't read");
            e.printStackTrace();
        }
    }
}