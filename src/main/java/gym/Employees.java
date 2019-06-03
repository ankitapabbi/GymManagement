package gym;

import facilities.Memberships;

public class Employees extends Person {
    private int employee_salary;
    Memberships m1= new Memberships();

    public Employees() {
    }

    public Employees(int employee_salary, Memberships m1) {
        this.employee_salary = employee_salary;
        this.m1 = m1;
    }

    public Employees(int person_id, String person_first_name, String person_second_name, int person_contact, String person_email, int employee_salary, Memberships m1) {
        super(person_id, person_first_name, person_second_name, person_contact, person_email);
        this.employee_salary = employee_salary;
        this.m1 = m1;
    }

    public int getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(int employee_salary) {
        this.employee_salary = employee_salary;
    }

    @Override
    public void display() {
        System.out.println("------------Employee Data------------");
        System.out.println("Salary : "+this.employee_salary);

    }
}