package TaskTwo;

public class Main {
    public static void main(String[] args) {

        //creating an object of type Cafe called cafe

        Cafe cafe = new Cafe();

        //calling a function called loadMenuData via object called cafe

        cafe.loadMenuData();

        //printing ArrayList called coffeeMenu via object called cafe

        System.out.println(cafe.coffeeMenu);


    }
}
