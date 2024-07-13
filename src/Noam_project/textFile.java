package Noam_project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class textFile {
    public static Path currentRelativePath = Paths.get("");
    public static String s = currentRelativePath.toAbsolutePath().toString()+"\\src\\Noam_project\\text.txt";
    static Path path = Paths.get(s);
    static Scanner scanner;

    public textFile(){

    }

    public static Boolean logic(String BookName){
        String OldBooks = Read();
        StringBuilder subString = new StringBuilder();
        int Index = 0;
        for (int i = 0; i < OldBooks.length(); i++) {
            if (OldBooks.charAt(i) != '|'){
                subString.append(OldBooks.charAt(i));
            }
            else if (subString.toString().equals(BookName)){
                return true;
            }
            else {
                subString = new StringBuilder();
            }
        }
        return false;
    }


    public static String Read(){
        try {
            scanner = new Scanner(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String data = new String();
        if (scanner.hasNextLine()) {
            data = scanner.nextLine();
            scanner.close();
            System.out.println(data);
        }
        return data;
    }

    public static void write(String str) {
        if (logic(str)){
            return;
        }
        byte[] arr = (Read()+str+"|").getBytes();

        try {

            Files.write(path, arr);
        }

        catch (IOException ex) {

            System.out.print("Invalid Path");
        }
    }
}
