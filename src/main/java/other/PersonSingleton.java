package other;

import gym.Person;

import java.util.ArrayList;

public class PersonSingleton {
    private static PersonSingleton obj;
    private ArrayList<Person> personArrayList = new ArrayList<>();

    public PersonSingleton() {
        this.personArrayList = personArrayList;
    }

    public static PersonSingleton getInstance()
    {
        if(obj == null)
        {
            obj = new PersonSingleton();
        }

        return obj;
    }
    public void addPerson(Person person)
    {
        if( person != null) {
            personArrayList.add(person);

           // studentHashMap.put(student.getStudentId(), student);
        }
    }
    public Person getStudentByID(int id)
    {
        for(Person s : personArrayList)
        {
            //if(s.getFirstName().equals("Parag"))
            if(s.getPerson_id() == id)
            {
                return s;
            }
        }

        return null;
    }

}
