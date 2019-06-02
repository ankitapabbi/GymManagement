package gym;

import java.util.Date;

public class Customers {
    private Date customer_date_joined;
    private String customer_address;

    public Date getCustomer_date_joined() {
        return customer_date_joined;
    }

    public void setCustomer_date_joined(Date customer_date_joined) {
        this.customer_date_joined = customer_date_joined;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }
}
