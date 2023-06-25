package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.transform.Source;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) arr.clone();




        try {
            processFile("example.txt");
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi IO: " + e.getMessage());
        }
    }


    public static void processFile(String filename) throws Exception {
        FileReader fileReader = new FileReader((String) "a.txt");
        try {
            // Các xử lý khác trên file
            fileReader = new FileReader(filename);
            // read file...
        } catch (Exception e) {
            throw e;
        } finally {
            fileReader.close();
        }
    }
}
