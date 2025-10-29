public class Exp8q2 {
    public static void main(String[] args) {
        System.out.println("Vidhi Jindal,24csu324");

        try {
            
            throw new Exception("This is a test exception message");
        } 
        catch (Exception e) {
            
            System.out.println("Caught Exception: " + e.getMessage());
        } 
        finally {
            
            System.out.println("Finally block executed");
        }
    }
}