package TaskOne;

public class Customer {

    //instance variable
    private String firstName;
    private String lastName;
    private String userName;
    private int id;


    //constructor
    Customer(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;

    }

    //toString method
    public String toString() {

        return "Name: " + firstName + " " + lastName + " - Username: " + userName + " - ID: " + id;

    }

    //getters
    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public String getUserName() {

        return userName;
    }

    public int getId() {

        return id;
    }
}
