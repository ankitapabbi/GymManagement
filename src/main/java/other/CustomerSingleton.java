package other;

import gym.Customers;

import java.util.ArrayList;

public class CustomerSingleton {
    private static CustomerSingleton obj;
    private ArrayList<Customers> customersArrayList = new ArrayList<>();

    public CustomerSingleton() {
        this.customersArrayList = customersArrayList;
    }
    public static CustomerSingleton getInstance()
    {
        if(obj == null)
        {
            obj = new CustomerSingleton();
        }

        return obj;
    }
    public void addCustomer(Customers customers)
    {
        if( customers != null) {
            customersArrayList.add(customers);

            // studentHashMap.put(student.getStudentId(), student);
        }
    }
    public Customers getCustomerByID(int id)
    {
        for(Customers s : customersArrayList)
        {
            if(s.getCustomer_id() == id)
            {
                return s;
            }
        }

        return null;
    }
    public Customers getCustomers()
    {

        for(Customers s : customersArrayList)
        {
             System.out.println(customersArrayList+"\n");
        }


        return null;
    }
}
