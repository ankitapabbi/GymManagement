package gym;

import facilities.Memberships;

import java.util.Date;

public class Employees extends Person {
    private int employee_id;
    private int employee_salary;
    private Date joining_date;
    private String post;


    public Employees() {
    }

    public Employees(int person_id, String person_first_name, String person_second_name, int person_contact, String person_email) {
        super(person_id, person_first_name, person_second_name, person_contact, person_email);
    }

    /**
     *
     * @param person_id
     * @param person_first_name
     * @param person_second_name
     * @param person_contact
     * @param person_email
     * @param employee_id
     * @param employee_salary
     * @param joining_date
     * @param post
     */
    public Employees(int person_id, String person_first_name, String person_second_name, int person_contact, String person_email, int employee_id, int employee_salary, Date joining_date, String post) {
        super(person_id, person_first_name, person_second_name, person_contact, person_email);
        this.employee_id = employee_id;
        this.employee_salary = employee_salary;
        this.joining_date = joining_date;
        this.post = post;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public Date getJoining_date() {
        return joining_date;
    }

    public void setJoining_date(Date joining_date) {
        this.joining_date = joining_date;
    }

    public int getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(int employee_salary) {
        this.employee_salary = employee_salary;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public void display() {

        System.out.println("Employee Post : "+this.post);
        System.out.println("Employee Joining Date : "+this.joining_date);
        System.out.println("Salary : "+this.employee_salary);

    }


}