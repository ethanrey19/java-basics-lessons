package main.files.FileWriter;

import java.io.FileWriter;

public class FileWriters {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \nViolets are blue \ntest test test test");
            writer.append("-Ethan");
            writer.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
