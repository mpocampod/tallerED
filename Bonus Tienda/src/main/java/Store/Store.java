package Store;

import java.util.LinkedList;
import java.util.Queue;

public class Store {

    private Queue<Customer> customerList;

    public Store() {
        customerList = new LinkedList();
    }

    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    public void serveCustomers(){

        for (int i = customerList.size(); i > 0; i--) {
            System.out.println("Estas atendiendo el " + customerList.element().showCustomerData());
            customerList.remove();
        }
    }

    public boolean isEmpty(){
        return customerList.isEmpty();
    }

    public int generateTicket(){
        return customerList.size() + 1;
    }


}
