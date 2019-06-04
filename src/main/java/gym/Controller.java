package gym;

import facilities.*;
import other.CustomerSingleton;
import other.EmployeeSingleton;
import other.PersonSingleton;

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
    private static Date s1;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello !!!");
        System.out.println("Welcome To Our Project : GYM MANAGEMENT ");

        System.out.println("Press 1 for Multiple Records");
        int mainOption = scanner.nextInt();

        if(mainOption==1){
            System.out.println("Select Options : ");
            System.out.println("1 For Employees Details");
            System.out.println("2 For Customer Details");
            System.out.println("3 For Membership Details");
            System.out.println("4 For All Customers");
            System.out.println("5 For All Employees");
            int option = scanner.nextInt();

            switch (option){
                case 1:{
                    Employees employee1 = new Employees(1, "Ankita", "Pabbi", 2111187596,
                            "erankitapabbi@gmail.com", 01, 1000000, s1);
                    Employees employee2 = new Employees(2, "Udhay", "Mahajan", 2145879636,
                            "udhay@gmail.com", 02, 200000, s1);
                    Employees employee3 = new Employees(3, "Ujwal", "Arora", 2136547895,
                            "ujwal@gmail.com", 03, 10000, s1);
                    Employees employee4 = new Employees(4, "Netra", "Dhariyal", 2117859656,
                            "netra@gmail.com", 04, 35000, s1);
                    Employees employee5 = new Employees(5, "Vishal", "Pabbi", 211369897,
                            "vishal@gmail.com", 05, 500000, s1);

                    EmployeeSingleton.getInstance().addEmployee(employee1);
                    EmployeeSingleton.getInstance().addEmployee(employee2);
                    EmployeeSingleton.getInstance().addEmployee(employee3);
                    EmployeeSingleton.getInstance().addEmployee(employee4);
                    EmployeeSingleton.getInstance().addEmployee(employee5);

                    System.out.println("Enter the Employee Id : (1,2,3,4,5)");
                    int employee_id = scanner.nextInt();

                    Employees tempPerson = EmployeeSingleton.getInstance().getEmployeeByID(employee_id);
                    if (tempPerson != null) {
                        System.out.println("------------Employee Data------------");
                        System.out.println(tempPerson.toString());
                    } else {
                        System.out.println("Record not found!!!");
                    }
                    System.out.println("----------------------------------------");
                    break;
                }
                case 2:{
                    Customers customer1 = new Customers(6,"Diksha","Sharma",23111111,
                            "diksha1@gmail.com",s1,"Keeler Blvd",1);
                    Customers customer2 = new Customers(7,"Roshni","Kapoor",1231158111,
                            "roshni@gmail.com",s1,"Shorting Road",2);
                    Customers customer3 = new Customers(8,"Irban","Kaur",32578954,
                            "irban@gmail.com",s1,"Millner AV",3);
                    Customers customer4 = new Customers(9,"Lavish","Khullar",845213697,
                            "lavishkhullar@gmail.com",s1,"Brain Drive",4);
                    Customers customer5 = new Customers(10,"Ritik","Arora",754811111,
                            "ritik@gmail.com",s1,"Neilson Road",5);

                    CustomerSingleton.getInstance().addCustomer(customer1);
                    CustomerSingleton.getInstance().addCustomer(customer2);
                    CustomerSingleton.getInstance().addCustomer(customer3);
                    CustomerSingleton.getInstance().addCustomer(customer4);
                    CustomerSingleton.getInstance().addCustomer(customer5);

                    System.out.println("Enter the Customer Id : (1,2,3,4,5)");
                    int customer_id = scanner.nextInt();

                    Customers tempPerson = CustomerSingleton.getInstance().getCustomerByID(customer_id);
                    if (tempPerson != null) {
                        System.out.println("------------Customer Data------------");
                        System.out.println(tempPerson.toString());
                    } else {
                        System.out.println("Record not found!!!");
                    }
                    System.out.println("----------------------------------------");
                    break;
                }
                case 3:{
                    System.out.println("WE Mainly Provide 4 Memberships");
                    System.out.println("---------------------------------------");
                    System.out.println("SILVER");
                    int price = silver.silver_price;
                    System.out.println("Price Of Membership : " + price);
                    System.out.println("=======================================");
                    System.out.println("Facilities With Respective Membership :");
                    System.out.println("=======================================");
                    silver.gymnasium();

                    System.out.println("---------------------------------------");
                    System.out.println("GOLD");
                    int price1 = gold.gold_price;
                    System.out.println("Price Of Membership : " + price);
                    System.out.println("=======================================");
                    System.out.println("Facilities With Respective Membership :");
                    System.out.println("=======================================");
                    gold.gymnasium();
                    gold.cardio();

                    System.out.println("---------------------------------------");
                    System.out.println("PLATINUM");
                    int price2 = platinum.platinum_price;
                    System.out.println("Price Of Membership : " + price);
                    System.out.println("=======================================");
                    System.out.println("Facilities With Respective Membership :");
                    System.out.println("=======================================");
                    platinum.gymnasium();
                    platinum.cardio();
                    platinum.sona();

                    System.out.println("---------------------------------------");
                    System.out.println("DIAMOND");
                    int price3 = diamond.diamond_price;
                    System.out.println("Price Of Membership : " + price);
                    System.out.println("=======================================");
                    System.out.println("Facilities With Respective Membership :");
                    System.out.println("=======================================");
                    diamond.gymnasium();
                    diamond.cardio();
                    diamond.sona();
                    diamond.swimmingPool();

                }
                case 4:{

                    System.out.println("Customers enrolled:");
                    System.out.println("----------------------------------------------------");
                    //-------------------------------------------
                    Customers customer1 = new Customers(6,"Diksha","Sharma",23111111,
                            "diksha1@gmail.com",s1,"Keeler Blvd",1);
                    Customers customer2 = new Customers(7,"Roshni","Kapoor",1231158111,
                            "roshni@gmail.com",s1,"Shorting Road",2);
                    Customers customer3 = new Customers(8,"Irban","Kaur",32578954,
                            "irban@gmail.com",s1,"Millner AV",3);
                    Customers customer4 = new Customers(9,"Lavish","Khullar",845213697,
                            "lavishkhullar@gmail.com",s1,"Brain Drive",4);
                    Customers customer5 = new Customers(10,"Ritik","Arora",754811111,
                            "ritik@gmail.com",s1,"Neilson Road",5);

                    CustomerSingleton.getInstance().addCustomer(customer1);
                    CustomerSingleton.getInstance().addCustomer(customer2);
                    CustomerSingleton.getInstance().addCustomer(customer3);
                    CustomerSingleton.getInstance().addCustomer(customer4);
                    CustomerSingleton.getInstance().addCustomer(customer5);
                    //-------------------------------------------

                   for(int i =1 ;i<=5;i++){
                       System.out.println(CustomerSingleton.getInstance().getCustomerByID(i)+"\n");
                   }
                    break;
                }
                case 5:{
                    System.out.println("Our Employees :");
                    System.out.println("----------------------------------------------------");
                    //-----------------------------------------------------------------------

                    Employees employee1 = new Employees(1, "Ankita", "Pabbi", 2111187596,
                            "erankitapabbi@gmail.com", 01, 1000000, s1);
                    Employees employee2 = new Employees(2, "Udhay", "Mahajan", 2145879636,
                            "udhay@gmail.com", 02, 200000, s1);
                    Employees employee3 = new Employees(3, "Ujwal", "Arora", 2136547895,
                            "ujwal@gmail.com", 03, 10000, s1);
                    Employees employee4 = new Employees(4, "Netra", "Dhariyal", 2117859656,
                            "netra@gmail.com", 04, 35000, s1);
                    Employees employee5 = new Employees(5, "Vishal", "Pabbi", 211369897,
                            "vishal@gmail.com", 05, 500000, s1);

                    EmployeeSingleton.getInstance().addEmployee(employee1);
                    EmployeeSingleton.getInstance().addEmployee(employee2);
                    EmployeeSingleton.getInstance().addEmployee(employee3);
                    EmployeeSingleton.getInstance().addEmployee(employee4);
                    EmployeeSingleton.getInstance().addEmployee(employee5);
                    //-----------------------------------------------------------------------------
                    for(int i =1 ;i<=5;i++){
                        System.out.println(EmployeeSingleton.getInstance().getEmployeeByID(i)+"\n");
                    }
                    break;
                }
                default:{
                    System.out.println("Wrong Choice !!! Please try again");
                }
            }

        }else {

//----------------------------------------------------------------------------------------------------------------
            System.out.println("Enter the Type of User (Employee/Customer)");
            String userType = scanner.next();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (userType.equals("Employee")) {
                System.out.println("------------Employee Data------------");
                person.setPerson_id(1);
                person.setPerson_contact(2145129248);
                person.setPerson_first_name("Udhay");
                person.setPerson_second_name("Mahajan");
                person.setPerson_email("udhaymahajan0@gmail.com");

                person.display();

                SimpleDateFormat sdf = new SimpleDateFormat("dd-m-yyyy hh:mm:ss");
                String empDate = "31-08-1982 10:20:56";


                try {
                     s1 = sdf.parse(empDate);
                    employees.setJoining_date(s1);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                employees.setEmployee_salary(1000000);
                employees.display();

            } else if (userType.equals("Customer")) {
                System.out.println("------------Customer Data------------");
                person.setPerson_contact(2146658971);
                person.setPerson_first_name("Ankita");
                person.setPerson_second_name("Pabbi");
                person.setPerson_email("erankitapabbi@gmail.com");
                person.display();
                //-----------------------Member Ship Details ----------------------------
                SimpleDateFormat sdf = new SimpleDateFormat("dd-m-yyyy hh:mm:ss");
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

                switch (membershipNumber) {
                    case 1: {
                        int price = silver.silver_price;
                        System.out.println("Price Of Membership : " + price);
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
                    case 2: {
                        int price = gold.gold_price;
                        System.out.println("Price Of Membership : " + price);
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
                    case 3: {
                        int price = platinum.platinum_price;
                        System.out.println("Price Of Membership : " + price);
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
                    case 4: {
                        int price = diamond.diamond_price;
                        System.out.println("Price Of Membership : " + price);
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

                SimpleDateFormat sdf3 = new SimpleDateFormat("dd-m-yyyy hh:mm:ss");
                String dateJoin = "31-08-1982 10:20:56";

                try {
                    Date s1 = sdf3.parse(dateJoin);
                    customers.setCustomer_date_joined(s1);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
//            SimpleDateFormat sdf1= new SimpleDateFormat("dd-m-yyyy hh:mm:ss");
//            String dateJoin = "31-08-1982 10:20:56";
//            customers.setCustomer_date_joined(dateJoin);
                customers.display();


            }
//----------------------------------------------------------------------------------------------------------------
        }
    }
}
