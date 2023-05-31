package Activitys;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Activity14 {

    public static void main(String[] args) throws IOException {
        File file=new File("./src/main/Note.text");
        boolean fStatus = file.createNewFile();
        if(fStatus)
        {
            System.out.println("File is created");
        }
        else {
            System.out.println("File is not created");
        }



    }
}
