import java.util.Objects;

public class Customer {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private  String address;
    private String ccNumber;
    private String accountNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }

    public String getMiddleName(){
        return this.middleName;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return this.address;
    }

    public void setCcNumber(String ccNumber){
        this.ccNumber = ccNumber;
    }

    public String getCcNumber(){
         return this.ccNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && lastName.equals(customer.lastName) && firstName.equals(customer.firstName) && middleName.equals(customer.middleName) && address.equals(customer.address) && ccNumber.equals(customer.ccNumber) && accountNumber.equals(customer.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, firstName, middleName, address, ccNumber, accountNumber);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", ccNumber='" + ccNumber + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }

    public Customer(int id) {
        this.id = id;
    }

    public Customer(int id, String lastName, String firstName, String middleName, String address, String ccNumber, String accountNumber) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.ccNumber = ccNumber;
        this.accountNumber = accountNumber;
    }
}
