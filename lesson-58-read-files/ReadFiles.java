import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class ReadFiles {

    public static void main(String[] args){

        // how to read a file using Java (3 popular options)

        // BufferedReader + FileReader = best for reading text files line-by-line
        // Buff - middle man between the program and the file system
        // FileInputStream = best for binary files (e.g. images, audio files)
        // RandomAccessFile = best for read/ write specific portions of a large file

        String filePath = "C:\\Users\\claud\\OneDrive\\Área de Trabalho\\testando.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){

            String line;
            while((line= reader.readLine()) != null){
                System.out.println(line);
            }

        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file.");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }



    }
}
