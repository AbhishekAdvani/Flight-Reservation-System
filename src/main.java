

public class main {

    private int Contact;
    private String Address;
    private String RegularTicket;
    private String TouristTicket;
    private int Flight;
    

    public main(int fn, String o, String ds, String dp, int c) {
        if (ds.equals(o) == true) {
            throw new IllegalArgumentException("RegularTicket and origin are the same");
        }
        Contact = fn;
        Address = o;
        RegularTicket = ds;
        TouristTicket = dp;
        Flight = c;
       
    }

    

  
    public String ()getAddress {
        return Address;
    }

    public String getRegularTicket() {
        return RegularTicket;
    }

    public String getTouristTicket() {
        return TouristTicket;
    }

    public int getContact() {
        return Contact;
    }

    

    public int getFlight() {
        return Flight;
    }

    public void setPrice(double p) {
        originalPrice = p;
    }

    public void setAddress(String o) {
        Address = o;
    }

    public void setRegularTicket(String d) {
        RegularTicket = d;
    }

    public void setTouristTicket(String d) {
        TouristTicket = d;
    }

    public void setContact(int fn) {
        Contact = fn;
    }

    public void setNumberOfSeatsleft(int s) {
        numberOfSeatsleft = s;
    }

    public void setFlight(int c) {
        Flight = c;
    }

    @Override
    public String toString() {
        String one = "Flight " + Contact;
        String two = "," + Address + " to " + RegularTicket;
        String three = "," + TouristTicket;
        String four = ", original price: " + originalPrice + "$";
        return one + two + three + four;
    }

}