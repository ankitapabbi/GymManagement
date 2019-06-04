package other;

import gym.Employees;

import java.util.ArrayList;

public class EmployeeSingleton {
    private static EmployeeSingleton obj;
    private ArrayList<Employees> employeesArrayList = new ArrayList<>();

    public EmployeeSingleton() {
        this.employeesArrayList = employeesArrayList;
    }
    public static EmployeeSingleton getInstance()
    {
        if(obj == null)
        {
            obj = new EmployeeSingleton();
        }

        return obj;
    }
    public void addEmployee(Employees employees)
    {
        if( employees != null) {
            employeesArrayList.add(employees);

            // studentHashMap.put(student.getStudentId(), student);
        }
    }
    public Employees getEmployeeByID(int id)
    {
        for(Employees s : employeesArrayList)
        {
            if(s.getEmployee_id() == id)
            {
                return s;
            }
        }

        return null;
    }
}
