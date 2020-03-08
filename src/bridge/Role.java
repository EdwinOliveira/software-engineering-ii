package bridge;

/**
 * Role
 */
public abstract class Role {
    //fields
    protected PositionApi positionApi;

    //constructor
    public Role(PositionApi positionApi) {
        this.positionApi = positionApi;
    };

    //Getters/Setters
    public abstract void getPosition();
}