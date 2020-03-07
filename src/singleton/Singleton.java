package singleton;

/**
 * Singleton
 */
public class Singleton {

    //Fields
    private static Singleton singletonInstance = null;

    private Singleton() {};

    public static Singleton getSingletonInstance() {
        if(singletonInstance == null)
            singletonInstance = new Singleton();

        return singletonInstance;
    }
}