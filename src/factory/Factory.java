package factory;

/**
 * Factory
 */
public class Factory {
    public FactoryInterface getInstance(String name) {
        if(name == null)
            return null;
        
        if(name.equals("Person"))
            return new Person();    
        
        if(name.equals("Animal"))
            return new Animal();
        
            return null;
    }
}