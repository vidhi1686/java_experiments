import java.io.File;
public class exp9q1 {
    public static void main(String[] args) {
     System.out.println("Vidhi Jindal,24csu324");
        File file = new File("example2.txt");  

        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("The file 'example2.txt' exists and it is a file.");
            } else if (file.isDirectory()) {
                System.out.println("'example2.txt' is actually a directory.");
            }
        } else {
            System.out.println("The file 'example2.txt' does not exist.");
        }
    }
}