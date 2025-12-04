import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {

    public static void main(String[] args) throws IOException {

        // how to write a file using Java (4 popular options)

        // FileWriter = good for small or medium-sized text files
        // BufferedWriter = better performance for large amount of text
        // PrintWriter = best for structured data, like reports or logs
        // FileOutputStream = best for binary files (e.g. images, audio files)

        String filePath = "C:\\Users\\claud\\OneDrive\\Área de Trabalho\\Test\\teste.txt";
        String textContent = "I like pizza! Buy me some!";
        // for a lot of text, use """
        //        """

        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("File has been written.");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file location.");
        }
        catch(IOException e){
            System.out.println("Could not write file.");
        }
    }
}
