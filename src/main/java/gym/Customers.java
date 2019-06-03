package gym;

import facilities.Memberships;

import java.util.Date;

public class Customers extends Person{
    private Date customer_date_joined;
    private String customer_address;

    public Customers() {
    }

    public Customers(int person_id, String person_first_name, String person_second_name, int person_contact, String person_email) {
        super(person_id, person_first_name, person_second_name, person_contact, person_email);
    }

    public Customers(int person_id, String person_first_name, String person_second_name, int person_contact, String person_email, Date customer_date_joined, String customer_address) {
        super(person_id, person_first_name, person_second_name, person_contact, person_email);
        this.customer_date_joined = customer_date_joined;
        this.customer_address = customer_address;
    }

    public Date getCustomer_date_joined() {
        return customer_date_joined;
    }

    public void setCustomer_date_joined(Date customer_date_joined) {
        this.customer_date_joined = customer_date_joined;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    @Override
    public void display() {
        super.display();
        System.out.println();
    }
}
