package bridge;

/**
 * EnchanterMage
 */
public class EnchanterMage implements PositionApi {
    
    //constructor
    private EnchanterMage() {};

    @Override
    public void getMagePosition() {
        System.out.println("Normaly Enchanter Mages are played at Bottom Lane");
    }
}