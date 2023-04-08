package org.Tasks.Java.File;
import java.io.*;


public class ReadWrite {
    public static void main(String[] args) throws IOException {
        FileReader filereader = new FileReader("nazwa.txt");
        BufferedReader bufferedReader = new BufferedReader(filereader);
        String line = bufferedReader.readLine();
        while (line != null){
            System.out.println(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        try {
            FileWriter writer = new FileWriter("nazwa.txt");
            BufferedWriter buff = new BufferedWriter(writer);
            buff.write("something");
            buff.newLine();
            buff.write("second line");

            bufferedReader.close();
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
