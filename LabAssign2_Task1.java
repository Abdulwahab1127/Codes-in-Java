import java.util.Scanner;

public class LabAssign2_Task1 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Employee ID:");
        int id = scn.nextInt();
        System.out.print("Enter Employee Name:");
        String name = scn.next();

        System.out.print("Enter Birthday in Order: ");
        System.out.println("\nEnter Date:");
        int day = scn.nextInt();
        System.out.println("Enter Month:");
        int month = scn.nextInt();
        System.out.println("Enter Year:");
        int year = scn.nextInt();

        //Making an Object Here of Class Date and Giving Values in Constructor
        Datee BirthDate = new Datee(day, month, year);
        Address add = new Address();

        //Now Taking Value for Address
        System.out.print("Enter Employee street number: ");
        add.setStreetNumber(scn.nextInt());

        System.out.print("Enter Employee city: ");
        add.setCity(scn.next());

        System.out.print("Enter country: ");
        add.setCountry(scn.next());

        // create employee object and display information
        Employee employee1 = new Employee(id , add );

        employee1.setName(name);
        employee1.setBirthDate(BirthDate);

        //Calling Display Function From Employee
        employee1.displayInfo();

    }


}


class Address{
    private int streetNumber;
    private String city;
    private String country;

    public int getStreetNumber() {

        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {

        this.streetNumber = streetNumber;
    }

    public String getCity() {

        return city;
    }

    public void setCity(String city) {

        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

class Date{
    private int day;
    private int year;
    private int month;

    public Date(int day, int month, int year) {

        if (day < 1 || day > 30) {

            System.out.println("Invalid Date");

        }
        else {
            this.day = day;
            this.month = month;
            this.year = year;
        }

    }
}

class Employee{

    private int id;
    private String name;
    private Datee birthDate;
    private Address Address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Datee getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Datee birthDate) {
        this.birthDate = birthDate;
    }

    public Address getAddress() {
        return Address;
    }

    public void setAddress(Address address) {
        Address = address;
    }

    public Employee(int id, String name, Datee birthDate, Address address) {

        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        Address = address;

    }

    public Employee(int id, Address address) {
        this.id = id;
        Address = address;
    }

    public void displayInfo() {

        System.out.println("\nEmployee Info :");
        System.out.println("\nID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Birthdate: " + birthDate.getDay() + "-" + birthDate.getMonth() + "-" + birthDate.getYear());
        System.out.println("Address: " + Address.getStreetNumber() + "," + Address.getCity() + "," + Address.getCountry());

    }

}