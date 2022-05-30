import java.util.ArrayList;

public class CustomerManager {

    public ArrayList<Customer> createCustomers(){
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer(1,"Korol","Andrey","Anayolevich","Aviatsionnaya 13","12345","12345"));
        customers.add(new Customer(1,"Aliseenko","Dima","Anayolevich","Aviatsionnaya 10","45678","11112"));
        customers.add(new Customer(1,"Rijikov","Kostya","Anayolevich","Aviatsionnaya 1","87962","11122"));
        customers.add(new Customer(1,"Korol","Kostya","Anayolevich","Aviatsionnaya 19","87963","11123"));

        return customers;
    }

    public void sortByLastName(ArrayList<Customer> customers){
        ArrayList<Customer> sortedCustomers = new ArrayList<Customer>();

        String buff = "";
        boolean isSorted = false;

        while(!isSorted){
            isSorted = true;
            for(int i = 0; i < customers.size()-1;i++){
                if(customers.get(i).getLastName().compareToIgnoreCase(customers.get(i+1).getLastName()) > 0){
                    isSorted = false;
                    buff = customers.get(i).getLastName();
                    customers.get(i).setLastName(customers.get(i+1).getLastName());
                    customers.get(i+1).setLastName(buff);
                }
            }
        }

        for(Customer customer : customers){
            System.out.println(customer.toString());
        }

    }

    public void sortByCCPart(ArrayList<Customer> customers,String ccPart) {
        ArrayList<Customer> customersHaveCCPart = new ArrayList<>();

        for(Customer customer : customers){
            String ccNumber = customer.getCcNumber();
           if (ccNumber.contains(ccPart)) customersHaveCCPart.add(customer);
        }

        for(Customer customer : customersHaveCCPart){
            System.out.println(customer.toString());
        }
    }
}
