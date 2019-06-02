package gym;

import other.IDisplay;

public class Person implements IDisplay {
    private int person_id;
    private String person_first_name;
    private String person_second_name;
    private int person_contact;
    private String person_email;

    //-----------------------------getters and setters--------------------------------
    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public String getPerson_first_name() {
        return person_first_name;
    }

    public void setPerson_first_name(String person_first_name) {
        this.person_first_name = person_first_name;
    }

    public String getPerson_second_name() {
        return person_second_name;
    }

    public void setPerson_second_name(String person_second_name) {
        this.person_second_name = person_second_name;
    }

    public int getPerson_contact() {
        return person_contact;
    }

    public void setPerson_contact(int person_contact) {
        this.person_contact = person_contact;
    }

    public String getPerson_email() {
        return person_email;
    }

    public void setPerson_email(String person_email) {
        this.person_email = person_email;
    }
    //-----------------------------------------------------------------------
    public void contactInfo(){

    }
    public void full_name(){

    }

    @Override
    public void display() {

    }
}
