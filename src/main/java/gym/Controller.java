package gym;

import facilities.*;

public class Controller {

    static Person person = new Person();
    Customers customers = new Customers();
    Employees employees = new Employees();
    Memberships memberships = new Memberships();
    Silver silver = new Silver();
    Gold gold = new Gold();
    Platinum platinum = new Platinum();
    Diamond diamond = new Diamond();

    public static void main(String[] args) {
        person.setPerson_contact(9465129);
        person.setPerson_first_name("Udhay");
        person.setPerson_second_name("Mahajan");
        person.setPerson_email("udhaymahajan0@gmail.com");
        person.display();
    }
}
