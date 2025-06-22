# Program
// Logger.java
public class Logger {
    // Step 1: Private static instance of the class
    private static Logger instance;

    // Step 2: Private constructor to prevent instantiation
    private Logger() {
        System.out.println("Logger initialized!");
    }

    // Step 3: Public static method to provide access to the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();  // Lazy initialization
        }
        return instance;
    }

    // Example method
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
