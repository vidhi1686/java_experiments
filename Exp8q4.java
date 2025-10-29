class MyCustomException extends Exception {
    private String message;

    MyCustomException(String message) {
        this.message = message;
    }

    void printMessage() {
        System.out.println("Custom Exception Message: " + message);
    }
}

public class Exp8q4 {
    public static void main(String[] args) {
    System.out.println("Vidhi Jindal,24csu324");
        try {
            
            throw new MyCustomException("Something went wrong in the program!");
        } 
        catch (MyCustomException e) {
            
            e.printMessage();
        }
    }
}