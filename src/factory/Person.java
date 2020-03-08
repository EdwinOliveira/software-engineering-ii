package factory;

/**
 * Person
 */
public class Person implements FactoryInterface{
    @Override
    public void getAge() {
        System.out.println("The Person Age is 23");
    }
}