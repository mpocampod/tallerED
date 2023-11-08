package Store;

public class Customer {

    private String name;
    private int ticketNumber;


    public Customer(String name, int ticketNumber) {
        this.name = name;
        this.ticketNumber = ticketNumber;
    }

    public String showCustomerData(){
        return "número de ticket " + this.ticketNumber + " del cliente " + this.name;
    }





}
