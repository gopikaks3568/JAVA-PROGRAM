import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.lang.ProcessBuilder.Redirect;
import java.nio.Buffer;
import java.util.Scanner;

public class FileIO {

    public static void main(String[] args) {
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter("Output.txt"));
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the text:");
            String text=sc.nextLine();
            writer.write(text+"\n");
            System.out.println("Succesfully written into the file ");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
       try {
        BufferedReader reader= new BufferedReader(new FileReader("output.txt"));
        String line;
        System.out.println("The file contents are...\n");
        while ((line =reader.readLine())!= null) {
            System.out.println(line);
            
        }
       } catch (Exception e) {
        e.printStackTrace();
       }
       
    }
}