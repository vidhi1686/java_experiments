import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class exp9q3 {
    public static void main(String[] args) {
    System.out.println("Vidhi Jindal,24csu324");
        String filename = "data.txt";
        try {
            // Write operation
            FileWriter writer = new FileWriter(filename);
            writer.write("Hello, this is a sample text.");
            writer.close();

            // Read operation
            FileReader reader = new FileReader(filename);
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
