package gym;

import facilities.Memberships;

import java.util.Date;

public class Employees extends Person {
    private int employee_id;
    private int employee_salary;
    private Date joining_date;


    public Employees() {
    }

    public Employees(int employee_id, int employee_salary, Date joining_date) {
        this.employee_id = employee_id;
        this.employee_salary = employee_salary;
        this.joining_date = joining_date;
    }

    public Employees(int person_id, String person_first_name, String person_second_name, int person_contact, String person_email, int employee_id, int employee_salary, Date joining_date) {
        super(person_id, person_first_name, person_second_name, person_contact, person_email);
        this.employee_id = employee_id;
        this.employee_salary = employee_salary;
        this.joining_date = joining_date;
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

    @Override
    public void display() {

        System.out.println("Employee Joining Date : "+this.joining_date);
        System.out.println("Salary : "+this.employee_salary);

    }
}