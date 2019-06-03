package facilities;


import gym.Employees;
import other.IDisplay;

import java.util.Date;
import java.sql.Time;

public class Memberships implements IDisplay  {
    private Date start_date;
    private Date end_date;

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    @Override
    public void display() {
        System.out.println("Membership Start Date : "+this.getStart_date());
        System.out.println("Membership End Date : "+this.getEnd_date());

    }
}
