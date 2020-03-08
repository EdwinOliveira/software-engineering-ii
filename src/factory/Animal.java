package factory;

/**
 * Animal
 */
public class Animal implements FactoryInterface {
    @Override
    public void getAge() {
        System.out.println("The Animal age is 10");
    }    
}