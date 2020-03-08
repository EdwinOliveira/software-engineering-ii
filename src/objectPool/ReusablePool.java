package objectPool;

import java.util.ArrayList;

/**
 * ReusablePool
 */
public class ReusablePool {
    //Instantiating ReusablePool;
    private static ReusablePool reusablePool = null;
    
    //ArrayLists;
    private ArrayList<Integer> usedSeat, freeSeat = null;   

    //Max Connections size;
    private int size;

    //constructor
    public ReusablePool() {

        this.size = 10;

        //ArrayLists Instantiators
        this.usedSeat = new ArrayList<Integer>();
        this.freeSeat = new ArrayList<Integer>();
    }

    //Create one instance;
    public static ReusablePool getReusablePool() {
        if(reusablePool == null)
            reusablePool = new ReusablePool();

        return reusablePool;
    }

    public synchronized Integer acquireConnection() {
        if(this.usedSeat.size() > size)
            throw new Error("Used ArrayList is full!");
        
        Integer newObject;

        if(this.freeSeat.isEmpty() == true) {
            //Conecções esgotadas;
            throw new Error("Unused ArrayList is empty");
        } else {
            newObject = this.freeSeat.get(0);
            this.freeSeat.remove(newObject);
        }

        this.usedSeat.add(newObject);

        return this.usedSeat.get(newObject);
    } 

    public synchronized void releaseConnection(Integer object) {
        if(this.usedSeat.contains(object) != true)
            throw new Error("Object not found in the ArrayList");
        
        this.usedSeat.remove(object);
        this.freeSeat.add(object);
    } 

}