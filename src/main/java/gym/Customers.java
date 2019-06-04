package gym;

import facilities.Memberships;

import java.util.Date;

public class Customers extends Person{
    private Date customer_date_joined;
    private String customer_address;
    private int customer_id;


    public Customers() {
    }

    public Customers(int person_id, String person_first_name, String person_second_name, int person_contact, String person_email) {
        super(person_id, person_first_name, person_second_name, person_contact, person_email);
    }

    /**
     *
     * @param person_id
     * @param person_first_name
     * @param person_second_name
     * @param person_contact
     * @param person_email
     * @param customer_date_joined
     * @param customer_address
     * @param customer_id
     */
    public Customers(int person_id, String person_first_name, String person_second_name, int person_contact, String person_email, Date customer_date_joined, String customer_address, int customer_id) {
        super(person_id, person_first_name, person_second_name, person_contact, person_email);
        this.customer_date_joined = customer_date_joined;
        this.customer_address = customer_address;
        this.customer_id = customer_id;
    }


    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public Date  getCustomer_date_joined() {
        return customer_date_joined;
    }

    public void setCustomer_date_joined(Date  customer_date_joined) {
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
        System.out.println("Customer Date Joined : "+this.getCustomer_date_joined());
        System.out.println("Customer Address : "+this.getCustomer_address());
    }
}
