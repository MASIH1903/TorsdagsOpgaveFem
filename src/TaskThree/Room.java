package TaskThree;

public class Room {

    //instance variable
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    //constructor
    Room(int numberOfDoors, int numberOfLamps, int numberOfWindows) {

        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;

    }

    //getters
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }
}
