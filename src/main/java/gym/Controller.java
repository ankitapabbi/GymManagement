package gym;

import facilities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Controller {

    static Person person = new Person();
    static Customers customers = new Customers();
    static Employees employees = new Employees();
    static Memberships memberships = new Memberships();
    static Silver silver = new Silver();
    static Gold gold = new Gold();
    static Platinum platinum = new Platinum();
    static Diamond diamond = new Diamond();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.println("Enter the Type of User (Employee/Customer)");
        String userType = scanner.next();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(userType.equals("Employee")){
            System.out.println("------------Employee Data------------");
            person.setPerson_id(1);
            person.setPerson_contact(2145129248);
            person.setPerson_first_name("Udhay");
            person.setPerson_second_name("Mahajan");
            person.setPerson_email("udhaymahajan0@gmail.com");

            person.display();

            SimpleDateFormat sdf= new SimpleDateFormat("dd-m-yyyy hh:mm:ss");
            String empDate = "31-08-1982 10:20:56";


            try {
                Date s1 = sdf.parse(empDate);
                employees.setJoining_date(s1);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            employees.setEmployee_salary(1000000);
            employees.display();

        }else if(userType.equals("Customer")){
            System.out.println("------------Customer Data------------");
            person.setPerson_contact(2146658971);
            person.setPerson_first_name("Ankita");
            person.setPerson_second_name("Pabbi");
            person.setPerson_email("erankitapabbi@gmail.com");
            person.display();
            //-----------------------Member Ship Details ----------------------------
            SimpleDateFormat sdf= new SimpleDateFormat("dd-m-yyyy hh:mm:ss");
            String dateStart = "31-08-1982 10:20:56";
            String dateEnd = "31-08-1992 10:20:56";

            try {
                Date s1 = sdf.parse(dateStart);
                Date s2 = sdf.parse(dateEnd);
                memberships.setStart_date(s1);
                memberships.setEnd_date(s2);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            memberships.display();
            //----------------Choose Membership--------
            System.out.println("Enter Membership Number :");
            System.out.println("1 For Silver \n 2 For Gold \n 3 For Platinum \n 4 For Diamond");
            int membershipNumber = scanner.nextInt();

            switch (membershipNumber){
                case 1:{
                    int price=silver.silver_price;
                    System.out.println("Price Of Membership : "+price);
                    silver.gymnasium();
                    System.out.println("------------Employee Data------------");
                    System.out.println("Available Employees : Manager, Trainer");
                    System.out.println("Trainer Category : General Trainer");
                    person.setPerson_id(1);
                    person.setPerson_contact(2145129248);
                    person.setPerson_first_name("Udhay");
                    person.setPerson_second_name("Mahajan");
                    person.setPerson_email("udhaymahajan0@gmail.com");

                    person.display();
                    break;
                }
                case 2:{
                    int price=gold.gold_price;
                    System.out.println("Price Of Membership : "+price);
                    gold.gymnasium();
                    gold.cardio();
                    System.out.println("------------Employee Data------------");
                    System.out.println("Available Employees : Manager, Trainer");
                    System.out.println("Trainer Category : General Trainer");
                    person.setPerson_id(1);
                    person.setPerson_contact(2145129248);
                    person.setPerson_first_name("Udhay");
                    person.setPerson_second_name("Mahajan");
                    person.setPerson_email("udhaymahajan0@gmail.com");

                    person.display();
                    break;
                }
                case 3:{
                    int price=platinum.platinum_price;
                    System.out.println("Price Of Membership : "+price);
                    platinum.gymnasium();
                    platinum.cardio();
                    platinum.sona();
                    System.out.println("------------Employee Data------------");
                    System.out.println("Available Employees : Manager, Trainer");
                    System.out.println("Trainer Category : General Trainer and Personal Trainer");
                    person.setPerson_id(1);
                    person.setPerson_contact(2145129248);
                    person.setPerson_first_name("Udhay");
                    person.setPerson_second_name("Mahajan");
                    person.setPerson_email("udhaymahajan0@gmail.com");

                    person.display();
                    break;
                }
                case 4:{
                    int price=diamond.diamond_price;
                    System.out.println("Price Of Membership : "+price);
                    diamond.gymnasium();
                    diamond.cardio();
                    diamond.sona();
                    diamond.swimmingPool();
                    System.out.println("------------Employee Data------------");
                    System.out.println("Available Employees : Manager, Trainer, Life Guard");
                    System.out.println("Trainer Category : General Trainer and Personal Trainer");
                    person.setPerson_id(1);
                    person.setPerson_contact(2145129248);
                    person.setPerson_first_name("Udhay");
                    person.setPerson_second_name("Mahajan");
                    person.setPerson_email("udhaymahajan0@gmail.com");

                    person.display();
                    break;
                }
                default: {
                    System.out.println("Wrong Choice");
                    break;
                }
            }
            //-----------------------Choose Membership------------------------------------


           // memberships.setEnd_date();
            customers.setCustomer_address("2 Edenmills Drive, Scarborough");
            SimpleDateFormat sdf1= new SimpleDateFormat("dd-m-yyyy hh:mm:ss");
            String dateJoin = "31-08-1982 10:20:56";
            customers.setCustomer_date_joined(dateJoin);
            customers.display();




        }


    }
}
