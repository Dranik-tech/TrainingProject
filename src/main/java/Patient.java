import java.util.Objects;

public class Patient {
    private int id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String address;
    private String phone;
    private int medicalCardNumber;
    private String diagnosis;

    public Patient(){

    }

    public Patient(int id){
        setId(id);
    }

    public Patient(int id, String firstName,String lastName,String middleName){
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setMiddleName(middleName);
    }

    public Patient(int id, String firstName,String lastName,String middleName, String address,String phone,int medicalCardNumber,String diagnosis){
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setMiddleName(middleName);
        setAddress(address);
        setPhone(phone);
        setMedicalCardNumber(medicalCardNumber);
        setDiagnosis(diagnosis);
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String getLastName(){
        return this.lastName;
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

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getPhone(){
        return this.phone;
    }

    public void setMedicalCardNumber(int medicalCardNumber){
        this.medicalCardNumber = medicalCardNumber;
    }

    public int getMedicalCardNumber(){
        return this.medicalCardNumber;
    }

    public void setDiagnosis(String diagnosis){
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis(){
        return this.diagnosis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return id == patient.id && Objects.equals(firstName, patient.firstName) && Objects.equals(lastName, patient.lastName) && Objects.equals(middleName, patient.middleName) && Objects.equals(address, patient.address) && Objects.equals(phone, patient.phone) && Objects.equals(medicalCardNumber, patient.medicalCardNumber) && Objects.equals(diagnosis, patient.diagnosis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, middleName, address, phone, medicalCardNumber, diagnosis);
    }

    @Override
    public String toString() {
        return "Patient is: " +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", medicalCardNumber='" + medicalCardNumber + '\'' +
                ", diagnosis='" + diagnosis + '\'';
    }
}
