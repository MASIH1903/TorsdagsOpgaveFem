package TaskThree;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//creating objects of type Room

        Room room1 = new Room(1, 1, 1);
        Room room2 = new Room(2, 2, 2);
        Room room3 = new Room(3, 3, 3);

//creating ArrayList called listOfRooms

        ArrayList<Room> listOfRooms = new ArrayList<Room>();

//adding objects to ArrayList called listOfRooms

        listOfRooms.add(room1);
        listOfRooms.add(room2);
        listOfRooms.add(room3);

//creating object of type Building

        Building building = new Building(listOfRooms, 2, 2, true);

//calling the function countLampsInBuilding() with building (object of Building) as parameter in main method

        countLampsInBuilding(building);

//calling the function isNormal() with building (object of Building) as parameter in main method

        isNormal(building);


    }

//creating a static function
    public static void countLampsInBuilding(Building building) {

        int total = 0;
        for (Room s : building.getRooms()) {

            total = total + s.getNumberOfLamps();

        }
        System.out.println(total);

    }


//creating a static function with a return type of boolean
    public static boolean isNormal(Building building) {

        if (building.getNumberOfFloors() > building.getRooms().size()) {

            System.out.println("This is not an odd building");
            return true;

        } else {

            System.out.println("This is an odd building");
            return false;

        }

    }
}
