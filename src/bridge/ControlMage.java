package bridge;

/**
 * ControlMage
 */
public class ControlMage implements PositionApi {
    private ControlMage() {};

    @Override
    public void getMagePosition() {
        System.out.println("Normaly Control Mages are Played at MidLane");
    }
}   