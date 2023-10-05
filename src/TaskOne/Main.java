package TaskOne;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //creating an ArrayList called customers

        ArrayList<Customer> customers = new ArrayList<Customer>();

        //creating objects of type Customer

        Customer customer1 = new Customer("Masih", "Kabiri", "joyboy");
        Customer customer2 = new Customer("Peter", "Janas", "PePandeKage");
        Customer customer3 = new Customer("Tobias", "Hansen", "Tobirama");
        Customer customer4 = new Customer("Henrik", "Thunbo", "Thunbo10");

        //adding objects of type Customer to ArrayList

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);

        //calling a static function called printCustomers and using ArrayList called customers as a parameter

        printCustomers(customers);


    }

    //creating a static function

    public static void printCustomers(ArrayList<Customer> customers) {
        for (Customer s : customers) {
            System.out.println(s);

        }
    }
}







