package main.files;

import java.io.File;

public class Files {

    public static void main(String[] args) {

        // file = an abstract representation of file and directory pathnames.

        File file = new File("Secret_Message.txt");

        if(file.exists()){
            System.out.println("This file exists!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
        }else{
            System.out.println("This file is FAKEE");
        }

    }
}
