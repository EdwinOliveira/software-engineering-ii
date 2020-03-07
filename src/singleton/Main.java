package singleton;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Singleton singletonInstance = Singleton.getSingletonInstance();
        System.out.println("\n Singleton class Instance: " + singletonInstance);
    }
}