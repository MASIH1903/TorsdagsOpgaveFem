package TaskTwo;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {


    //creating an Arraylist called coffeeMenu of type String
    ArrayList<String> coffeeMenu = new ArrayList<String>();


    //creating a function reading a text file via Scanner
    public void loadMenuData() {
        File file = new File("coffees.txt");

        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {

                String input = scan.nextLine();
                coffeeMenu.add(input);


            }
        } catch (Exception e) {
            System.out.println("File not found");

        }


    }
}
