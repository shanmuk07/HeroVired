import java.io.*;
import java.util.Scanner;
public class FileHandlingDemo {
    public static void main(String[] args) {
        String[] str = {
            "1.This is the first line",
            "2.This is the second line",
            "3. This is the third line"
        };

        try{
            File myFile = new File("sample.txt");
            myFile.createNewFile();
            FileWriter file = new FileWriter(myFile);
            for(String st: str){
                file.write(st+"\n");
            }
            file.close();
            
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
