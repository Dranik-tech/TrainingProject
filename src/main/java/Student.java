import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Student {
    private int id;
    private String secondName;
    private String firstName;
    private String surname;
    private Calendar dateOfBirth;
    private String address;
    private String phone;
    private String faculty;
    private byte course;
    private String groupName;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }

    public void setDateOfBirth(Calendar dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public Calendar getDateOfBirth(){
        return  dateOfBirth;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getPhone(){
        return phone;
    }

    public void setFaculty(String faculty){
        this.faculty = faculty;
    }

    public String getFaculty(){
        return faculty;
    }

    public void setCourse(byte course) {
        this.course = course;
    }

    public short getCourse(){
        return this.course;
    }

    public void setGroupName(String groupName){
        this.groupName = groupName;
    }

    public String getGroupName(){
        return groupName;
    }

    public String toString(){
        String infoAboutStudent = this.id + " " + this.surname + " " + this.firstName + " " + this.secondName +
                " " + this.dateOfBirth.get(Calendar.YEAR) + "/" + this.dateOfBirth.get(Calendar.MONTH) + "/" + this.dateOfBirth.get(Calendar.DATE) + " " + this.phone + " " + this.address + " " +
                this.faculty + " " + this.course +  " " + this.groupName;

        return infoAboutStudent;
    }

    public Student(int id,String secondName, String firstName, String surname){

        this.id = id;
        this.secondName = secondName;
        this.firstName = firstName;
        this.surname = surname;

    }

    public Student(int id,String secondName, String firstName, String surname, Calendar dateOfBirth) {
        this.id = id;
        this.secondName = secondName;
        this.firstName = firstName;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public Student(int id,String secondName, String firstName, String surname, Calendar dateOfBirth, String address, String phone, String faculty, byte course, String groupName) {
        this.id = id;
        this.secondName = secondName;
        this.firstName = firstName;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.groupName = groupName;
    }
}
