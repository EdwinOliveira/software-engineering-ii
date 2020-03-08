package bridge;

/**
 * Mage
 */
public class Mage extends Role {
    public Mage(PositionApi positionApi) {
        super(positionApi);
    }

    public void getPosition() {
        positionApi.getMagePosition();
    }
}