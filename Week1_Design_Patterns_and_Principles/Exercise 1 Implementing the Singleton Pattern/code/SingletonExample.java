// SingletonExample.java

class Singleton {
    // Step 1: Create a private static instance of the class
    private static Singleton instance;

    // Step 2: Private constructor to prevent instantiation
    private Singleton() {
        System.out.println("Singleton instance created!");
    }

    // Step 3: Provide a global point of access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();  // Lazy initialization
        }
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

public class SingletonExample {
    public static void main(String[] args) {
        // Try creating multiple objects
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.showMessage();
        s2.showMessage();

        // Verify both references point to the same object
        System.out.println("Same instance? " + (s1 == s2));
    }
}
